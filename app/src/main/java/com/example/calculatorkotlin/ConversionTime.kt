package com.example.calculatorkotlin

import android.widget.TextView

class ConversionTime(private val units:Array<String>) {

    private fun msSecond(ms: Double) = 0.001 * ms
    private fun secondMs(s: Double) = 1000.0 * s
    private fun msMinute(ms: Double) = 1.0 / 60000.0 * ms
    private fun minuteMs(minute: Double) = 60000.0 * minute
    private fun msHours(ms: Double) = 1.0 / (60.0*60000.0) * ms
    private fun hourMs(hour: Double) = 60.0*60000.0 * hour
    private fun msDay(ms: Double) = 1.0 / (24.0*60.0*60000.0) * ms
    private fun dayMs(day: Double) = 24.0*60.0*60000.0 * day
    private fun msWeek(ms: Double) = 1.0 / (7.0*24.0*60.0*60000.0) * ms
    private fun weekMs(week: Double) = 7*24.0*60.0*60000.0 * week
    private fun secondMinute(s: Double) = 1.0/60.0 * s
    private fun minuteSecond(minute: Double) = 60.0 * minute
    private fun secondHour(s: Double) = 1.0/3600.0 * s
    private fun hourSecond(hour: Double) = 3600.0 * hour
    private fun secondDay(s: Double) = 1.0/(24.0*3600.0) * s
    private fun daySecond(day: Double) = 24.0*3600.0 * day
    private fun secondWeek(s: Double) = 1.0/(7.0*24.0*3600.0) * s
    private fun weekSecond(week: Double) = 7.0*24.0*3600.0 * week

    private fun minuteHour(minute: Double) = 1.0/60.0 * minute
    private fun hourMinute(hour: Double) = 60.0 * hour
    private fun minuteDay(minute: Double) = 1.0/(24.0*60.0) * minute
    private fun dayMinute(day: Double) = 24.0*60.0*day
    private fun minuteWeek(minute: Double) = 1.0/(7.0*24.0*60.0) * minute
    private fun weekMinute(week: Double) = 7.0*24.0*60.0 * week

