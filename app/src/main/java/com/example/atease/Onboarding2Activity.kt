package com.example.atease

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Onboarding2Activity : AppCompatActivity() {
    lateinit var btnButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)
        castView()
        onClickNow()
    }
    fun castView(){
        btnButton=findViewById(R.id.btnButton2)
    }
    fun onClickNow(){
        btnButton.setOnClickListener {
            val next=Intent(baseContext,Onboarding3Activity::class.java)
            startActivity(next)

        }
    }
}
