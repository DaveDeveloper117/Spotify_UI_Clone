package com.davedevab.spotifyuiclone.login.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.content.ContextCompat
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

        binding.nextButton.isEnabled = false

        binding.genderDropDown.onItemClickListener =
            AdapterView.OnItemClickListener { _, _, _, _ ->
                binding.nextButton.isEnabled = true
            }

        binding.genderDropDown.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                if (s.isNullOrBlank()) {
                    binding.nextButton.isEnabled = false
                    ContextCompat.getColor(this@SignUp3, R.color.md_theme_dark_outlineVariant)
                    binding.nextButton.backgroundTintList = ContextCompat.getColorStateList(this@SignUp3, R.color.md_theme_dark_outlineVariant)
                } else {
                    binding.nextButton.isEnabled = true
                    ContextCompat.getColor(this@SignUp3, R.color.green)
                    binding.nextButton.backgroundTintList = ContextCompat.getColorStateList(this@SignUp3, R.color.green)
                }
            }

        })

        binding.nextButton.setOnClickListener{
            intent = Intent(this, SignUp4::class.java)
            startActivity(intent)
            finish()
        }

        binding.backFAB.setOnClickListener {
            intent = Intent(this, SignUp2::class.java)
            startActivity(intent)
            finish()
        }
    }
}