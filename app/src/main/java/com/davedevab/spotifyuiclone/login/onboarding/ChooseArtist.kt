package com.davedevab.spotifyuiclone.login.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davedevab.spotifyuiclone.R
import com.davedevab.spotifyuiclone.databinding.ActivityChooseArtistBinding
import com.davedevab.spotifyuiclone.login.signin.SignUp3

class ChooseArtist : AppCompatActivity() {
    private lateinit var binding: ActivityChooseArtistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseArtistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener {
            intent = Intent(this, ChoosePodcast::class.java)
            startActivity(intent)
            finish()
        }

        binding.backFAB.setOnClickListener {
            intent = Intent(this, SignUp3::class.java)
            startActivity(intent)
            finish()
        }
    }
}