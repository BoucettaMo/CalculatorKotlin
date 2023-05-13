package com.example.calculatorkotlin

import android.widget.TextView

class ConversionMass(private val units:Array<String>) {
    private fun gramKilogram(g: Double) = 0.001 * g
    private fun kilogramGram(k: Double) = 1000.0 * k
    private fun gramPound(g: Double) = 0.0022046226218488 * g
    private fun poundGram(p: Double) = 453.59237  * p
    private fun gramOunce(g: Double) = 0.03527396194958 * g
    private fun ounceGram(o: Double) = 28.349523125 * o
    private fun gramQuintal(g: Double) = 1.0/100000.0  * g
    private fun quintalGram(q: Double) = 100000.0 * q
    private fun gramTonne(g: Double) = 1.0/1000000.0 * g
    private fun tonneGram(t: Double) = 1000000.0 * t
    private fun kilogramPound(k: Double) = 2.2046226218488 * k
    private fun poundKilogram(p: Double) = 0.45359237  * p
    private fun kilogramOunce(k: Double) = 35.27396194958 * k
    private fun ounceKilogram(o: Double) = 0.028349523125 * o
    private fun kilogramQuintal(k: Double) = 0.01 * k
    private fun quintalKilogram(q: Double) = 100.0 * q
    private fun kilogramTonne(k: Double) = 0.001 * k
    private fun tonneKilogram(t: Double) = 1000.0 * t

    private fun poundOunce(p: Double) = 16 * p
    private fun ouncePound(o: Double) = 0.0625 * o
    private fun poundQuintal(p: Double) = 0.0045359237 * p
    private fun quintalPound(q: Double) = 220.46226218488*q
    private fun poundTonne(p: Double) = 0.00045359237 * p
    private fun tonnePound(t: Double) = 2204.6226218488 * t

    private fun ounceQuintal(o: Double) = 0.00028349523125 * o
    private fun quintalOunce(q: Double) = 3527.396194958  * q
    private fun ounceTonne(o: Double) = 2.8349523125/100000.0  * o
    private fun tonneOunce(t: Double) = 35273.96  * t
    private fun quintalTonne(q: Double) = 0.1 * q
    private fun tonneQuintal(t: Double) = 10.0 * t


