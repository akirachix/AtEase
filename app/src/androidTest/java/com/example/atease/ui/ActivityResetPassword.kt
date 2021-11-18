package com.example.atease.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.atease.R
import com.example.atease.databinding.ActivityForgotPasswordBinding

class ActivityResetPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)
        val binding: ActivityForgotPasswordBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_forgot_password
        )

        binding.btnsendrequest.setOnClickListener {
            val intent = Intent(this, HomeScreenActivity::class.java)
            startActivity(intent)
        }
    }

}