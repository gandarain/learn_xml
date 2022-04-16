package com.example.cignifi_app_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cignifi_app_ui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}