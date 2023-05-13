package com.example.calculatorkotlin

class Computation {

    companion object {
        fun separateOperandAndOperator(string: String): MutableList<MutableList<String>> {
            val operand = mutableListOf<String>()
            val operator = mutableListOf<String>()
            val specialChar = listOf("+", "—", "/", "(", ")", "x")
            val digit = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
            val indicesOperator = mutableListOf<Int>()
            val predicateSpecialChar: (Char) -> Boolean = { specialChar.contains(it.toString()) }
            val predicateDigit: (Char) -> Boolean = { digit.contains(it.toString()) }

            if (string.isEmpty()) {
                return mutableListOf(mutableListOf<String>(), mutableListOf<String>())
            }

            if (!string.any(predicateSpecialChar)) {
                return mutableListOf(mutableListOf(string), mutableListOf<String>())
            }

            if (!string.any(predicateDigit)) {
                return mutableListOf(mutableListOf(), mutableListOf(string))
            }

            for (i in string.indices) {
                if (specialChar.contains(string[i].toString())) {
                    indicesOperator.add(i)
                    operator.add(string[i].toString())
                }

            }

            for (i in 0 until indicesOperator.size - 1) {
                if (indicesOperator[i] + 1 != indicesOperator[i + 1]) {
                    operand.add(string.substring(indicesOperator[i] + 1 until indicesOperator[i + 1]))
                }
            }
            if (indicesOperator.last() < string.length - 1) {
                operand.add(string.substring(indicesOperator.last() + 1 until string.length))
            }

            if (indicesOperator.first() > 0) {
                operand.add(0, string.substring(0 until indicesOperator.first()))
            }
            return mutableListOf(operand, operator)
        }


        private fun reduceOperandAndOperator(
            operand: MutableList<Double>,
            operator: MutableList<String>
        ): MutableList<Any> {
            val list1 = mutableListOf<Double>()
            val list2 = mutableListOf<String>()
            if (operand.size<=1 ) {
                return mutableListOf(operand,operator)
            }

            var j = 0
            if (operand.size == 0 && operator.size == 0) {
                return mutableListOf(mutableListOf<Double>(), mutableListOf<String>())
            }

            if (operator.size == 0) {
                return mutableListOf(operand, mutableListOf<String>())
            }

            if (operand.size == 0) {
                return mutableListOf(mutableListOf<Double>(), operator)
            }


            do {
                if (operator[j] == "+" || operator[j] == "—") {
                    list1.add(operand[j])
                    list2.add(operator[j])
                    j += 1
                } else if (operator[j] == "x") {
                    var i = j
                    var product = operand[j]
                    while (i < operator.size && operator[i] == "x") {
                        product *= operand[i + 1]
                        j = ++i + 1

                    }


                    list1.add(product)
                    if (j - 1 < operator.size)
                        list2.add(operator[j - 1])

                } else if (operator[j] == "/") {
                    list1.add(operand[j] / operand[j + 1])
                    if (j <= operator.size - 2) {
                        list2.add(operator[j + 1])
                    }
                    j += 2
                }

            } while (j < operand.size - 1)

            if (operator[operator.size - 1] == "+" || operator[operator.size - 1] == "—") list1.add(
                operand.last()
            )

            return mutableListOf(list1, list2)
        }


        private fun sum(operand: MutableList<Double>, operator: MutableList<String>): Double {

            if (operand.size == 0) {
                return 0.0
            }
            if (operand.size == 1) {
                return operand[0]
            }

            var sum = operand[0]
            for (i in operator.indices) {
                if (operator[i] == "+") {
                    sum += operand[i + 1]
                } else if (operator[i] == "—") {
                    sum -= operand[i + 1]
                }
            }

            return sum

        }

        fun evaluateExpression(string: String): Double {

            var string = string
            if (string.isEmpty()) {
                return 0.0
            }


            if (separateOperandAndOperator(string)[0].size==1) {
                return separateOperandAndOperator(string)[0][0].toDouble()
            }




            val operand0 = separateOperandAndOperator(string)[0].map { it.toDouble() } as MutableList<Double>
            val operator0 = separateOperandAndOperator(string)[1]
            val operand = reduceOperandAndOperator(operand0, operator0)[0] as MutableList<Double>
            val operator = reduceOperandAndOperator(operand0, operator0)[1] as MutableList<String>


            return sum(operand, operator)
        }


    }

}

