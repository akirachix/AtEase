package com.example.atease.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atease.R
import kotlinx.android.synthetic.main.activity_user_profile.*

class UserProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        userProfile()
    }
    fun userProfile(){
       btnLogout.setOnClickListener {
            var intent=Intent(baseContext, ActivityWallet::class.java)
            startActivity(intent)
        }
    }
}
