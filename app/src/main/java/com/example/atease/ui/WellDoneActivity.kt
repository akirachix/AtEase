package com.example.atease

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_well_done.*

class WellDoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_well_done)
        start()
    }
    fun start (){
       btnWelldone. setOnClickListener{
            val intent=Intent(baseContext, com.example.atease.ui.ActivityStartActivity::class.java)
            startActivity(intent)
        }
    }

}

