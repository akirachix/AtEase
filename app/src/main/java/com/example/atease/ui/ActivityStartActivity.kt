package com.example.atease

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sleep.*
import kotlinx.android.synthetic.main.activity_start.*

class ActivityStartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        start()
        btnImage2.setOnClickListener {
            var intent= Intent(baseContext, WellDoneActivity::class.java)
            startActivity(intent)
        }
    }

    fun start (){
        btnProfile. setOnClickListener{
            val intent= Intent(baseContext, com.example.atease.ui.UserProfile::class.java)
            startActivity(intent)
        }
    }
}