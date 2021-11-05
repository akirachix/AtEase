package com.example.atease.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atease.R
import kotlinx.android.synthetic.main.activity_well_done.*

class WellDoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_well_done)
        start()
    }
    fun start (){
       btnWelldone. setOnClickListener{
            val intent=Intent(baseContext, ActivityStartActivity::class.java)
            startActivity(intent)
        }
    }

}

