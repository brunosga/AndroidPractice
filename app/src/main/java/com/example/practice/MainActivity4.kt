package com.example.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        btnAddImage.setOnClickListener {
            ivImage.setImageResource(R.drawable.eren)
        }

        btnBack3.setOnClickListener {
            Intent(this, MainActivity3::class.java).also {
                startActivity(it)
            }
        }

        btnNextActivity4.setOnClickListener {
            Intent(this, MainActivity5::class.java).also {
                startActivity(it)
            }
        }
    }
}