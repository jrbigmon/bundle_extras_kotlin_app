package com.example.bundleextras

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bundleextras.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOk.setOnClickListener({
            val number = binding.editTextInsertNumber.text.toString().trim().toInt()

            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("number1", number)
            startActivity(i)
        })
    }
}