package com.example.calculatorkotlin

import android.widget.TextView

class ConversionVolume(private val units:Array<String>) {

    private fun literKiloliter(l: Double) = 0.001 * l
    private fun kiloliterLiter(k: Double) = 1000.0 * k
    private fun literOunce(l: Double) = 33.814022701843 * l
    private fun ounceLiter(o: Double) = 0.0295735295625 * o
    private fun literPint(l: Double) = 2.1133764188652  * l
    private fun pintLiter(p: Double) = 0.473176473 * p
    private fun literQuart(l: Double) = 1.0566882094326   * l
    private fun quartLiter(q: Double) = 0.946352946 * q
    private fun literGallon(l: Double) = 0.26417205235815  * l
    private fun gallonLiter(g: Double) = 3.785411784 * g
    private fun kiloliterOunce(k: Double) = 3.381402*10000.0  * k
    private fun ounceKiloliter(o: Double) = 2.95735295625/100000.0  * o
    private fun kiloliterPint(k: Double) = 2113.3764188652 * k
    private fun pintKiloliter(p: Double) = 0.000473176473 * p
    private fun kiloliterQuart(k: Double) = 1056.6882094326 * k
    private fun quartKiloliter(q: Double) = 0.00094635294 * q
    private fun kiloliterGallon(k: Double) = 264.17205235815 * k
    private fun gallonKiloliter(g: Double) = 0.003785411784 * g

    private fun ouncePint(o: Double) = 0.0625 * o
    private fun pintOunce(p: Double) = 16 * p
    private fun ounceQuart(o: Double) = 0.03125 * o
    private fun quartOunce(q: Double) = 32* q
    private fun ounceGallon(o: Double) = 0.0078125 * o
    private fun gallonOunce(g: Double) = 128 * g

