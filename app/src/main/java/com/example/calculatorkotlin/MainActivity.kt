package com.example.calculatorkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.calculatorkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private var editString = ""
    private var isComa = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.converter.setOnClickListener {
            val intent = Intent(this, ConverterActivity::class.java)
            startActivity(intent)
        }

        binding.functions.setOnClickListener {
            val intent = Intent(this, FunctionsActivity::class.java)
            startActivity(intent)
        }



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

        binding.plus.setOnClickListener(setListener(binding.plus))
        binding.minus.setOnClickListener(setListener(binding.minus))
        binding.division.setOnClickListener(setListener(binding.division))
        binding.multiply.setOnClickListener(setListener(binding.multiply))
        binding.coma.setOnClickListener(this)
        binding.percent.setOnClickListener(this)
        binding.bracket.setOnClickListener(this)
        binding.clear.setOnClickListener(this)
        binding.back.setOnClickListener(this)
        binding.equal.setOnClickListener(this)
        binding.plusMinus.setOnClickListener(this)

    }


    private fun setListener(button: Button) = View.OnClickListener {
        val operation = listOf("/", "—", "x", "+")

         if (operation.contains(button.text.toString()) && editString.isEmpty()) {return@OnClickListener}
        else if (operation.contains(button.text.toString()) && operation.contains(
                editString.last().toString()
            )
        ) {
            editString =
                editString.removeRange(editString.length - 1 until editString.length) + button.text.toString()
            isComa = true

         } else if (operation.contains(button.text.toString())) {
            editString += button.text.toString()
            isComa = true

         } else {
            editString += button.text.toString()

         }

        binding.operation.text = editString
     //   binding.result.text = Computation.evaluateExpression(editString).toString()


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.clear.id -> {
                editString = ""
                binding.operation.text = editString
                binding.result.text = ""
                isComa = true
            }

            binding.back.id -> {
                if (editString.isEmpty()) {
                    return
                } else {
                    if (editString.last().toString() == ".") isComa = true
                    editString =
                        editString.removeRange(editString.length - 1 until editString.length)
                    binding.operation.text = editString
                  //  binding.result.text = Computation.evaluateExpression(editString).toString()
                }
            }

            binding.coma.id -> {
                val operation = listOf("+", "—", "x", "/")
                if (editString.isEmpty() || operation.contains(editString.last().toString()) ) {
                    editString += "0."
                    isComa = !isComa
                } else if (isComa) {
                    editString += "."
                    isComa = !isComa
                }
                binding.operation.text = editString
               // binding.result.text = Computation.evaluateExpression(editString).toString()
            }

            binding.equal.id -> {
                val string = binding.operation.text.toString()
                binding.result.text = Computation.evaluateExpression(string).toString()
            }

            binding.percent.id -> {
                if (editString.isEmpty()) {return }
                val list = Computation.separateOperandAndOperator(editString)[0]
                val length = list.last().length
                val last = (list[list.size - 1].toDouble() / 100).toString()
                editString =
                    "${editString.removeRange(editString.length - length until editString.length)}$last"
                binding.operation.text = editString
              //  binding.result.text = Computation.evaluateExpression(editString).toString()
            }

            binding.plusMinus.id -> {
                if (editString.isEmpty()) editString+="-"
            }


        }

    }

}