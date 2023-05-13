package com.example.calculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.calculatorkotlin.databinding.ActivityFunctionsBinding

class FunctionsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFunctionsBinding
    private var editString = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_functions)
        binding= ActivityFunctionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

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
        binding.coma.setOnClickListener(setListener(binding.coma))


    }


    private fun setListener(button: Button) = View.OnClickListener {
        editString += button.text.toString()
        binding.textView1.text = editString


    }

}