    private fun pintQuart(p: Double) = 0.5 * p
    private fun quartPint(q: Double) = 2 * q
    private fun pintGallon(p: Double) = 0.125 * p
    private fun gallonPint(g: Double) = 8 * g
    private fun quartGallon(q: Double) = 0.25 * q
    private fun gallonQuart(g: Double) = 4 * g


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
                        textView2.text = (literKiloliter(text.toDouble())).toString()
                    }

                    Pair(units[1], units[0]) -> {
                        textView1.text = text
                        textView2.text = (kiloliterLiter(text.toDouble())).toString()
                    }

                    Pair(units[0], units[2]) -> {
                        textView1.text = text
                        textView2.text = (literOunce(text.toDouble())).toString()
                    }

                    Pair(units[2], units[0]) -> {
                        textView1.text = text
                        textView2.text = (ounceLiter(text.toDouble())).toString()
                    }

                    Pair(units[0], units[3]) -> {
                        textView1.text = text
                        textView2.text = (literPint(text.toDouble())).toString()
                    }

                    Pair(units[3], units[0]) -> {
                        textView1.text = text
                        textView2.text = (pintLiter(text.toDouble())).toString()
                    }

                    Pair(units[0], units[4]) -> {
                        textView1.text = text
                        textView2.text = (literQuart(text.toDouble())).toString()
                    }

                    Pair(units[4], units[0]) -> {
                        textView1.text = text
                        textView2.text = (quartLiter(text.toDouble())).toString()
                    }

                    Pair(units[0], units[5]) -> {
                        textView1.text = text
                        textView2.text = (literGallon(text.toDouble())).toString()
                    }

                    Pair(units[5], units[0]) -> {
                        textView1.text = text
                        textView2.text = (gallonLiter(text.toDouble())).toString()
                    }


                    Pair(units[1], units[2]) -> {
                        textView1.text = text
                        textView2.text = (kiloliterOunce(text.toDouble())).toString()
                    }

                    Pair(units[2], units[1]) -> {
                        textView1.text = text
                        textView2.text = (ounceKiloliter(text.toDouble())).toString()
                    }

                    Pair(units[1], units[3]) -> {
                        textView1.text = text
                        textView2.text = (kiloliterPint(text.toDouble())).toString()
                    }

                    Pair(units[3], units[1]) -> {
                        textView1.text = text
                        textView2.text = (pintKiloliter(text.toDouble())).toString()
                    }

                    Pair(units[1], units[4]) -> {
                        textView1.text = text
                        textView2.text = (kiloliterQuart(text.toDouble())).toString()
                    }

                    Pair(units[4], units[1]) -> {
                        textView1.text = text
                        textView2.text = (quartKiloliter(text.toDouble())).toString()
                    }

                    Pair(units[1], units[5]) -> {
                        textView1.text = text
                        textView2.text = (kiloliterGallon(text.toDouble())).toString()
                    }

                    Pair(units[5], units[1]) -> {
                        textView1.text = text
                        textView2.text = (gallonKiloliter(text.toDouble())).toString()
                    }

                    Pair(units[2], units[3]) -> {
                        textView1.text = text
                        textView2.text = (ouncePint(text.toDouble())).toString()
                    }

                    Pair(units[3], units[2]) -> {
                        textView1.text = text
                        textView2.text = (pintOunce(text.toDouble())).toString()
                    }

                    Pair(units[2], units[4]) -> {
                        textView1.text = text
                        textView2.text = (ounceQuart(text.toDouble())).toString()
                    }

                    Pair(units[4], units[2]) -> {
                        textView1.text = text
                        textView2.text = (quartOunce(text.toDouble())).toString()
                    }

                    Pair(units[2], units[5]) -> {
                        textView1.text = text
                        textView2.text = (ounceGallon(text.toDouble())).toString()
                    }

                    Pair(units[5], units[2]) -> {
                        textView1.text = text
                        textView2.text = (gallonOunce(text.toDouble())).toString()
                    }

                    Pair(units[3], units[4]) -> {
                        textView1.text = text
                        textView2.text = (pintQuart(text.toDouble())).toString()
                    }

                    Pair(units[4], units[3]) -> {
                        textView1.text = text
                        textView2.text = (quartPint(text.toDouble())).toString()
                    }

                    Pair(units[3], units[5]) -> {
                        textView1.text = text
                        textView2.text = (pintGallon(text.toDouble())).toString()
                    }

                    Pair(units[5], units[3]) -> {
                        textView1.text = text
                        textView2.text = (gallonPint(text.toDouble())).toString()
                    }

                    Pair(units[4], units[5]) -> {
                        textView1.text = text
                        textView2.text = (quartGallon(text.toDouble())).toString()
                    }

                    Pair(units[5], units[4]) -> {
                        textView1.text = text
                        textView2.text = (gallonQuart(text.toDouble())).toString()
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
                        textView1.text = (literKiloliter(text.toDouble())).toString()
                    }

                    Pair(units[0], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kiloliterLiter(text.toDouble())).toString()
                    }

                    Pair(units[2], units[0]) -> {
                        textView2.text = text
                        textView1.text = (literOunce(text.toDouble())).toString()
                    }

                    Pair(units[0], units[2]) -> {
                        textView2.text = text
                        textView1.text = (ounceLiter(text.toDouble())).toString()
                    }

                    Pair(units[3], units[0]) -> {
                        textView2.text = text
                        textView1.text = (literPint(text.toDouble())).toString()
                    }

                    Pair(units[0], units[3]) -> {
                        textView2.text = text
                        textView1.text = (pintLiter(text.toDouble())).toString()
                    }

                    Pair(units[4], units[0]) -> {
                        textView2.text = text
                        textView1.text = (literQuart(text.toDouble())).toString()
                    }

                    Pair(units[0], units[4]) -> {
                        textView2.text = text
                        textView1.text = (quartLiter(text.toDouble())).toString()
                    }

                    Pair(units[5], units[0]) -> {
                        textView2.text = text
                        textView1.text = (literGallon(text.toDouble())).toString()
                    }

                    Pair(units[0], units[5]) -> {
                        textView2.text = text
                        textView1.text = (gallonLiter(text.toDouble())).toString()
                    }


                    Pair(units[2], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kiloliterOunce(text.toDouble())).toString()
                    }

                    Pair(units[1], units[2]) -> {
                        textView2.text = text
                        textView1.text = (ounceKiloliter(text.toDouble())).toString()
                    }

                    Pair(units[3], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kiloliterPint(text.toDouble())).toString()
                    }

                    Pair(units[1], units[3]) -> {
                        textView2.text = text
                        textView1.text = (pintKiloliter(text.toDouble())).toString()
                    }

                    Pair(units[4], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kiloliterQuart(text.toDouble())).toString()
                    }

                    Pair(units[1], units[4]) -> {
                        textView2.text = text
                        textView1.text = (quartKiloliter(text.toDouble())).toString()
                    }

                    Pair(units[5], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kiloliterGallon(text.toDouble())).toString()
                    }

                    Pair(units[1], units[5]) -> {
                        textView2.text = text
                        textView1.text = (gallonKiloliter(text.toDouble())).toString()
                    }

                    Pair(units[3], units[2]) -> {
                        textView2.text = text
                        textView1.text = (ouncePint(text.toDouble())).toString()
                    }

                    Pair(units[2], units[3]) -> {
                        textView2.text = text
                        textView1.text = (pintOunce(text.toDouble())).toString()
                    }

                    Pair(units[4], units[2]) -> {
                        textView2.text = text
                        textView1.text = (ounceQuart(text.toDouble())).toString()
                    }

                    Pair(units[2], units[4]) -> {
                        textView2.text = text
                        textView1.text = (quartOunce(text.toDouble())).toString()
                    }

                    Pair(units[5], units[2]) -> {
                        textView2.text = text
                        textView1.text = (ounceGallon(text.toDouble())).toString()
                    }

                    Pair(units[2], units[5]) -> {
                        textView2.text = text
                        textView1.text = (gallonOunce(text.toDouble())).toString()
                    }

                    Pair(units[4], units[3]) -> {
                        textView2.text = text
                        textView1.text = (pintQuart(text.toDouble())).toString()
                    }

                    Pair(units[3], units[4]) -> {
                        textView2.text = text
                        textView1.text = (quartPint(text.toDouble())).toString()
                    }

                    Pair(units[5], units[3]) -> {
                        textView2.text = text
                        textView1.text = (pintGallon(text.toDouble())).toString()
                    }

                    Pair(units[3], units[5]) -> {
                        textView2.text = text
                        textView1.text = (gallonPint(text.toDouble())).toString()
                    }

                    Pair(units[5], units[4]) -> {
                        textView2.text = text
                        textView1.text = (quartGallon(text.toDouble())).toString()
                    }

                    Pair(units[4], units[5]) -> {
                        textView2.text = text
                        textView1.text = (gallonQuart(text.toDouble())).toString()
                    }

                }
            }
        }
    }


}
