package com.example.atease

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_forgot_password.*

class ActivityForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_forgot_password)


        btnsendrequest.setOnClickListener {
            val intent = Intent(this, com.example.atease.ui.ActivityResetPassword::class.java)
            startActivity(intent)
        }

    }
}