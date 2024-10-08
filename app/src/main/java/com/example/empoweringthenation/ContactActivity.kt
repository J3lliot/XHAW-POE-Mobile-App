package com.example.empoweringthenation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class ContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val contactDetails = findViewById<TextView>(R.id.textContactDetails)
        contactDetails.text = "Contact Details:\n\nPhone: 123-456-7890\n\nEmail: info@empoweringthenation.com\n\nLocation: Johannesburg"

        val btnBackToHome = findViewById<Button>(R.id.btnBackToHome)

        btnBackToHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}