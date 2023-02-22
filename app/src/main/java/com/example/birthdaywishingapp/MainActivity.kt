package com.example.birthdaywishingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var txtEnterName : TextView
    lateinit var etName: EditText
    lateinit var btnCreateCard: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        txtEnterName = findViewById(R.id.txtEnterName)
        etName = findViewById(R.id.etName)
        btnCreateCard = findViewById(R.id.btnCreateCard)

        val name: String? = etName.editableText.toString() //-> To show the editable text in button when clicked

        btnCreateCard.setOnClickListener {
           // Toast.makeText(this@MainActivity, "name is $name", Toast.LENGTH_LONG).show()
            val intent = Intent(this@MainActivity, BirthdayGreetingActivity::class.java )
            intent.putExtra("iname",name) // --> Intent me daalke dusre activity m bhj diya!!
            startActivity(intent)
            finish()
        }



    }
}