    fun conversion(
        selected1: String,
        selected2: String,
        textView1: TextView,
        textView2: TextView,
        isUp: Boolean,
        text: String
    ) {
        when (isUp) {
            true -> {
                if (selected1 == selected2) {
                    textView1.text = text
                    textView2.text = text
                }
                when (Pair(selected1, selected2)) {
                    Pair(units[0], units[1]) -> {
                        textView1.text = text
                        textView2.text = (gramKilogram(text.toDouble())).toString()
                    }

                    Pair(units[1], units[0]) -> {
                        textView1.text = text
                        textView2.text = (kilogramGram(text.toDouble())).toString()
                    }

                    Pair(units[0], units[2]) -> {
                        textView1.text = text
                        textView2.text = (gramPound(text.toDouble())).toString()
                    }

                    Pair(units[2], units[0]) -> {
                        textView1.text = text
                        textView2.text = (poundGram(text.toDouble())).toString()
                    }

                    Pair(units[0], units[3]) -> {
                        textView1.text = text
                        textView2.text = (gramOunce(text.toDouble())).toString()
                    }

                    Pair(units[3], units[0]) -> {
                        textView1.text = text
                        textView2.text = (ounceGram(text.toDouble())).toString()
                    }

                    Pair(units[0], units[4]) -> {
                        textView1.text = text
                        textView2.text = (gramQuintal(text.toDouble())).toString()
                    }

                    Pair(units[4], units[0]) -> {
                        textView1.text = text
                        textView2.text = (quintalGram(text.toDouble())).toString()
                    }

                    Pair(units[0], units[5]) -> {
                        textView1.text = text
                        textView2.text = (gramTonne(text.toDouble())).toString()
                    }

                    Pair(units[5], units[0]) -> {
                        textView1.text = text
                        textView2.text = (tonneGram(text.toDouble())).toString()
                    }


                    Pair(units[1], units[2]) -> {
                        textView1.text = text
                        textView2.text = (kilogramPound(text.toDouble())).toString()
                    }

                    Pair(units[2], units[1]) -> {
                        textView1.text = text
                        textView2.text = (poundKilogram(text.toDouble())).toString()
                    }

                    Pair(units[1], units[3]) -> {
                        textView1.text = text
                        textView2.text = (kilogramOunce(text.toDouble())).toString()
                    }

                    Pair(units[3], units[1]) -> {
                        textView1.text = text
                        textView2.text = (ounceKilogram(text.toDouble())).toString()
                    }

                    Pair(units[1], units[4]) -> {
                        textView1.text = text
                        textView2.text = (kilogramQuintal(text.toDouble())).toString()
                    }

                    Pair(units[4], units[1]) -> {
                        textView1.text = text
                        textView2.text = (quintalKilogram(text.toDouble())).toString()
                    }

                    Pair(units[1], units[5]) -> {
                        textView1.text = text
                        textView2.text = (kilogramTonne(text.toDouble())).toString()
                    }

                    Pair(units[5], units[1]) -> {
                        textView1.text = text
                        textView2.text = (tonneKilogram(text.toDouble())).toString()
                    }

                    Pair(units[2], units[3]) -> {
                        textView1.text = text
                        textView2.text = (poundOunce(text.toDouble())).toString()
                    }

                    Pair(units[3], units[2]) -> {
                        textView1.text = text
                        textView2.text = (ouncePound(text.toDouble())).toString()
                    }

                    Pair(units[2], units[4]) -> {
                        textView1.text = text
                        textView2.text = (poundQuintal(text.toDouble())).toString()
                    }

                    Pair(units[4], units[2]) -> {
                        textView1.text = text
                        textView2.text = (quintalPound(text.toDouble())).toString()
                    }

                    Pair(units[2], units[5]) -> {
                        textView1.text = text
                        textView2.text = (poundTonne(text.toDouble())).toString()
                    }

                    Pair(units[5], units[2]) -> {
                        textView1.text = text
                        textView2.text = (tonnePound(text.toDouble())).toString()
                    }

                    Pair(units[3], units[4]) -> {
                        textView1.text = text
                        textView2.text = (ounceQuintal(text.toDouble())).toString()
                    }

                    Pair(units[4], units[3]) -> {
                        textView1.text = text
                        textView2.text = (quintalOunce(text.toDouble())).toString()
                    }

                    Pair(units[3], units[5]) -> {
                        textView1.text = text
                        textView2.text = (ounceTonne(text.toDouble())).toString()
                    }

                    Pair(units[5], units[3]) -> {
                        textView1.text = text
                        textView2.text = (tonneOunce(text.toDouble())).toString()
                    }

                    Pair(units[4], units[5]) -> {
                        textView1.text = text
                        textView2.text = (quintalTonne(text.toDouble())).toString()
                    }

                    Pair(units[5], units[4]) -> {
                        textView1.text = text
                        textView2.text = (tonneQuintal(text.toDouble())).toString()
                    }

                }
            }

            false -> {
                if (selected1 == selected2) {
                    textView1.text = text
                    textView2.text = text
                }
                when (Pair(selected1, selected2)) {
                    Pair(units[1], units[0]) -> {
                        textView2.text = text
                        textView1.text = (gramKilogram(text.toDouble())).toString()
                    }

                    Pair(units[0], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kilogramGram(text.toDouble())).toString()
                    }

                    Pair(units[2], units[0]) -> {
                        textView2.text = text
                        textView1.text = (gramPound(text.toDouble())).toString()
                    }

                    Pair(units[0], units[2]) -> {
                        textView2.text = text
                        textView1.text = (poundGram(text.toDouble())).toString()
                    }

                    Pair(units[3], units[0]) -> {
                        textView2.text = text
                        textView1.text = (gramOunce(text.toDouble())).toString()
                    }

                    Pair(units[0], units[3]) -> {
                        textView2.text = text
                        textView1.text = (ounceGram(text.toDouble())).toString()
                    }

                    Pair(units[4], units[0]) -> {
                        textView2.text = text
                        textView1.text = (gramQuintal(text.toDouble())).toString()
                    }

                    Pair(units[0], units[4]) -> {
                        textView2.text = text
                        textView1.text = (quintalGram(text.toDouble())).toString()
                    }

                    Pair(units[5], units[0]) -> {
                        textView2.text = text
                        textView1.text = (gramTonne(text.toDouble())).toString()
                    }

                    Pair(units[0], units[5]) -> {
                        textView2.text = text
                        textView1.text = (tonneGram(text.toDouble())).toString()
                    }


                    Pair(units[2], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kilogramPound(text.toDouble())).toString()
                    }

                    Pair(units[1], units[2]) -> {
                        textView2.text = text
                        textView1.text = (poundKilogram(text.toDouble())).toString()
                    }

                    Pair(units[3], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kilogramOunce(text.toDouble())).toString()
                    }

                    Pair(units[1], units[3]) -> {
                        textView2.text = text
                        textView1.text = (ounceKilogram(text.toDouble())).toString()
                    }

                    Pair(units[4], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kilogramQuintal(text.toDouble())).toString()
                    }

