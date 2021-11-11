package com.example.atease.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atease.R
import kotlinx.android.synthetic.main.activity_choosing_assessment2.*

class choosingAssessmentActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choosing_assessment2)


//        var tvAssess: TextView = findViewById(R.id.tvAnxienty)
//        var tvStress: TextView = findViewById(R.id.tvStres)
//        var tvTime: TextView = findViewById(R.id.tvTime)
//        var tvSleep: TextView = findViewById(R.id.tvSleep)
//        var tvsleep: TextView = findViewById(R.id.tvsleep)

        btnStart.setOnClickListener {
            var intent = Intent(baseContext, stressScreeningActivity2::class.java)
            startActivity(intent)
        }
        btnanxiety.setOnClickListener {
            var intent = Intent(baseContext, ActivityAnxiety::class.java)
            startActivity(intent)
        }
        btnDelete.setOnClickListener {
            var intent = Intent(baseContext, ActivitySleep::class.java)
            startActivity(intent)
        }
    }
}


//        btnStart.setOnClickListener {
//            Toast.makeText(this, "Start Assessment", Toast.LENGTH_LONG).show()
//        }
//        btnanxiety.setOnClickListener {
//            Toast.makeText(this, "Start Assessment", Toast.LENGTH_LONG).show()
//        }
//        btnDelete.setOnClickListener {
//            Toast.makeText(this, "Start Assessment",Toast.LENGTH_LONG ).show()
//        }


