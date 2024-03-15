package com.example.recipe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import com.example.recipe.databinding.ActivityOnboardingBinding
import com.example.recipe.fragment.Home

class Onboarding : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_onboarding)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Onboarding -> Home
        binding.btnStarCooking.setOnClickListener{
            startActivity(Intent(this@Onboarding, MainActivity::class.java))
        }
    }
}