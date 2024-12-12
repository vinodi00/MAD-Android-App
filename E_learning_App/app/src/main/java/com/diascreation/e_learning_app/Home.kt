package com.diascreation.e_learning_app

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Setup bottom navigation
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(this@Home, Home::class.java)
                    startActivity(intent)
                    true
                }
                R.id.calendar -> {
                    val intent = Intent(this@Home, Calender::class.java)
                    startActivity(intent)
                    true

                }
                R.id.add -> {
                    // Open the Popup activity when add is clicked
                    val intent = Intent(this@Home, Popup::class.java)
                    startActivity(intent)
                    true
                }
                R.id.Activity -> {
                    val intent = Intent(this@Home, Popup::class.java)
                    startActivity(intent)
                    true
                }
                R.id.settings -> {
                    val intent = Intent(this@Home, settings::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}