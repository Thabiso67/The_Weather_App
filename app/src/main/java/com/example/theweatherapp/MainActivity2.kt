package com.example.theweatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private val days = mutableListOf<String>()
    private val min = mutableListOf<Int>()
    private val max = mutableListOf<Int>()
    private val condition = mutableListOf<String>()

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val Save: Button = findViewById(R.id.save_btn)
        val View: Button = findViewById(R.id.view_btn)
        val Clear: Button = findViewById(R.id.clear_btn)
        val Exit: Button = findViewById(R.id.exit_btn)
        val EditText: EditText = findViewById(R.id.editText)
        val TextView: TextView = findViewById(R.id.textView3)
        val bundle: Bundle? = intent.extras

        Clear.setOnClickListener { EditText.text.clear() }

        View.setOnClickListener {

            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

            Exit.setOnClickListener {

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

            }
        }
    }
}