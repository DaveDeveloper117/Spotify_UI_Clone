package com.davedevab.spotifyuiclone.login.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davedevab.spotifyuiclone.R
import com.davedevab.spotifyuiclone.databinding.ActivityChoosePodcastBinding
import com.davedevab.spotifyuiclone.home.Home
import com.davedevab.spotifyuiclone.login.signin.SignUp3

class ChoosePodcast : AppCompatActivity() {
    private lateinit var binding: ActivityChoosePodcastBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChoosePodcastBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener {
            intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }

    }
}