package com.example.recipe.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.recipe.entities.Recipies

@Dao
interface RecipeDao {
    @get:Query("SELECT * FROM recipes ORDER BY id DESC")
    val allRecipies: List<Recipies>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipes: Recipies)
}