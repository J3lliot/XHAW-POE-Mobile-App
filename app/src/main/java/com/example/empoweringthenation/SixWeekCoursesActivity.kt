package com.example.empoweringthenation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class SixWeekCoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_week_courses)

        val courseDetails = findViewById<TextView>(R.id.textCourseDetails)
        courseDetails.text = "6-week Courses:\n\n1. Child Minding\nFees:R750\nPurpose:To provide basic child and baby care\nContent:\nBirth to six-month old baby needs\nSeven-month to one year old needs\nToddler needs\nEducational toys\n\n2. Cooking\nFees:R750\nPurpose:To prepare and cook nutritious family meals\nContent:\nNutritional requirements for a healthy body\nTypes of protein, carbohydrates and vegetables\nPlanning meals\nPreparation and cooking of meals\n\n3. Garden Maintenance\nFees:R750\nPurpose:To provide basic knowledge of watering, pruning and planting in a domestic garden\nContent:\nWater restrictions and the watering requirements of indigenous and exotic plants\nPruning and propagation of plants\nPlanting techniques for different plant types"

        val btnBackToHome = findViewById<Button>(R.id.btnBackToHome)

        btnBackToHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}