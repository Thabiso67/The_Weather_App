package com.example.theweatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Button: Button = findViewById(R.id.start_btn)

        Button.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}