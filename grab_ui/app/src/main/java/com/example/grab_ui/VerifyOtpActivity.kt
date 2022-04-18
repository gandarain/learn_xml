package com.example.grab_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.grab_ui.databinding.ActivityVerifyOtpBinding

class VerifyOtpActivity : AppCompatActivity() {
    private var binding: ActivityVerifyOtpBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerifyOtpBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setupToolbar()
    }

    /**
     * Setup the toolbar
     */
    private fun setupToolbar() {
        // set the toolbar
        setSupportActionBar(binding?.toolBarOtp)

        // setup the back button
        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "Verify OTP"
        }
        // on press back
        binding?.toolBarOtp?.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}