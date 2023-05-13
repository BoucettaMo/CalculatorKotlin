package com.example.calculatorkotlin

import android.widget.TextView

class ConversionTemperature(private val units: Array<String>) {
   private fun kelvinFahrenheit(kelvin:Double) = (kelvin-273.15)*(9.0/5.0)+32.0
  private  fun kelvinCelsius(kelvin:Double) = kelvin-273.15
  private  fun fahrenheitCelsius(fahrenheit:Double) = (fahrenheit-32.0)*5.0/9.0
  private  fun fahrenheitKelvin(fahrenheit:Double) = (fahrenheit-32)*5/9+273.15
  private  fun celsiusKelvin(celsius:Double) =celsius +273.15
  private  fun celsiusFahrenheit(celsius:Double) =celsius*9.0/5.0+32.0


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
                        textView2.text = (kelvinFahrenheit(text.toDouble())).toString()
                    }

                    Pair(units[1], units[0]) -> {
                        textView1.text = text
                        textView2.text = (fahrenheitKelvin(text.toDouble())).toString()
                    }

                    Pair(units[0], units[2]) -> {
                        textView1.text = text
                        textView2.text = (kelvinCelsius(text.toDouble())).toString()
                    }

                    Pair(units[2], units[0]) -> {
                        textView1.text = text
                        textView2.text = (celsiusKelvin(text.toDouble())).toString()
                    }

                    Pair(units[1], units[2]) -> {
                        textView1.text = text
                        textView2.text = (fahrenheitCelsius(text.toDouble())).toString()
                    }

                    Pair(units[2], units[1]) -> {
                        textView1.text = text
                        textView2.text = (celsiusFahrenheit(text.toDouble())).toString()
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
                        textView1.text = (kelvinFahrenheit(text.toDouble())).toString()
                    }

                    Pair(units[0], units[1]) -> {
                        textView2.text = text
                        textView1.text = (fahrenheitKelvin(text.toDouble())).toString()
                    }

                    Pair(units[2], units[0]) -> {
                        textView2.text = text
                        textView1.text = (kelvinCelsius(text.toDouble())).toString()
                    }

                    Pair(units[0], units[2]) -> {
                        textView2.text = text
                        textView1.text = (celsiusKelvin(text.toDouble())).toString()
                    }

                    Pair(units[2], units[1]) -> {
                        textView2.text = text
                        textView1.text = (fahrenheitCelsius(text.toDouble())).toString()
                    }

                    Pair(units[1], units[2]) -> {
                        textView2.text = text
                        textView1.text = (celsiusFahrenheit(text.toDouble())).toString()
                    }
                }
            }
        }
    }
}