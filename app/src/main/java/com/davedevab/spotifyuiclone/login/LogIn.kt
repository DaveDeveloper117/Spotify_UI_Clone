package com.davedevab.spotifyuiclone.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davedevab.spotifyuiclone.databinding.ActivityLogInBinding
import com.davedevab.spotifyuiclone.login.signin.SignUp

class LogIn : AppCompatActivity() {
    private lateinit var binding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signInButton.setOnClickListener {
            intent = Intent(this, SignUp::class.java)
            startActivity(intent)
            finish()
        }

    }
}