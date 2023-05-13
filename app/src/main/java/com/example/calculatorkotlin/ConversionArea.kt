package com.example.calculatorkotlin

import android.widget.TextView

class ConversionArea(private val units:Array<String>) {


    private fun sMeterSKilometer(sm: Double) = 0.000001 * sm
    private fun sKilometerSmeter(sk: Double) = 1000000.0 * sk
    private fun sMeterSmile(sm: Double) = 3.8610215854245/10000000.0 * sm
    private fun sMileSmeter(smile: Double) = 2.589988*1000000 * smile
    private fun sMeterSyard(sm: Double) = 1.1959900463011 * sm
    private fun sYardSmeter(sy: Double) = 0.83612736 * sy
    private fun sMeterSfeet(sm: Double) = 10.76391041671  * sm
    private fun sFeetSmeter(sf: Double) = 0.09290304 * sf
    private fun sMeterSinche(sm: Double) = 1550.0031000062 * sm
    private fun sIncheSmeter(si: Double) = 0.00064516 * si
    private fun sKilometerSmile(sk: Double) = 0.38610215854245 * sk
    private fun sMileSkilometer(smile: Double) = 2.589988110336 * smile
    private fun sKilometerSyard(sk: Double) = 1.19599*1000000.0 * sk
    private fun sYardSkilometer(sy: Double) = 8.3612736/10000000.0 * sy
    private fun sKilometerSfeet(sk: Double) = 1.076391* 10000000.0 * sk
    private fun sFeetSkilometer(sf: Double) = 9.290304* 100000000.0 * sf
    private fun sKilometerSinche(sk: Double) = 1.550003*1000000000 * sk
    private fun sIncheSkilometer(si: Double) = 6.4516/10000000000.0 * si

    private fun sMileSyard(sm: Double) = 3.0976*1000000 * sm
    private fun sYardSmile(sy: Double) = 3.228305785124/10000000.0 * sy
    private fun sMileSfeet(sm: Double) = 2.78784*10000000.0 * sm
    private fun sFeetSmile(sf: Double) = 3.5870064279155/100000000.0*sf
    private fun sMileSinche(sm: Double) = 4.01449*1000000000.0 * sm
    private fun sIncheSmile(si: Double) = 2.4909766860524*10000000000.0 * si

