package com.example.calculatorkotlin

import android.widget.TextView

class ConversionData(private val units:Array<String>) {
    private fun bytesKBytes(byte:Double) = 0.001*byte
    private fun kBytesBytes(kByte:Double) = 1000.0*kByte
    private  fun bytesMBytes(byte:Double) = 1.0/1000000.0*byte
    private  fun mBytesBytes(mByte:Double) = 1000000.0*mByte
    private  fun bytesGBytes(byte:Double) = 1.0/1000000000.0*byte
    private  fun gBytesBytes(gByte:Double) = 1000000000.0*gByte
    private  fun bytesTBytes(byte:Double) = 1.0/1000000000000.0*byte
    private  fun tBytesBytes(tByte:Double) = 1000000000000.0*tByte
    private  fun bytesPBytes(byte:Double) = 1.0/1000000000000000.0*byte
    private  fun pBytesBytes(pByte:Double) = 1000000000000000.0*pByte
    private  fun kBytesMBytes(kByte:Double) = 0.001*kByte
    private  fun mBytesKBytes(mByte:Double) = 1000*mByte
    private  fun kBytesGBytes(kByte:Double) = 0.000001*kByte
    private  fun gBytesKBytes(gByte:Double) = 1000000*gByte
    private  fun kBytesTBytes(kByte:Double) = 0.000000001*kByte
    private  fun tBytesKBytes(tByte:Double) = 1000000000*tByte
    private  fun kBytesPBytes(kByte:Double) = 0.000000000001*kByte
    private  fun pBytesKBytes(pByte:Double) = 1000000000000*pByte

    private  fun mBytesGBytes(mByte:Double) = 0.001*mByte
    private  fun gBytesMBytes(gByte:Double) = 1000*gByte
    private  fun mBytesTBytes(mByte:Double) = 0.000001*mByte
    private  fun tBytesMBytes(tByte:Double) = 1000000*tByte
    private  fun mBytesPBytes(kByte:Double) = 0.000000001*kByte
    private  fun pBytesMBytes(pByte:Double) = 1000000000*pByte

