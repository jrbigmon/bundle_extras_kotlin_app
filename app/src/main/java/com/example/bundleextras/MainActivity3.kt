package com.example.bundleextras

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bundleextras.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        val number1 = i.extras?.getInt("number1")
        val number2 = i.extras?.getInt("number2")

        var soma = 0

        if (number1 != null && number2 != null) {
            soma = number1 + number2
        }

        binding.textViewResult.setText("Soma ${soma}")
    }
}