    private fun sYardSfeet(sy: Double) = 9.0 * sy
    private fun sFeetSyard(sf: Double) = 0.11111111111111 * sf
    private fun sYardSinche(sy: Double) = 1296 * sy
    private fun sIncheSyard(si: Double) = 0.0007716049382716 * si
    private fun sFeetSinche(sf: Double) = 144 * sf
    private fun sIncheSfeet(si: Double) = 0.0069444444444444 * si


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
                        textView2.text = (sMeterSKilometer(text.toDouble())).toString()
                    }

                    Pair(units[1], units[0]) -> {
                        textView1.text = text
                        textView2.text = (sKilometerSmeter(text.toDouble())).toString()
                    }

                    Pair(units[0], units[2]) -> {
                        textView1.text = text
                        textView2.text = (sMeterSmile(text.toDouble())).toString()
                    }

                    Pair(units[2], units[0]) -> {
                        textView1.text = text
                        textView2.text = (sMileSmeter(text.toDouble())).toString()
                    }

                    Pair(units[0], units[3]) -> {
                        textView1.text = text
                        textView2.text = (sMeterSyard(text.toDouble())).toString()
                    }

                    Pair(units[3], units[0]) -> {
                        textView1.text = text
                        textView2.text = (sYardSmeter(text.toDouble())).toString()
                    }

                    Pair(units[0], units[4]) -> {
                        textView1.text = text
                        textView2.text = (sMeterSfeet(text.toDouble())).toString()
                    }

                    Pair(units[4], units[0]) -> {
                        textView1.text = text
                        textView2.text = (sFeetSmeter(text.toDouble())).toString()
                    }

                    Pair(units[0], units[5]) -> {
                        textView1.text = text
                        textView2.text = (sMeterSinche(text.toDouble())).toString()
                    }

                    Pair(units[5], units[0]) -> {
                        textView1.text = text
                        textView2.text = (sIncheSmeter(text.toDouble())).toString()
                    }


                    Pair(units[1], units[2]) -> {
                        textView1.text = text
                        textView2.text = (sKilometerSmile(text.toDouble())).toString()
                    }

                    Pair(units[2], units[1]) -> {
                        textView1.text = text
                        textView2.text = (sMileSkilometer(text.toDouble())).toString()
                    }

                    Pair(units[1], units[3]) -> {
                        textView1.text = text
                        textView2.text = (sKilometerSyard(text.toDouble())).toString()
                    }

                    Pair(units[3], units[1]) -> {
                        textView1.text = text
                        textView2.text = (sYardSkilometer(text.toDouble())).toString()
                    }

                    Pair(units[1], units[4]) -> {
                        textView1.text = text
                        textView2.text = (sKilometerSfeet(text.toDouble())).toString()
                    }

                    Pair(units[4], units[1]) -> {
                        textView1.text = text
                        textView2.text = (sFeetSkilometer(text.toDouble())).toString()
                    }

                    Pair(units[1], units[5]) -> {
                        textView1.text = text
                        textView2.text = (sKilometerSinche(text.toDouble())).toString()
                    }

                    Pair(units[5], units[1]) -> {
                        textView1.text = text
                        textView2.text = (sIncheSkilometer(text.toDouble())).toString()
                    }

                    Pair(units[2], units[3]) -> {
                        textView1.text = text
                        textView2.text = (sMileSyard(text.toDouble())).toString()
                    }

                    Pair(units[3], units[2]) -> {
                        textView1.text = text
                        textView2.text = (sYardSmile(text.toDouble())).toString()
                    }

                    Pair(units[2], units[4]) -> {
                        textView1.text = text
                        textView2.text = (sMileSfeet(text.toDouble())).toString()
                    }

                    Pair(units[4], units[2]) -> {
                        textView1.text = text
                        textView2.text = (sFeetSmile(text.toDouble())).toString()
                    }

                    Pair(units[2], units[5]) -> {
                        textView1.text = text
                        textView2.text = (sMileSinche(text.toDouble())).toString()
                    }

                    Pair(units[5], units[2]) -> {
                        textView1.text = text
                        textView2.text = (sIncheSmile(text.toDouble())).toString()
                    }

                    Pair(units[3], units[4]) -> {
                        textView1.text = text
                        textView2.text = (sYardSfeet(text.toDouble())).toString()
                    }

                    Pair(units[4], units[3]) -> {
                        textView1.text = text
                        textView2.text = (sFeetSyard(text.toDouble())).toString()
                    }

                    Pair(units[3], units[5]) -> {
                        textView1.text = text
                        textView2.text = (sYardSinche(text.toDouble())).toString()
                    }

                    Pair(units[5], units[3]) -> {
                        textView1.text = text
                        textView2.text = (sIncheSyard(text.toDouble())).toString()
                    }

                    Pair(units[4], units[5]) -> {
                        textView1.text = text
                        textView2.text = (sFeetSinche(text.toDouble())).toString()
                    }

                    Pair(units[5], units[4]) -> {
                        textView1.text = text
                        textView2.text = (sIncheSfeet(text.toDouble())).toString()
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
                        textView1.text = (sMeterSKilometer(text.toDouble())).toString()
                    }

                    Pair(units[0], units[1]) -> {
                        textView2.text = text
                        textView1.text = (sKilometerSmeter(text.toDouble())).toString()
                    }

                    Pair(units[2], units[0]) -> {
                        textView2.text = text
                        textView1.text = (sMeterSmile(text.toDouble())).toString()
                    }

                    Pair(units[0], units[2]) -> {
                        textView2.text = text
                        textView1.text = (sMileSmeter(text.toDouble())).toString()
                    }

                    Pair(units[3], units[0]) -> {
                        textView2.text = text
                        textView1.text = (sMeterSyard(text.toDouble())).toString()
                    }

                    Pair(units[0], units[3]) -> {
                        textView2.text = text
                        textView1.text = (sYardSmeter(text.toDouble())).toString()
                    }

                    Pair(units[4], units[0]) -> {
                        textView2.text = text
                        textView1.text = (sMeterSfeet(text.toDouble())).toString()
                    }

                    Pair(units[0], units[4]) -> {
                        textView2.text = text
                        textView1.text = (sFeetSmeter(text.toDouble())).toString()
                    }

                    Pair(units[5], units[0]) -> {
                        textView2.text = text
                        textView1.text = (sMeterSinche(text.toDouble())).toString()
                    }

                    Pair(units[0], units[5]) -> {
                        textView2.text = text
                        textView1.text = (sIncheSmeter(text.toDouble())).toString()
                    }


                    Pair(units[2], units[1]) -> {
                        textView2.text = text
                        textView1.text = (sKilometerSmile(text.toDouble())).toString()
                    }

                    Pair(units[1], units[2]) -> {
                        textView2.text = text
                        textView1.text = (sMileSkilometer(text.toDouble())).toString()
                    }

                    Pair(units[3], units[1]) -> {
                        textView2.text = text
                        textView1.text = (sKilometerSyard(text.toDouble())).toString()
                    }

                    Pair(units[1], units[3]) -> {
                        textView2.text = text
                        textView1.text = (sYardSkilometer(text.toDouble())).toString()
                    }

                    Pair(units[4], units[1]) -> {
                        textView2.text = text
                        textView1.text = (sKilometerSfeet(text.toDouble())).toString()
                    }

                    Pair(units[1], units[4]) -> {
                        textView2.text = text
                        textView1.text = (sFeetSkilometer(text.toDouble())).toString()
                    }

                    Pair(units[5], units[1]) -> {
                        textView2.text = text
                        textView1.text = (sKilometerSinche(text.toDouble())).toString()
                    }

                    Pair(units[1], units[5]) -> {
                        textView2.text = text
                        textView1.text = (sIncheSkilometer(text.toDouble())).toString()
                    }

                    Pair(units[3], units[2]) -> {
                        textView2.text = text
                        textView1.text = (sMileSyard(text.toDouble())).toString()
                    }

                    Pair(units[2], units[3]) -> {
                        textView2.text = text
                        textView1.text = (sYardSmile(text.toDouble())).toString()
                    }

                    Pair(units[4], units[2]) -> {
                        textView2.text = text
                        textView1.text = (sMileSfeet(text.toDouble())).toString()
                    }

                    Pair(units[2], units[4]) -> {
                        textView2.text = text
                        textView1.text = (sFeetSmile(text.toDouble())).toString()
                    }

                    Pair(units[5], units[2]) -> {
                        textView2.text = text
                        textView1.text = (sMileSinche(text.toDouble())).toString()
                    }

                    Pair(units[2], units[5]) -> {
                        textView2.text = text
                        textView1.text = (sIncheSmile(text.toDouble())).toString()
                    }

                    Pair(units[4], units[3]) -> {
                        textView2.text = text
                        textView1.text = (sYardSfeet(text.toDouble())).toString()
                    }

                    Pair(units[3], units[4]) -> {
                        textView2.text = text
                        textView1.text = (sFeetSyard(text.toDouble())).toString()
                    }

                    Pair(units[5], units[3]) -> {
                        textView2.text = text
                        textView1.text = (sYardSinche(text.toDouble())).toString()
                    }

                    Pair(units[3], units[5]) -> {
                        textView2.text = text
                        textView1.text = (sIncheSyard(text.toDouble())).toString()
                    }

                    Pair(units[5], units[4]) -> {
                        textView2.text = text
                        textView1.text = (sFeetSinche(text.toDouble())).toString()
                    }

                    Pair(units[4], units[5]) -> {
                        textView2.text = text
                        textView1.text = (sIncheSfeet(text.toDouble())).toString()
                    }

                }
            }
        }
    }


}
