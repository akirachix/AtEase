package com.example.atease

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import com.example.atease.databinding.ActivityHomeScreenBinding

class HomeScreenActivity : AppCompatActivity() {
    lateinit var btnHome: Button
    lateinit var stress: CheckBox
    lateinit var sleep: CheckBox
    lateinit var anxiety: CheckBox
    lateinit var binding: ActivityHomeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
                if (stress.isChecked) {
                    val intent = Intent(baseContext, ActivityStress::class.java)
                    startActivity(intent)
                }
                if (sleep.isChecked) {
                    val intent = Intent(baseContext, ActivitySleep::class.java)
                    startActivity(intent)
                }
                if (anxiety.isChecked) {
                    val intent = Intent(baseContext, ActivityAnxiety::class.java)
                    startActivity(intent)
                }
            }

    }
}
