package com.example.calculatorkotlin

import android.widget.TextView

class ConversionSpeed(private val units:Array<String>) {

    private fun kilometerHourMileHour(kh:Double) = 0.62137119223733 * kh
    private  fun mileHourKilometerHour(mh:Double) = 1.609344*mh
    private  fun kilometerHourKnot(k:Double) = 0.53961217425502*k
    private  fun knotKilometerHour(knot:Double) = 1.8531828*knot
    private  fun mileHourKnot(mh:Double) = 0.86842161496427*mh
    private  fun knotMileHour(knot:Double) =1.1515144058697*knot


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
                        textView2.text = (kilometerHourMileHour(text.toDouble())).toString()
                    }

                    Pair(units[1], units[0]) -> {
                        textView1.text = text
                        textView2.text = (mileHourKilometerHour(text.toDouble())).toString()
                    }

                    Pair(units[0], units[2]) -> {
                        textView1.text = text
                        textView2.text = (kilometerHourKnot(text.toDouble())).toString()
                    }

                    Pair(units[2], units[0]) -> {
                        textView1.text = text
                        textView2.text = (knotKilometerHour(text.toDouble())).toString()
                    }

                    Pair(units[1], units[2]) -> {
                        textView1.text = text
                        textView2.text = (mileHourKnot(text.toDouble())).toString()
                    }

                    Pair(units[2], units[1]) -> {
                        textView1.text = text
                        textView2.text = (knotMileHour(text.toDouble())).toString()
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
                        textView1.text = (kilometerHourMileHour(text.toDouble())).toString()
                    }

                    Pair(units[0], units[1]) -> {
                        textView2.text = text
                        textView1.text = (mileHourKilometerHour(text.toDouble())).toString()
                    }

                    Pair(units[2], units[0]) -> {
                        textView2.text = text
                        textView1.text = (kilometerHourKnot(text.toDouble())).toString()
                    }

                    Pair(units[0], units[2]) -> {
                        textView2.text = text
                        textView1.text = (knotKilometerHour(text.toDouble())).toString()
                    }

                    Pair(units[2], units[1]) -> {
                        textView2.text = text
                        textView1.text = (mileHourKnot(text.toDouble())).toString()
                    }

                    Pair(units[1], units[2]) -> {
                        textView2.text = text
                        textView1.text = (knotMileHour(text.toDouble())).toString()
                    }
                }
            }
        }
    }

}
