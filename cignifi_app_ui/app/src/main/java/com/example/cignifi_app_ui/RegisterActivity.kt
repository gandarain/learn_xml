package com.example.cignifi_app_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cignifi_app_ui.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private var binding: ActivityRegisterBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setupToolbar()
    }

    /**
     * Setup the toolbar
     */
    private fun setupToolbar() {
        // set the toolbar
        setSupportActionBar(binding?.toolBarSignUp)

        // setup the back button
        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "Register Account"
        }
        // on press back
        binding?.toolBarSignUp?.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}