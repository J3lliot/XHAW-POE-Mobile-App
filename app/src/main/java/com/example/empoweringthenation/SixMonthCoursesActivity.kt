package com.example.empoweringthenation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button
import android.content.Intent

class SixMonthCoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_month_courses)

        val courseDetails = findViewById<TextView>(R.id.textCourseDetails)
        courseDetails.text =
            "6-month Courses:\n\n1. First Aid\nFees:R1500\nPurpose:To provide first aid awareness and basic life support\nContent:\nWounds and bleeding\nBurns and fractures\nEmergency scene management\nCardio-Pulmonary Resuscitation (CPR)\nRespiratory distress e.g. Choking, blocked airway\n\n2. Sewing\nFees:1500\nPurpose: To provide alterations and new garment tailoring services\nContent:\nTypes of stitches\nThreading a sewing machine\nSewing buttons,zips,hems and seams\nAlterations\nDesigning and sewing new garments\n\n3. Landscaping\nFees:R1500\nPurpose:To provide landscaping services for new and established gardens\nContext:\nIndigenous and exotic plants and trees\nFixed structures (fountains, statues, benches, tables, built-in braai)\nBalancing of plants and trees in a garden\nAesthetics of plant shapes and colours\nGarden layout\n\n4. Life Skills\nFees:R1500\nPurpose:To provide skills to navigate basic life necessities\nContent:\nOpening a bank account\nBasic labour law (know your rights)\nBasic reading and writing literacy\nBasic numeric literacy"

        val btnBackToHome = findViewById<Button>(R.id.btnBackToHome)

        btnBackToHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}