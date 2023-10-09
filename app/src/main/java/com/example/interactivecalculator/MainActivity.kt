package com.example.interactivecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextNumber1 = findViewById<EditText>(R.id.editTextNumber1)
        val editTextNumber2 = findViewById<EditText>(R.id.editTextNumber2)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        calculateButton.setOnClickListener {
            val num1 = editTextNumber1.text.toString().toDouble()
            val num2 = editTextNumber2.text.toString().toDouble()
            val sum = num1 + num2
            resultTextView.text = "Result: $sum"
        }
    }
}
