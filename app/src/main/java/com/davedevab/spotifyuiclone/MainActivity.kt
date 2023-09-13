package com.davedevab.spotifyuiclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.davedevab.spotifyuiclone.login.LogIn

class MainActivity : AppCompatActivity() {
    private val looper = Looper.myLooper()
    private val handler = looper?.let { Handler(it) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handler?.postDelayed({
            val intent = Intent(this@MainActivity, LogIn::class.java)
            startActivity(intent)
            finish()
        }, 1000)

    }
}