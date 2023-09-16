package com.davedevab.spotifyuiclone

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.davedevab.spotifyuiclone.databinding.ActivityMainBinding
import com.davedevab.spotifyuiclone.login.LogIn


class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    private val looper = Looper.myLooper()
    private val handler = looper?.let { Handler(it) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handler?.postDelayed({
            intent = Intent(this@MainActivity, LogIn::class.java)
            startActivity(intent)
            finish()
        }, 1000)

    }
}