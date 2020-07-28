package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {
    private TextView mRecipeName;
    private TextView mRecipeIngredients;
    private TextView mRecipeMethod;
    private TextView mRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        mRecipeName= findViewById(R.id.recipeName);
        mRecipeIngredients=findViewById(R.id.recipeIngredients);
        mRecipeMethod=findViewById(R.id.recipeMethod);
        mRecipe=findViewById(R.id.recipe);

        // Getting values of Recipes from class Recipes
        Intent intent= getIntent();
        String name= intent.getExtras().getString("recipeName");
        String ingredients = intent.getExtras().getString("recipeIngredients");
        String method = intent.getExtras().getString("recipeMethod");
        String recipe = intent.getExtras().getString("recipe");

        // Update the layout based on the passing values
        mRecipeName.setText(name);
        mRecipeIngredients.setText(ingredients);
        mRecipeMethod.setText(method);
        mRecipe.setText(recipe);

    }
}