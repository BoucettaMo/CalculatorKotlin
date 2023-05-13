package com.example.calculatorkotlin

import android.widget.TextView

class ConversionLength(private val units:Array<String>) {

    private fun meterKilometer(m: Double) = 0.001 * m
    private fun kilometerMeter(k: Double) = 1000.0 * k
    private fun meterMile(m: Double) = 0.00062137119223733 * m
    private fun mileMeter(mile: Double) = 1609.344 * mile
    private fun meterYard(m: Double) = 1.0936132983377 * m
    private fun yardMeter(y: Double) = 0.9144 * y
    private fun meterFeet(m: Double) = 3.2808398950131  * m
    private fun feetMeter(f: Double) = 0.3048 * f
    private fun meterInch(m: Double) = 39.370078740157 * m
    private fun inchMeter(i: Double) = 0.0254 * i
    private fun kilometerMile(k: Double) = 0.62137119223733 * k
    private fun mileKilometer(mile: Double) = 1.609344 * mile
    private fun kilometerYard(k: Double) = 1093.6132983377 * k
    private fun yardKilometer(y: Double) = 0.0009144 * y
    private fun kilometerFeet(k: Double) = 3280.8398950131 * k
    private fun feetKilometer(f: Double) = 0.0003048 * f
    private fun kilometerInch(k: Double) =  3.937008*10000.0 * k
    private fun inchKilometer(i: Double) = 2.54/100000.0 * i

    private fun mileYard(m: Double) = 1760 * m
    private fun yardMile(y: Double) = 0.00056818181818182 * y
    private fun mileFeet(m: Double) = 5280 * m
    private fun feetMile(f: Double) = 0.00018939393939394* f
    private fun mileInch(m: Double) = 6.336*10000.0 * m
    private fun inchMile(i: Double) = 1.5782828282828/100000.0 * i