                    Pair(units[1], units[4]) -> {
                        textView2.text = text
                        textView1.text = (quintalKilogram(text.toDouble())).toString()
                    }

                    Pair(units[5], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kilogramTonne(text.toDouble())).toString()
                    }

                    Pair(units[1], units[5]) -> {
                        textView2.text = text
                        textView1.text = (tonneKilogram(text.toDouble())).toString()
                    }

                    Pair(units[3], units[2]) -> {
                        textView2.text = text
                        textView1.text = (poundOunce(text.toDouble())).toString()
                    }

                    Pair(units[2], units[3]) -> {
                        textView2.text = text
                        textView1.text = (ouncePound(text.toDouble())).toString()
                    }

                    Pair(units[4], units[2]) -> {
                        textView2.text = text
                        textView1.text = (poundQuintal(text.toDouble())).toString()
                    }

                    Pair(units[2], units[4]) -> {
                        textView2.text = text
                        textView1.text = (quintalPound(text.toDouble())).toString()
                    }

                    Pair(units[5], units[2]) -> {
                        textView2.text = text
                        textView1.text = (poundTonne(text.toDouble())).toString()
                    }

                    Pair(units[2], units[5]) -> {
                        textView2.text = text
                        textView1.text = (tonnePound(text.toDouble())).toString()
                    }

                    Pair(units[4], units[3]) -> {
                        textView2.text = text
                        textView1.text = (ounceQuintal(text.toDouble())).toString()
                    }

                    Pair(units[3], units[4]) -> {
                        textView2.text = text
                        textView1.text = (quintalOunce(text.toDouble())).toString()
                    }

                    Pair(units[5], units[3]) -> {
                        textView2.text = text
                        textView1.text = (ounceTonne(text.toDouble())).toString()
                    }

                    Pair(units[3], units[5]) -> {
                        textView2.text = text
                        textView1.text = (tonneOunce(text.toDouble())).toString()
                    }

                    Pair(units[5], units[4]) -> {
                        textView2.text = text
                        textView1.text = (quintalTonne(text.toDouble())).toString()
                    }

                    Pair(units[4], units[5]) -> {
                        textView2.text = text
                        textView1.text = (tonneQuintal(text.toDouble())).toString()
                    }

                }
            }
        }
    }


}
