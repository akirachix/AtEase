package com.example.atease

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.atease.databinding.ActivityLoginBinding
import com.example.atease.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        goNext()
    }

    fun goNext() {
        binding.btnSignUp.setOnClickListener {
            if (binding.etPassword.text.toString().isEmpty() || (binding.etEmail.text.toString()
                    .isEmpty() || (binding.etName.text.toString()
                    .isEmpty() || binding.etPhoneNumber.text.toString().isEmpty()))
            ) {
                binding.etName.setError("Enter your Name")
                binding.etEmail.setError("Enter your Email")
                binding.etPhoneNumber.setError("Enter your PhoneNumber")
                binding.etPassword.setError("Enter your Password")
                val intent = Intent(baseContext, HomeScreenActivity::class.java)
                startActivity(intent)
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

