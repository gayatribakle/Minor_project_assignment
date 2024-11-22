package com.sanjivani.assignment_1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val Edit1 = findViewById<EditText>(R.id.e1)
        val Edit2 = findViewById<EditText>(R.id.e2)
        val Edit3 = findViewById<EditText>(R.id.e3)
        val Edit4 = findViewById<EditText>(R.id.e4)
        val Edit5 = findViewById<EditText>(R.id.e5)
        val submit = findViewById<Button>(R.id.b1)
        submit.setOnClickListener {
            var isvalid = true
            if (Edit1.text.toString().trim().isEmpty()) {
                Edit1.error = "This feild cannot be Blank"
                isvalid = false
            }
            if (Edit2.text.toString().trim().isEmpty()) {
                Edit2.error = "This feild cannot be Blank"
                isvalid = false
            }
            if (Edit3.text.toString().trim().isEmpty()) {
                Edit3.error = "This feild cannot be Blank"
                isvalid = false
            }
            if (Edit4.text.toString().trim().isEmpty()) {
                Edit4.error = "This feild cannot be Blank"
                isvalid = false
            }
            if (Edit5.text.toString().trim().isEmpty()) {
                Edit5.error = "This feild cannot be Blank"
                isvalid = false
            }
            if (isvalid) {
                Toast.makeText(this, "All feilds are filled", Toast.LENGTH_SHORT).show()
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}