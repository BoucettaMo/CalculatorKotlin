package com.example.calculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Button
import com.example.calculatorkotlin.databinding.ActivityConverterBinding

class ConverterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityConverterBinding
    private lateinit var arrayAdapter: ArrayAdapter<CharSequence>
    private val list = listOf(
        R.array.area, R.array.length, R.array.temperature,
        R.array.volume, R.array.mass, R.array.speed,
        R.array.data, R.array.time
    )
    private var text = "0"
    private var isUp = true
    private var selected1 = ""
    private var selected2 = ""
    private lateinit var temp: Array<String>
    private lateinit var conversionTemperature: ConversionTemperature
    private lateinit var conversionData: ConversionData
    private lateinit var conversionTime: ConversionTime
    private lateinit var conversionArea: ConversionArea
    private lateinit var conversionLength: ConversionLength
    private lateinit var conversionVolume: ConversionVolume
    private lateinit var conversionMass: ConversionMass
    private lateinit var conversionSpeed: ConversionSpeed
    private var idState = -1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_converter)
        title = "Converter of measurement units"
        binding = ActivityConverterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        conversionTemperature = ConversionTemperature(resources.getStringArray(R.array.temperature))
        conversionData = ConversionData(resources.getStringArray(R.array.data))
        conversionTime = ConversionTime(resources.getStringArray(R.array.time))
        conversionArea = ConversionArea(resources.getStringArray(R.array.area))
        conversionLength = ConversionLength(resources.getStringArray(R.array.length))
        conversionVolume = ConversionVolume(resources.getStringArray(R.array.volume))
        conversionMass = ConversionMass(resources.getStringArray(R.array.mass))
        conversionSpeed = ConversionSpeed(resources.getStringArray(R.array.speed))



        binding.area.setOnClickListener(setListener(0))
        binding.length.setOnClickListener(setListener(1))
        binding.temperature.setOnClickListener(setListener(2))
        binding.volume.setOnClickListener(setListener(3))
        binding.mass.setOnClickListener(setListener(4))
        binding.speed.setOnClickListener(setListener(5))
        binding.data.setOnClickListener(setListener(6))
        binding.time.setOnClickListener(setListener(7))
        binding.one.setOnClickListener(setListener(binding.one))
        binding.two.setOnClickListener(setListener(binding.two))
        binding.three.setOnClickListener(setListener(binding.three))
        binding.four.setOnClickListener(setListener(binding.four))
        binding.five.setOnClickListener(setListener(binding.five))
        binding.six.setOnClickListener(setListener(binding.six))
        binding.seven.setOnClickListener(setListener(binding.seven))
        binding.eight.setOnClickListener(setListener(binding.eight))
        binding.nine.setOnClickListener(setListener(binding.nine))
        binding.zero.setOnClickListener(setListener(binding.zero))

        binding.coma.setOnClickListener{
            if (idState == -1 || text.contains('.')) {
            } else {
                text += binding.coma.text.toString()
                instantConversion(idState)
            }

        }

        binding.plusMinus.setOnClickListener {
            if (idState == -1) {
                return@setOnClickListener
            }
            text = if (text.first().toString() == "-") {
                text.removeRange(0 until 1)
            } else "-$text"
            instantConversion(idState)
        }

        binding.clear.setOnClickListener {
            text = "0"
            binding.textView1.text = text
            binding.textView2.text = text

        }
        binding.back.setOnClickListener {
            when (text.length) {
                0 -> {}
                1 -> {
                    text =
                        text.removeRange(text.length - 1 until text.length) + "0"
                    when (isUp) {
                        true -> binding.textView1.text = text
                        false -> binding.textView2.text = text
                    }
                }

                else -> {
                    text =
                        text.removeRange(text.length - 1 until text.length)

                    when (isUp) {
                        true -> binding.textView1.text = text
                        false -> binding.textView2.text = text
                    }
                }
            }
            instantConversion(idState)


        }

        binding.up.setOnClickListener { isUp = true }
        binding.down.setOnClickListener { isUp = false }


    }


    private fun setListener(button: Button) = View.OnClickListener {
        if (idState == -1) {
        } else {
            text += button.text.toString()
            instantConversion(idState)
        }

    }


    private fun setListener(m: Int) = View.OnClickListener {
        idState = m
        arrayAdapter = ArrayAdapter.createFromResource(this, list[m], R.layout.spinner_view)

        binding.spinner1.adapter = arrayAdapter
        binding.spinner2.adapter = arrayAdapter

        binding.spinner1.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selected1 = binding.spinner1.adapter.getItem(position).toString()
                instantConversion(m)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
        binding.spinner2.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selected2 = binding.spinner2.adapter.getItem(position).toString()
                instantConversion(m)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }

    fun instantConversion(parameter:Int) {
        when (parameter) {
            0 -> conversionArea.conversion(
                selected1,
                selected2,
                binding.textView1,
                binding.textView2,
                isUp,
                text
            )
            1 -> conversionLength.conversion(
                selected1,
                selected2,
                binding.textView1,
                binding.textView2,
                isUp,
                text
            )
            2 -> conversionTemperature.conversion(
                selected1,
                selected2,
                binding.textView1,
                binding.textView2,
                isUp,
                text
            )

            3 -> conversionVolume.conversion(
                selected1,
                selected2,
                binding.textView1,
                binding.textView2,
                isUp,
                text
            )

            4 -> conversionMass.conversion(
                selected1,
                selected2,
                binding.textView1,
                binding.textView2,
                isUp,
                text
            )

            5 -> conversionSpeed.conversion(
                selected1,
                selected2,
                binding.textView1,
                binding.textView2,
                isUp,
                text
            )

            6 -> conversionData.conversion(
                selected1,
                selected2,
                binding.textView1,
                binding.textView2,
                isUp,
                text
            )

            7 -> conversionTime.conversion(
                selected1,
                selected2,
                binding.textView1,
                binding.textView2,
                isUp,
                text
            )


        }

    }


    }


