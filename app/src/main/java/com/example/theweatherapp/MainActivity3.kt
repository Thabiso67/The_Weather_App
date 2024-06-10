package com.example.theweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val bundle: Bundle? = intent.extras
        val Exit: Button = findViewById(R.id.exit_btn2)

        Exit.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}