    private fun yardFeet(y: Double) = 3.0 * y
    private fun feetYard(f: Double) = 0.33333333333333 * f
    private fun yardInch(y: Double) = 36 * y
    private fun inchYard(i: Double) = 0.027777777777778 * i
    private fun feetInch(f: Double) = 12 * f
    private fun inchFeet(i: Double) = 0.083333333333333 * i


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
                        textView2.text = (meterKilometer(text.toDouble())).toString()
                    }

                    Pair(units[1], units[0]) -> {
                        textView1.text = text
                        textView2.text = (kilometerMeter(text.toDouble())).toString()
                    }

                    Pair(units[0], units[2]) -> {
                        textView1.text = text
                        textView2.text = (meterMile(text.toDouble())).toString()
                    }

                    Pair(units[2], units[0]) -> {
                        textView1.text = text
                        textView2.text = (mileMeter(text.toDouble())).toString()
                    }

                    Pair(units[0], units[3]) -> {
                        textView1.text = text
                        textView2.text = (meterYard(text.toDouble())).toString()
                    }

                    Pair(units[3], units[0]) -> {
                        textView1.text = text
                        textView2.text = (yardMeter(text.toDouble())).toString()
                    }

                    Pair(units[0], units[4]) -> {
                        textView1.text = text
                        textView2.text = (meterFeet(text.toDouble())).toString()
                    }

                    Pair(units[4], units[0]) -> {
                        textView1.text = text
                        textView2.text = (feetMeter(text.toDouble())).toString()
                    }

                    Pair(units[0], units[5]) -> {
                        textView1.text = text
                        textView2.text = (meterInch(text.toDouble())).toString()
                    }

                    Pair(units[5], units[0]) -> {
                        textView1.text = text
                        textView2.text = (inchMeter(text.toDouble())).toString()
                    }


                    Pair(units[1], units[2]) -> {
                        textView1.text = text
                        textView2.text = (kilometerMile(text.toDouble())).toString()
                    }

                    Pair(units[2], units[1]) -> {
                        textView1.text = text
                        textView2.text = (mileKilometer(text.toDouble())).toString()
                    }

                    Pair(units[1], units[3]) -> {
                        textView1.text = text
                        textView2.text = (kilometerYard(text.toDouble())).toString()
                    }

                    Pair(units[3], units[1]) -> {
                        textView1.text = text
                        textView2.text = (yardKilometer(text.toDouble())).toString()
                    }

                    Pair(units[1], units[4]) -> {
                        textView1.text = text
                        textView2.text = (kilometerFeet(text.toDouble())).toString()
                    }

                    Pair(units[4], units[1]) -> {
                        textView1.text = text
                        textView2.text = (feetKilometer(text.toDouble())).toString()
                    }

                    Pair(units[1], units[5]) -> {
                        textView1.text = text
                        textView2.text = (kilometerInch(text.toDouble())).toString()
                    }

                    Pair(units[5], units[1]) -> {
                        textView1.text = text
                        textView2.text = (inchKilometer(text.toDouble())).toString()
                    }

                    Pair(units[2], units[3]) -> {
                        textView1.text = text
                        textView2.text = (mileYard(text.toDouble())).toString()
                    }

                    Pair(units[3], units[2]) -> {
                        textView1.text = text
                        textView2.text = (yardMile(text.toDouble())).toString()
                    }

                    Pair(units[2], units[4]) -> {
                        textView1.text = text
                        textView2.text = (mileFeet(text.toDouble())).toString()
                    }

                    Pair(units[4], units[2]) -> {
                        textView1.text = text
                        textView2.text = (feetMile(text.toDouble())).toString()
                    }

                    Pair(units[2], units[5]) -> {
                        textView1.text = text
                        textView2.text = (mileInch(text.toDouble())).toString()
                    }

                    Pair(units[5], units[2]) -> {
                        textView1.text = text
                        textView2.text = (inchMile(text.toDouble())).toString()
                    }

                    Pair(units[3], units[4]) -> {
                        textView1.text = text
                        textView2.text = (yardFeet(text.toDouble())).toString()
                    }

                    Pair(units[4], units[3]) -> {
                        textView1.text = text
                        textView2.text = (feetYard(text.toDouble())).toString()
                    }

                    Pair(units[3], units[5]) -> {
                        textView1.text = text
                        textView2.text = (yardInch(text.toDouble())).toString()
                    }

                    Pair(units[5], units[3]) -> {
                        textView1.text = text
                        textView2.text = (inchYard(text.toDouble())).toString()
                    }

                    Pair(units[4], units[5]) -> {
                        textView1.text = text
                        textView2.text = (feetInch(text.toDouble())).toString()
                    }

                    Pair(units[5], units[4]) -> {
                        textView1.text = text
                        textView2.text = (inchFeet(text.toDouble())).toString()
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
                        textView1.text = (meterKilometer(text.toDouble())).toString()
                    }

                    Pair(units[0], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kilometerMeter(text.toDouble())).toString()
                    }

                    Pair(units[2], units[0]) -> {
                        textView2.text = text
                        textView1.text = (meterMile(text.toDouble())).toString()
                    }

                    Pair(units[0], units[2]) -> {
                        textView2.text = text
                        textView1.text = (mileMeter(text.toDouble())).toString()
                    }

                    Pair(units[3], units[0]) -> {
                        textView2.text = text
                        textView1.text = (meterYard(text.toDouble())).toString()
                    }

                    Pair(units[0], units[3]) -> {
                        textView2.text = text
                        textView1.text = (yardMeter(text.toDouble())).toString()
                    }

                    Pair(units[4], units[0]) -> {
                        textView2.text = text
                        textView1.text = (meterFeet(text.toDouble())).toString()
                    }

                    Pair(units[0], units[4]) -> {
                        textView2.text = text
                        textView1.text = (feetMeter(text.toDouble())).toString()
                    }

                    Pair(units[5], units[0]) -> {
                        textView2.text = text
                        textView1.text = (meterInch(text.toDouble())).toString()
                    }

                    Pair(units[0], units[5]) -> {
                        textView2.text = text
                        textView1.text = (inchMeter(text.toDouble())).toString()
                    }


                    Pair(units[2], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kilometerMile(text.toDouble())).toString()
                    }

                    Pair(units[1], units[2]) -> {
                        textView2.text = text
                        textView1.text = (mileKilometer(text.toDouble())).toString()
                    }

                    Pair(units[3], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kilometerYard(text.toDouble())).toString()
                    }

                    Pair(units[1], units[3]) -> {
                        textView2.text = text
                        textView1.text = (yardKilometer(text.toDouble())).toString()
                    }

                    Pair(units[4], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kilometerFeet(text.toDouble())).toString()
                    }

                    Pair(units[1], units[4]) -> {
                        textView2.text = text
                        textView1.text = (feetKilometer(text.toDouble())).toString()
                    }

                    Pair(units[5], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kilometerInch(text.toDouble())).toString()
                    }

                    Pair(units[1], units[5]) -> {
                        textView2.text = text
                        textView1.text = (inchKilometer(text.toDouble())).toString()
                    }

                    Pair(units[3], units[2]) -> {
                        textView2.text = text
                        textView1.text = (mileYard(text.toDouble())).toString()
                    }

                    Pair(units[2], units[3]) -> {
                        textView2.text = text
                        textView1.text = (yardMile(text.toDouble())).toString()
                    }

                    Pair(units[4], units[2]) -> {
                        textView2.text = text
                        textView1.text = (mileFeet(text.toDouble())).toString()
                    }

                    Pair(units[2], units[4]) -> {
                        textView2.text = text
                        textView1.text = (feetMile(text.toDouble())).toString()
                    }

                    Pair(units[5], units[2]) -> {
                        textView2.text = text
                        textView1.text = (mileInch(text.toDouble())).toString()
                    }

                    Pair(units[2], units[5]) -> {
                        textView2.text = text
                        textView1.text = (inchMile(text.toDouble())).toString()
                    }

                    Pair(units[4], units[3]) -> {
                        textView2.text = text
                        textView1.text = (yardFeet(text.toDouble())).toString()
                    }

                    Pair(units[3], units[4]) -> {
                        textView2.text = text
                        textView1.text = (feetYard(text.toDouble())).toString()
                    }

                    Pair(units[5], units[3]) -> {
                        textView2.text = text
                        textView1.text = (yardInch(text.toDouble())).toString()
                    }

                    Pair(units[3], units[5]) -> {
                        textView2.text = text
                        textView1.text = (inchYard(text.toDouble())).toString()
                    }

                    Pair(units[5], units[4]) -> {
                        textView2.text = text
                        textView1.text = (feetInch(text.toDouble())).toString()
                    }

                    Pair(units[4], units[5]) -> {
                        textView2.text = text
                        textView1.text = (inchFeet(text.toDouble())).toString()
                    }

                }
            }
        }
    }


}
