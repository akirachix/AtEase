package com.example.atease.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atease.R
//import com.example.atease.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        goNext()
    }

    fun goNext() {
       btnSignUp.setOnClickListener {
            val intent = Intent(this, HomeScreenActivity::class.java)
           startActivity(intent)
            if (etpassword.text.toString().isEmpty() || (etemail.text.toString()
                    .isEmpty() || (tvName.text.toString()
                    .isEmpty() || etphonenumber.text.toString().isEmpty()))
            ) {
                etName.setError("Enter your Name")
                etEmail.setError("Enter your Email")
                etPhoneNumber.setError("Enter your PhoneNumber")
                etPassword.setError("Enter your Password")

            }


       }
    }

}

//class Signup : AppCompatActivity() {
//    lateinit var binding:SignupActivity
//    override fun onCreate(savedInstanceState: Bundle?) {
//
//        super.onCreate(savedInstanceState)
//        binding = SignupActivity().inflate(layoutInflater)
//        setContentView(binding.root)
//
//        var firstname = binding.etFirstname.text.toString()
//
//        if (firstname.isEmpty()) {
//            binding.etEmail.setError("FirstName Required")
//
//        }
//        var lastname = binding.etName.text.toString()
//
//        if (lastname.isEmpty()) {
//            binding.etPassword.setError("LastName is required")
//        }
//
//        var password= binding.etPhoneNumber.text.toString()
//
//        if (password.isEmpty()) {
//            binding.etPassword.setError("Password  is required")
//        }
//        var confirmpassword= binding.etconfirmpassword.text.toString()
//
//        if (password.isEmpty()) {
//            binding.etconfirmpassword.setError("Password  is required")
//        }
//
//
//        binding.btncreate.setOnClickListener {
//            var intent = Intent(baseContext, Signup ::class.java)
//            startActivity(intent)
//        }
//        binding.btncreate.setOnClickListener {
//            var intent = Intent(baseContext, Signin ::class.java)
//            startActivity(intent)
//        }
//
//

