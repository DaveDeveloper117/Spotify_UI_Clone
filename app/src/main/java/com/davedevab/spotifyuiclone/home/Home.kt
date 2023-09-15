package com.davedevab.spotifyuiclone.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.davedevab.spotifyuiclone.R
import com.davedevab.spotifyuiclone.databinding.ActivityHomeBinding
import com.davedevab.spotifyuiclone.home.content.Home
import com.davedevab.spotifyuiclone.home.content.Library
import com.davedevab.spotifyuiclone.home.content.Search

class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.home -> replaceFragment(Home())
                R.id.search -> replaceFragment(Search())
                R.id.library -> replaceFragment(Library())
                else ->{
                }
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment){
        val  fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }

}

