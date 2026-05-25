package com.example.ascii_app

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.collections.plusAssign
import kotlin.inc

class MainActivity : AppCompatActivity() {
    fun pattern(): String {

        // Added loop counter
        var counter = 1
        var artPattern = ""
        //Added while loop for art pattern
        while (counter <= 7) {
            //Variable to control the stars in each row
            var stars= 1
            //Inner loop to control the stars in each arrow
            while (stars<= counter) {
            //increment the star per row
            artPattern += "*"
            stars++
        }
            //Move to the next line
            artPattern += "\n"
            //Increment counter per row
            counter++
        }
        return pattern()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //Added variable to text view
        val textView = findViewById<TextView>(R.id.artTxt)

        textView.text= pattern()



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}