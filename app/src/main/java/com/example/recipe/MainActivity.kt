package com.example.recipe

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.recipe.fragment.Explore
import com.example.recipe.fragment.Home
import com.example.recipe.fragment.SavedRecipes
import com.example.recipe.fragment.ShoppingList
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity: AppCompatActivity(){
    private lateinit var bottomNavigationView: BottomNavigationView
    @SuppressLint("MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        bottomNavigationView.setOnItemReselectedListener {menuItem ->
            when(menuItem.itemId){
                R.id.bottom_home -> {
                    replaceFragment(Home())

                    true
                }
                R.id.bottom_explore -> {
                    replaceFragment(Explore())
                    true
                }
                R.id.bottom_shoppingList -> {
                    replaceFragment(ShoppingList())
                    true
                }
                R.id.bottom_savedRecipes -> {
                    replaceFragment(SavedRecipes())
                    true
                }
                else -> false
            }
        }


        replaceFragment(Home())
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()
    }
}