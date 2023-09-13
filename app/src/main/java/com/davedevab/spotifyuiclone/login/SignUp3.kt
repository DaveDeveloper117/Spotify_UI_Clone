package com.davedevab.spotifyuiclone.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.davedevab.spotifyuiclone.R
import com.davedevab.spotifyuiclone.databinding.ActivitySignUp3Binding

class SignUp3 : AppCompatActivity() {
    private lateinit var binding: ActivitySignUp3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUp3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = listOf("Male","Female","Other")
        val adapter = ArrayAdapter(this, R.layout.list_item, items)
        binding.genderDropDown.setAdapter(adapter)

    }
}