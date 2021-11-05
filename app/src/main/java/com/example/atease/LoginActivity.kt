package com.example.atease

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.atease.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        goNext()
    }

    fun goNext(){
           binding.btnLogin2.setOnClickListener {
//               if(binding.etpass.text.toString().isEmpty()||(binding.etmail.text.toString().isEmpty())) {
//                   binding.etmail.setError("Enter your Email")
//                   binding.etpass.setError("Enter your Password")
                   val intent = Intent(baseContext,HomeScreenActivity::class.java)
                   startActivity(intent)
            }

    }

}


