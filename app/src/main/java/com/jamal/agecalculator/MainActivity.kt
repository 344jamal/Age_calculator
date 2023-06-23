package com.jamal.agecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun BuClickEvent(view: View) {
        val DOB = findViewById<EditText>(R.id.txtdob)
        val showage = findViewById<TextView>(R.id.txtshow)
        val userDOB:String = DOB.text.toString()
        if (userDOB.toInt() == 0 ){
            showage.text = "Invalid Input"
            return
        }
        if (userDOB.toInt() >= 2023){
            showage.text = "Please put Correct year"
            return
        }
        val year:Int = Calendar.getInstance().get(Calendar.YEAR)
        val myAge = year - userDOB.toInt()
        showage.text = "Your Age is $myAge"
    }
}