    private fun hourDay(hour: Double) = 1.0/24.0 * hour
    private fun dayHour(day: Double) = 24.0 * day
    private fun hourWeek(hour: Double) = 1.0/(7.0*24.0) * hour
    private fun weekHour(week: Double) = 7.0*24.0 * week
    private fun dayWeek(day: Double) = 1.0/7.0 * day
    private fun weekDay(week: Double) = 7.0 * week


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
                        textView2.text = (msSecond(text.toDouble())).toString()
                    }

                    Pair(units[1], units[0]) -> {
                        textView1.text = text
                        textView2.text = (secondMs(text.toDouble())).toString()
                    }

                    Pair(units[0], units[2]) -> {
                        textView1.text = text
                        textView2.text = (msMinute(text.toDouble())).toString()
                    }

                    Pair(units[2], units[0]) -> {
                        textView1.text = text
                        textView2.text = (minuteMs(text.toDouble())).toString()
                    }

                    Pair(units[0], units[3]) -> {
                        textView1.text = text
                        textView2.text = (msHours(text.toDouble())).toString()
                    }

                    Pair(units[3], units[0]) -> {
                        textView1.text = text
                        textView2.text = (hourMs(text.toDouble())).toString()
                    }

                    Pair(units[0], units[4]) -> {
                        textView1.text = text
                        textView2.text = (msDay(text.toDouble())).toString()
                    }

                    Pair(units[4], units[0]) -> {
                        textView1.text = text
                        textView2.text = (dayMs(text.toDouble())).toString()
                    }

                    Pair(units[0], units[5]) -> {
                        textView1.text = text
                        textView2.text = (msWeek(text.toDouble())).toString()
                    }

                    Pair(units[5], units[0]) -> {
                        textView1.text = text
                        textView2.text = (weekMs(text.toDouble())).toString()
                    }


                    Pair(units[1], units[2]) -> {
                        textView1.text = text
                        textView2.text = (secondMinute(text.toDouble())).toString()
                    }

                    Pair(units[2], units[1]) -> {
                        textView1.text = text
                        textView2.text = (minuteSecond(text.toDouble())).toString()
                    }

                    Pair(units[1], units[3]) -> {
                        textView1.text = text
                        textView2.text = (secondHour(text.toDouble())).toString()
                    }

                    Pair(units[3], units[1]) -> {
                        textView1.text = text
                        textView2.text = (hourSecond(text.toDouble())).toString()
                    }

                    Pair(units[1], units[4]) -> {
                        textView1.text = text
                        textView2.text = (secondDay(text.toDouble())).toString()
                    }

                    Pair(units[4], units[1]) -> {
                        textView1.text = text
                        textView2.text = (daySecond(text.toDouble())).toString()
                    }

                    Pair(units[1], units[5]) -> {
                        textView1.text = text
                        textView2.text = (secondWeek(text.toDouble())).toString()
                    }

                    Pair(units[5], units[1]) -> {
                        textView1.text = text
                        textView2.text = (weekSecond(text.toDouble())).toString()
                    }

                    Pair(units[2], units[3]) -> {
                        textView1.text = text
                        textView2.text = (minuteHour(text.toDouble())).toString()
                    }

                    Pair(units[3], units[2]) -> {
                        textView1.text = text
                        textView2.text = (hourMinute(text.toDouble())).toString()
                    }

                    Pair(units[2], units[4]) -> {
                        textView1.text = text
                        textView2.text = (minuteDay(text.toDouble())).toString()
                    }

                    Pair(units[4], units[2]) -> {
                        textView1.text = text
                        textView2.text = (dayMinute(text.toDouble())).toString()
                    }

                    Pair(units[2], units[5]) -> {
                        textView1.text = text
                        textView2.text = (minuteWeek(text.toDouble())).toString()
                    }

                    Pair(units[5], units[2]) -> {
                        textView1.text = text
                        textView2.text = (weekMinute(text.toDouble())).toString()
                    }

                    Pair(units[3], units[4]) -> {
                        textView1.text = text
                        textView2.text = (hourDay(text.toDouble())).toString()
                    }

                    Pair(units[4], units[3]) -> {
                        textView1.text = text
                        textView2.text = (dayHour(text.toDouble())).toString()
                    }

                    Pair(units[3], units[5]) -> {
                        textView1.text = text
                        textView2.text = (hourWeek(text.toDouble())).toString()
                    }

                    Pair(units[5], units[3]) -> {
                        textView1.text = text
                        textView2.text = (weekHour(text.toDouble())).toString()
                    }

                    Pair(units[4], units[5]) -> {
                        textView1.text = text
                        textView2.text = (dayWeek(text.toDouble())).toString()
                    }

                    Pair(units[5], units[4]) -> {
                        textView1.text = text
                        textView2.text = (weekDay(text.toDouble())).toString()
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
                        textView1.text = (msSecond(text.toDouble())).toString()
                    }

                    Pair(units[0], units[1]) -> {
                        textView2.text = text
                        textView1.text = (secondMs(text.toDouble())).toString()
                    }

                    Pair(units[2], units[0]) -> {
                        textView2.text = text
                        textView1.text = (msMinute(text.toDouble())).toString()
                    }

                    Pair(units[0], units[2]) -> {
                        textView2.text = text
                        textView1.text = (minuteMs(text.toDouble())).toString()
                    }

                    Pair(units[3], units[0]) -> {
                        textView2.text = text
                        textView1.text = (msHours(text.toDouble())).toString()
                    }

                    Pair(units[0], units[3]) -> {
                        textView2.text = text
                        textView1.text = (hourMs(text.toDouble())).toString()
                    }

                    Pair(units[4], units[0]) -> {
                        textView2.text = text
                        textView1.text = (msDay(text.toDouble())).toString()
                    }

                    Pair(units[0], units[4]) -> {
                        textView2.text = text
                        textView1.text = (dayMs(text.toDouble())).toString()
                    }

                    Pair(units[5], units[0]) -> {
                        textView2.text = text
                        textView1.text = (msWeek(text.toDouble())).toString()
                    }

                    Pair(units[0], units[5]) -> {
                        textView2.text = text
                        textView1.text = (weekMs(text.toDouble())).toString()
                    }


                    Pair(units[2], units[1]) -> {
                        textView2.text = text
                        textView1.text = (secondMinute(text.toDouble())).toString()
                    }

                    Pair(units[1], units[2]) -> {
                        textView2.text = text
                        textView1.text = (minuteSecond(text.toDouble())).toString()
                    }

                    Pair(units[3], units[1]) -> {
                        textView2.text = text
                        textView1.text = (secondHour(text.toDouble())).toString()
                    }

                    Pair(units[1], units[3]) -> {
                        textView2.text = text
                        textView1.text = (hourSecond(text.toDouble())).toString()
                    }

                    Pair(units[4], units[1]) -> {
                        textView2.text = text
                        textView1.text = (secondDay(text.toDouble())).toString()
                    }

                    Pair(units[1], units[4]) -> {
                        textView2.text = text
                        textView1.text = (daySecond(text.toDouble())).toString()
                    }

                    Pair(units[5], units[1]) -> {
                        textView2.text = text
                        textView1.text = (secondWeek(text.toDouble())).toString()
                    }

                    Pair(units[1], units[5]) -> {
                        textView2.text = text
                        textView1.text = (weekSecond(text.toDouble())).toString()
                    }

                    Pair(units[3], units[2]) -> {
                        textView2.text = text
                        textView1.text = (minuteHour(text.toDouble())).toString()
                    }

                    Pair(units[2], units[3]) -> {
                        textView2.text = text
                        textView1.text = (hourMinute(text.toDouble())).toString()
                    }

                    Pair(units[4], units[2]) -> {
                        textView2.text = text
                        textView1.text = (minuteDay(text.toDouble())).toString()
                    }

                    Pair(units[2], units[4]) -> {
                        textView2.text = text
                        textView1.text = (dayMinute(text.toDouble())).toString()
                    }

                    Pair(units[5], units[2]) -> {
                        textView2.text = text
                        textView1.text = (minuteWeek(text.toDouble())).toString()
                    }

                    Pair(units[2], units[5]) -> {
                        textView2.text = text
                        textView1.text = (weekMinute(text.toDouble())).toString()
                    }

                    Pair(units[4], units[3]) -> {
                        textView2.text = text
                        textView1.text = (hourDay(text.toDouble())).toString()
                    }

                    Pair(units[3], units[4]) -> {
                        textView2.text = text
                        textView1.text = (dayHour(text.toDouble())).toString()
                    }

                    Pair(units[5], units[3]) -> {
                        textView2.text = text
                        textView1.text = (hourWeek(text.toDouble())).toString()
                    }

                    Pair(units[3], units[5]) -> {
                        textView2.text = text
                        textView1.text = (weekHour(text.toDouble())).toString()
                    }

                    Pair(units[5], units[4]) -> {
                        textView2.text = text
                        textView1.text = (dayWeek(text.toDouble())).toString()
                    }

                    Pair(units[4], units[5]) -> {
                        textView2.text = text
                        textView1.text = (weekDay(text.toDouble())).toString()
                    }

                }
            }
        }
    }


}
