package com.example.atease.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atease.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        goNext()
    }

    fun goNext(){
           btnLogin2.setOnClickListener {
//               if(binding.etpass.text.toString().isEmpty()||(binding.etmail.text.toString().isEmpty())) {
//                   binding.etmail.setError("Enter your Email")
//                   binding.etpass.setError("Enter your Password")
               val intent = Intent(baseContext, HomeScreenActivity::class.java)
               startActivity(intent)
           }
               btnFog.setOnClickListener {
                   val intent = Intent(baseContext, ActivityForgotPassword ::class.java)
                   startActivity(intent)
               }


    }

}


