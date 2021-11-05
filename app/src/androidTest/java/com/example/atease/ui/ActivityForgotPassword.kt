package com.example.atease.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atease.R
import kotlinx.android.synthetic.main.activity_forgot_password.*

class ActivityForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_forgot_password)


        btnsendrequest.setOnClickListener {
            val intent = Intent(this, ActivityResetPassword::class.java)
            startActivity(intent)
        }



    }
}