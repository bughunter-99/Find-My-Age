package com.example.findmyage

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        yearOfBirth.setHint(R.string.hint)
        buFindAge.setText(R.string.button_name)
        buFindAge.setOnClickListener {
            val yearOfBirth = yearOfBirth.text.toString()
            if(yearOfBirth == ""){
                showAge.text ="Please enter a valid age."
                showAge.setTextColor(Color.RED)
            } else{
                val currentYear  = Calendar.getInstance().get(Calendar.YEAR)
                val myAge = currentYear - yearOfBirth.toInt()
                showAge.setTextColor(Color.BLUE)
                showAge.text = "your age is $myAge"
            }

        }
    }
}