    private  fun gBytesTBytes(gByte:Double) = 0.001*gByte
    private  fun tBytesGBytes(tByte:Double) = 1000*tByte
    private  fun gBytesPBytes(gByte:Double) = 0.000001*gByte
    private  fun pBytesGBytes(pByte:Double) = 1000000*pByte
    private  fun tBytesPBytes(tByte:Double) = 0.001*tByte
    private  fun pBytesTBytes(pByte:Double) = 1000*pByte



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
                        textView2.text = (bytesKBytes(text.toDouble())).toString()
                    }

                    Pair(units[1], units[0]) -> {
                        textView1.text = text
                        textView2.text = (kBytesBytes(text.toDouble())).toString()
                    }

                    Pair(units[0], units[2]) -> {
                        textView1.text = text
                        textView2.text = (bytesMBytes(text.toDouble())).toString()
                    }

                    Pair(units[2], units[0]) -> {
                        textView1.text = text
                        textView2.text = (mBytesBytes(text.toDouble())).toString()
                    }

                    Pair(units[0], units[3]) -> {
                        textView1.text = text
                        textView2.text = (bytesGBytes(text.toDouble())).toString()
                    }

                    Pair(units[3], units[0]) -> {
                        textView1.text = text
                        textView2.text = (gBytesBytes(text.toDouble())).toString()
                    }

                    Pair(units[0], units[4]) -> {
                        textView1.text = text
                        textView2.text = (bytesTBytes(text.toDouble())).toString()
                    }

                    Pair(units[4], units[0]) -> {
                        textView1.text = text
                        textView2.text = (tBytesBytes(text.toDouble())).toString()
                    }

                    Pair(units[0], units[5]) -> {
                        textView1.text = text
                        textView2.text = (bytesPBytes(text.toDouble())).toString()
                    }

                    Pair(units[5], units[0]) -> {
                        textView1.text = text
                        textView2.text = (pBytesBytes(text.toDouble())).toString()
                    }



                    Pair(units[1], units[2]) -> {
                        textView1.text = text
                        textView2.text = (kBytesMBytes(text.toDouble())).toString()
                    }

                    Pair(units[2], units[1]) -> {
                        textView1.text = text
                        textView2.text = (mBytesKBytes(text.toDouble())).toString()
                    }

                    Pair(units[1], units[3]) -> {
                        textView1.text = text
                        textView2.text = (kBytesGBytes(text.toDouble())).toString()
                    }

                    Pair(units[3], units[1]) -> {
                        textView1.text = text
                        textView2.text = (gBytesKBytes(text.toDouble())).toString()
                    }

                    Pair(units[1], units[4]) -> {
                        textView1.text = text
                        textView2.text = (kBytesTBytes(text.toDouble())).toString()
                    }

                    Pair(units[4], units[1]) -> {
                        textView1.text = text
                        textView2.text = (tBytesKBytes(text.toDouble())).toString()
                    }

                    Pair(units[1], units[5]) -> {
                        textView1.text = text
                        textView2.text = (kBytesPBytes(text.toDouble())).toString()
                    }

                    Pair(units[5], units[1]) -> {
                        textView1.text = text
                        textView2.text = (pBytesKBytes(text.toDouble())).toString()
                    }

                    Pair(units[2], units[3]) -> {
                        textView1.text = text
                        textView2.text = (mBytesGBytes(text.toDouble())).toString()
                    }

                    Pair(units[3], units[2]) -> {
                        textView1.text = text
                        textView2.text = (gBytesMBytes(text.toDouble())).toString()
                    }

                    Pair(units[2], units[4]) -> {
                        textView1.text = text
                        textView2.text = (mBytesTBytes(text.toDouble())).toString()
                    }

                    Pair(units[4], units[2]) -> {
                        textView1.text = text
                        textView2.text = (tBytesMBytes(text.toDouble())).toString()
                    }

                    Pair(units[2], units[5]) -> {
                        textView1.text = text
                        textView2.text = (mBytesPBytes(text.toDouble())).toString()
                    }

                    Pair(units[5], units[2]) -> {
                        textView1.text = text
                        textView2.text = (pBytesMBytes(text.toDouble())).toString()
                    }

                    Pair(units[3], units[4]) -> {
                        textView1.text = text
                        textView2.text = (gBytesTBytes(text.toDouble())).toString()
                    }

                    Pair(units[4], units[3]) -> {
                        textView1.text = text
                        textView2.text = (tBytesGBytes(text.toDouble())).toString()
                    }

                    Pair(units[3], units[5]) -> {
                        textView1.text = text
                        textView2.text = (gBytesPBytes(text.toDouble())).toString()
                    }

                    Pair(units[5], units[3]) -> {
                        textView1.text = text
                        textView2.text = (pBytesGBytes(text.toDouble())).toString()
                    }

                    Pair(units[4], units[5]) -> {
                        textView1.text = text
                        textView2.text = (tBytesPBytes(text.toDouble())).toString()
                    }

                    Pair(units[5], units[4]) -> {
                        textView1.text = text
                        textView2.text = (pBytesTBytes(text.toDouble())).toString()
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
                        textView1.text = (bytesKBytes(text.toDouble())).toString()
                    }

                    Pair(units[0], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kBytesBytes(text.toDouble())).toString()
                    }

                    Pair(units[2], units[0]) -> {
                        textView2.text = text
                        textView1.text = (bytesMBytes(text.toDouble())).toString()
                    }

                    Pair(units[0], units[2]) -> {
                        textView2.text = text
                        textView1.text = (mBytesBytes(text.toDouble())).toString()
                    }

                    Pair(units[3], units[0]) -> {
                        textView2.text = text
                        textView1.text = (bytesGBytes(text.toDouble())).toString()
                    }

                    Pair(units[0], units[3]) -> {
                        textView2.text = text
                        textView1.text = (gBytesBytes(text.toDouble())).toString()
                    }

                    Pair(units[4], units[0]) -> {
                        textView2.text = text
                        textView1.text = (bytesTBytes(text.toDouble())).toString()
                    }

                    Pair(units[0], units[4]) -> {
                        textView2.text = text
                        textView1.text = (tBytesBytes(text.toDouble())).toString()
                    }

                    Pair(units[5], units[0]) -> {
                        textView2.text = text
                        textView1.text = (bytesPBytes(text.toDouble())).toString()
                    }

                    Pair(units[0], units[5]) -> {
                        textView2.text = text
                        textView1.text = (pBytesBytes(text.toDouble())).toString()
                    }



                    Pair(units[2], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kBytesMBytes(text.toDouble())).toString()
                    }

                    Pair(units[1], units[2]) -> {
                        textView2.text = text
                        textView1.text = (mBytesKBytes(text.toDouble())).toString()
                    }

                    Pair(units[3], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kBytesGBytes(text.toDouble())).toString()
                    }

                    Pair(units[1], units[3]) -> {
                        textView2.text = text
                        textView1.text = (gBytesKBytes(text.toDouble())).toString()
                    }

                    Pair(units[4], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kBytesTBytes(text.toDouble())).toString()
                    }

                    Pair(units[1], units[4]) -> {
                        textView2.text = text
                        textView1.text = (tBytesKBytes(text.toDouble())).toString()
                    }

                    Pair(units[5], units[1]) -> {
                        textView2.text = text
                        textView1.text = (kBytesPBytes(text.toDouble())).toString()
                    }

                    Pair(units[1], units[5]) -> {
                        textView2.text = text
                        textView1.text = (pBytesKBytes(text.toDouble())).toString()
                    }

                    Pair(units[3], units[2]) -> {
                        textView2.text = text
                        textView1.text = (mBytesGBytes(text.toDouble())).toString()
                    }

                    Pair(units[2], units[3]) -> {
                        textView2.text = text
                        textView1.text = (gBytesMBytes(text.toDouble())).toString()
                    }

                    Pair(units[4], units[2]) -> {
                        textView2.text = text
                        textView1.text = (mBytesTBytes(text.toDouble())).toString()
                    }

                    Pair(units[2], units[4]) -> {
                        textView2.text = text
                        textView1.text = (tBytesMBytes(text.toDouble())).toString()
                    }

                    Pair(units[5], units[2]) -> {
                        textView2.text = text
                        textView1.text = (mBytesPBytes(text.toDouble())).toString()
                    }

                    Pair(units[2], units[5]) -> {
                        textView2.text = text
                        textView1.text = (pBytesMBytes(text.toDouble())).toString()
                    }

                    Pair(units[4], units[3]) -> {
                        textView2.text = text
                        textView1.text = (gBytesTBytes(text.toDouble())).toString()
                    }

                    Pair(units[3], units[4]) -> {
                        textView2.text = text
                        textView1.text = (tBytesGBytes(text.toDouble())).toString()
                    }

                    Pair(units[5], units[3]) -> {
                        textView2.text = text
                        textView1.text = (gBytesPBytes(text.toDouble())).toString()
                    }

                    Pair(units[3], units[5]) -> {
                        textView2.text = text
                        textView1.text = (pBytesGBytes(text.toDouble())).toString()
                    }

                    Pair(units[5], units[4]) -> {
                        textView2.text = text
                        textView1.text = (tBytesPBytes(text.toDouble())).toString()
                    }

                    Pair(units[4], units[5]) -> {
                        textView2.text = text
                        textView1.text = (pBytesTBytes(text.toDouble())).toString()
                    }

                }
            }
        }
    }


}