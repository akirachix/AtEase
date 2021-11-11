package com.example.atease

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Onboarding1Activity : AppCompatActivity() {
    lateinit var btnButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)
        castView()
        onClickNow()

    }
    fun castView(){
        btnButton=findViewById<Button>(R.id.btnButton)
    }
    fun onClickNow(){
        btnButton.setOnClickListener {
            val next=Intent(baseContext, com.example.atease.ui.Onboarding2Activity::class.java)
            startActivity(next)
        }

    }
}
