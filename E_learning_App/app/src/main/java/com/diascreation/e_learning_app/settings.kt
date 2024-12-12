package com.diascreation.e_learning_app

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class settings : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Back button functionality
        val backButton: ImageButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            try {
                // Navigates to the previous page
                finish() // This closes the current activity and returns to the previous one
            } catch (e: Exception) {
                // Error handling if something goes wrong
                Toast.makeText(this, "Unable to go back", Toast.LENGTH_SHORT).show()
            }
        }

        // Power button functionality - Navigates to MainActivity
        val powerButton: ImageButton = findViewById(R.id.powerButton)
        powerButton.setOnClickListener {
            try {
                val intent = Intent(this, MainActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
                finish() // Closes the current activity to prevent the user from coming back
            } catch (e: Exception) {
                // Error handling in case the intent fails
                Toast.makeText(this, "Unable to open main page", Toast.LENGTH_SHORT).show()
            }
        }

        // Card Click Listeners for navigation
        val generalCard: CardView = findViewById(R.id.generalCard)
        generalCard.setOnClickListener {
            try {
                val intent = Intent(this, General::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                Toast.makeText(this, "Unable to open General page", Toast.LENGTH_SHORT).show()
            }
        }

        val statsCard: CardView = findViewById(R.id.statsCard)
        statsCard.setOnClickListener {
            try {
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                Toast.makeText(this, "Unable to open Stats page", Toast.LENGTH_SHORT).show()
            }
        }

        val pomodoroCard: CardView = findViewById(R.id.pomodoroCard)
        pomodoroCard.setOnClickListener {
            try {
                val intent = Intent(this, Timer::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                Toast.makeText(this, "Unable to open Pomodoro page", Toast.LENGTH_SHORT).show()
            }
        }

        val aboutCard: CardView = findViewById(R.id.aboutCard)
        aboutCard.setOnClickListener {
            try {
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                Toast.makeText(this, "Unable to open About page", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
