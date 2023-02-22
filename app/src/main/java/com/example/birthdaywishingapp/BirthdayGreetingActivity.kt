package com.example.birthdaywishingapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {

    lateinit var txtbirthdaygreeting: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        txtbirthdaygreeting = findViewById(R.id.txtbirthdaygreeting)

        // Yaha pe ham us intent k content ko recieve krenge

        val name = intent.getStringExtra("iname")

        if(intent != null) {
            txtbirthdaygreeting.text = "Happy Birthday\n$name"
        }



    }
}