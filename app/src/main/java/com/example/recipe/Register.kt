package com.example.recipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recipe.databinding.ActivityRegisterBinding
import com.example.recipe.databinding.ActivityRegisterBinding.inflate


class Register : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_register)
        binding = inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listener for textRegister
        binding.textRegister.setOnClickListener{
            navigateToLogin()
        }

        binding.icBack.setOnClickListener{
            navigateToLogin()
        }

        binding.btnRegister.setOnClickListener{
            startActivity(Intent(this@Register, LogIn::class.java))
        }

    }

    private fun navigateToLogin(){
        // create intent
        val intent = Intent(this, LogIn::class.java)

        startActivity(intent)
        finish()
    }
}