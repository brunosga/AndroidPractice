package com.example.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main2.*
import kotlin.math.log

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var count = 0
        btnCount.setOnClickListener {
            count++
            tvCount.text = "Você ja chukou: $count"
            Log.d("MainActivity2", "Você ja chukou: $count")
        }

        btnBack.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }

        btnNextActivity2.setOnClickListener {
            Intent(this, MainActivity3::class.java).also {
                startActivity(it)
            }
        }
    }
}