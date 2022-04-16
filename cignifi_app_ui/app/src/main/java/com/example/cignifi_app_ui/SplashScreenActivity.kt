package com.example.cignifi_app_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.cignifi_app_ui.databinding.ActivitySplashScreenAcitvityBinding

class SplashScreenAcitvity : AppCompatActivity() {
    private var binding: ActivitySplashScreenAcitvityBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenAcitvityBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        // we used the postDelayed(Runnable, time) method
        // to send a message with a delayed time.
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3000 is the delayed time in milliseconds.
    }
}