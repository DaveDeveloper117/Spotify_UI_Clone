package com.davedevab.spotifyuiclone.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.core.content.ContextCompat
import com.davedevab.spotifyuiclone.R
import com.davedevab.spotifyuiclone.databinding.ActivitySignUp2Binding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SignUp2 : AppCompatActivity() {
    lateinit var binding: ActivitySignUp2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUp2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.isEnabled = false

        binding.passEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
            override fun afterTextChanged(s: Editable?) {
                if (s.isNullOrBlank()) {
                    binding.nextButton.isEnabled = false
                    ContextCompat.getColor(this@SignUp2, R.color.md_theme_dark_outlineVariant)
                    binding.nextButton.backgroundTintList = ContextCompat.getColorStateList(this@SignUp2, R.color.md_theme_dark_outlineVariant)
                } else {
                    binding.nextButton.isEnabled = true
                    ContextCompat.getColor(this@SignUp2, R.color.green)
                    binding.nextButton.backgroundTintList = ContextCompat.getColorStateList(this@SignUp2, R.color.green)
                }
            }

        })

        binding.nextButton.setOnClickListener {
            val intent = Intent(this, SignUp3::class.java)
            startActivity(intent)
            finish()
        }

        binding.backFAB.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
            finish()
        }


    }
}