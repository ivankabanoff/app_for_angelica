package com.example.lognormalcalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import com.example.myapplication.R

class MainActivity : AppCompatActivity() {

    private val lognormalCalculator = LognormalCalculator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val meanEditText = findViewById<EditText>(R.id.mean_val)
        val varianceEditText = findViewById<EditText>(R.id.variance_value)
        val getRandomButton = findViewById<Button>(R.id.get_random_num)
        val randomNumberResult = findViewById<TextView>(R.id.random_number_result)

        getRandomButton.setOnClickListener {
            val mean = meanEditText.text.toString().toDouble()
            val variance = varianceEditText.text.toString().toDouble()
            val randomNumber = lognormalCalculator.generateRandomLognormalNumber(mean, variance)
            randomNumberResult.text = randomNumber.toString()
        }
    }

}
