package com.team1.volunteerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.team1.volunteerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
    }
}