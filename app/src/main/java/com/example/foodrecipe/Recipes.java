package com.example.foodrecipe;
public class Recipes {
    private  String recipeName;
    private String recipeIngredients;
    private String recipeMethod;
    private  String recipe;
    private  int thumbnail;

    public Recipes(String recipeName, String recipeIngredients, String recipeMethod, String recipe, int thumbnail) {
        this.recipeName = recipeName;
        this.recipeIngredients = recipeIngredients;
        this.recipeMethod = recipeMethod;
        this.recipe = recipe;
        this.thumbnail = thumbnail;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public String getRecipeIngredients() {
        return recipeIngredients;
    }

    public String getRecipeMethod() {
        return recipeMethod;
    }

    public String getRecipe() {
        return recipe;
    }

    public int getThumbnail() {
        return thumbnail;
    }
}
