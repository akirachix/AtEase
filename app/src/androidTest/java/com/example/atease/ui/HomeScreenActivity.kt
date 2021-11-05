package com.example.atease.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.atease.databinding.ActivityHomeScreenBinding


class HomeScreenActivity : AppCompatActivity() {
    lateinit var btnHome: Button

    //    lateinit var btnHome: Button
//    lateinit var Stress: CheckBox
//    lateinit var sleep: CheckBox
//    lateinit var anxiety: CheckBox
    lateinit var binding: ActivityHomeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnHome.setOnClickListener {
            var intent = Intent(baseContext, choosingAssessmentActivity2::class.java)
            startActivity(intent)
        }
    }
}


//    fun onCheckboxClicked(view: View) {
//        if (view is CheckBox) {
//                if (view.isChecked) {
//                    val intent = Intent(baseContext, choosingAssessmentActivity2::class.java)
//                    startActivity(intent)
//                }
//                if (view.isChecked) {
//                    val intent = Intent(baseContext, ActivitySleep::class.java)
//                    startActivity(intent)
//                }
//                if (view.isChecked) {
//                    val intent = Intent(baseContext, ActivityAnxiety::class.java)
//                    startActivity(intent)
//                }
//            }
//
//    }

