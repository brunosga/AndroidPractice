package com.example.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        btnAdd.setOnClickListener {
            val firstNumber = etFirstNumber.text.toString().toInt()
            val secondNumber = etSecondNumber.text.toString().toInt()
            val result = firstNumber + secondNumber
            tvResult.text = result.toString()
            Log.d("MainActivity3", "User entered the first number $firstNumber and $secondNumber as the second number, the sum is $result.")
        }

        btnBack2.setOnClickListener {
            Intent(this, MainActivity2::class.java).also {
                startActivity(it)
            }
        }

        btnNextActivity3.setOnClickListener {
            Intent(this, MainActivity4::class.java).also {
                startActivity(it)
            }
        }
    }
}