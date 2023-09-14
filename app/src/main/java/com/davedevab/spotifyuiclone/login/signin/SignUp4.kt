package com.davedevab.spotifyuiclone.login.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.core.content.ContextCompat
import com.davedevab.spotifyuiclone.R
import com.davedevab.spotifyuiclone.databinding.ActivitySignUp4Binding
import com.davedevab.spotifyuiclone.login.onboarding.ChooseArtist

class SignUp4 : AppCompatActivity() {
    private lateinit var binding: ActivitySignUp4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUp4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nameEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if (s.isNullOrBlank()) {
                    binding.accountButton.isEnabled = false
                    ContextCompat.getColor(this@SignUp4, R.color.md_theme_dark_outlineVariant)
                    binding.accountButton.backgroundTintList = ContextCompat.getColorStateList(this@SignUp4, R.color.md_theme_dark_outlineVariant)
                } else {
                    binding.accountButton.isEnabled = true
                    ContextCompat.getColor(this@SignUp4, R.color.white)
                    binding.accountButton.backgroundTintList = ContextCompat.getColorStateList(this@SignUp4, R.color.white)
                }
            }
        })

        binding.accountButton.setOnClickListener{
            intent = Intent(this, ChooseArtist::class.java)
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