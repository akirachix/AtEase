package com.example.atease.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.atease.R

class ActivityWallet : AppCompatActivity() {
    lateinit var btnTopup: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallet)
        profile()
        viewProfile()

    }
    fun profile(){
        btnTopup=findViewById(R.id.btnTopup)
}
    fun viewProfile(){
        btnTopup.setOnClickListener {
            var intent=Intent(baseContext, HomeScreenActivity::class.java)
            startActivity(intent)
        }
    }


}