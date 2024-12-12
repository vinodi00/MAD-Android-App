package com.diascreation.e_learning_app

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button


class GetStarted3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_get_started3)

        // Find the start button by its ID
        val startButton:Button = findViewById(R.id.button) // Make sure you have this ID in your XML layout

        // Set an OnClickListener on the start button
        startButton.setOnClickListener {
            val intent = Intent(this@GetStarted3, SignIn::class.java)
            startActivity(intent)
            finish() // Optional: Call finish() if you want to remove this activity from the back stack
        }
    }
}
