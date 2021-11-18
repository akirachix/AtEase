package com.example.atease.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.atease.R

class Onboarding3Activity : AppCompatActivity() {
    lateinit var btnsignup:Button
    lateinit var btnLogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)
        castView()
        onClickNow()

    }

    fun castView(){
        btnsignup=findViewById(R.id.btnsignup)
        btnLogin=findViewById(R.id.btnLogin)
    }

    fun onClickNow(){
         btnsignup.setOnClickListener {
             val signup=Intent(baseContext, SignupActivity::class.java)
             startActivity(signup)
         }

        btnLogin.setOnClickListener {
            val login=Intent(baseContext, LoginActivity::class.java)
            startActivity(login)

        }

    }
}


