package com.example.atease

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignupActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etEmail: EditText
    lateinit var etPhoneNumber: EditText
    lateinit var etPassword: EditText
    lateinit var btnSignUp:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        castingViews()
        onClickListener()
    }


    fun castingViews() {
        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        etPhoneNumber = findViewById(R.id.etPhoneNumber)
        etPassword = findViewById(R.id.etPassword)
        btnSignUp = findViewById(R.id.btnSignUp)

    }

    fun onClickListener(){
        if(etName.text.toString().isEmpty()||(etPassword.text.toString().isEmpty())||etEmail.text.toString().isEmpty()||(etPhoneNumber.text.toString().isEmpty())) {
            etName.setError("Enter your Name")
            etEmail.setError("Enter your Email")
            etPassword.setError("Enter your Password")
            etPhoneNumber.setError("Write your contact")

            var btnSignUp = findViewById<Button>(R.id.btnSignUp)
            btnSignUp.setOnClickListener {
                var intent = Intent(baseContext, HomeActivity::class.java)
                startActivity(intent)
            }
           }
}

//class Signup : AppCompatActivity() {
//    lateinit var binding: ActivitySignupBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//
//        super.onCreate(savedInstanceState)
//        binding = ActivitySignupBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        var firstname = binding.etFirstname.text.toString()
//
//        if (firstname.isEmpty()) {
//            binding.etemail.setError("FirstName Required")
//
//        }
//        var lastname = binding.etlastname.text.toString()
//
//        if (lastname.isEmpty()) {
//            binding.etpassword.setError("LastName is required")
//        }
//
//        var password= binding.etpassword.text.toString()
//
//        if (password.isEmpty()) {
//            binding.etpassword.setError("Password  is required")
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


    }
