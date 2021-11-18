package com.example.atease.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.atease.R

class ActivitySleep : AppCompatActivity() {
    lateinit var cvExams: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anxiety)
        exams()
        viewExams()
    }

    fun exams() {
        cvExams = findViewById(R.id.cvExams)
    }

    fun viewExams() {
        cvExams.setOnClickListener {
            var intent = Intent(baseContext, WellDoneActivity::class.java)
            startActivity(intent)
        }
    }
}
