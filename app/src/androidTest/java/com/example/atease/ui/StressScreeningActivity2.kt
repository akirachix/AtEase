package com.example.atease.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atease.R
import kotlinx.android.synthetic.main.activity_stress_screening2.*


class stressScreeningActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stress_screening2)


        btnBarely.setOnClickListener{
            var intent= Intent(baseContext, stressScreeningActivity2::class.java)
            startActivity(intent)
        }

        btnImage.setOnClickListener {
            var intent= Intent(baseContext, WellDoneActivity::class.java)
            startActivity(intent)
        }
    }



}

