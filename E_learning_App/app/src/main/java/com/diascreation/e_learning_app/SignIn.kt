package com.diascreation.e_learning_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()  // Enabling edge-to-edge mode if required
        setContentView(R.layout.activity_sign_in)

        // Apply system insets to the layout (for edge-to-edge layout)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the sign-in button by its ID
        val signInButton: View = findViewById(R.id.btnSignIn)

        // Set an OnClickListener to the button to handle the click event
        signInButton.setOnClickListener {
            // Navigate to HomeActivity when sign-in button is clicked
            val intent = Intent(this@SignIn, Home::class.java)
            startActivity(intent)

            // Optional: Call finish() if you want to close the sign-in activity after navigation
            finish()
        }
    }

}