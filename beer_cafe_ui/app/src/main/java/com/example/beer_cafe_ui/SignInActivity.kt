package com.example.beer_cafe_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beer_cafe_ui.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    private var binding: ActivitySignInBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setupToolbar()
    }

    /**
     * Setup the toolbar
     */
    private fun setupToolbar() {
        // set the toolbar
        setSupportActionBar(binding?.toolBarSignIn)

        // setup the back button
        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "Sign In"
        }
        // on press back
        binding?.toolBarSignIn?.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}