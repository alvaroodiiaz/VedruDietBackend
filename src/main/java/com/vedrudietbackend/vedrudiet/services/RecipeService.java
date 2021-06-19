package com.vedrudietbackend.vedrudiet.services;

import java.util.List;

import com.vedrudietbackend.vedrudiet.model.Food;
import com.vedrudietbackend.vedrudiet.model.Recipe;

public interface RecipeService {
	public Recipe createRecipe(Recipe recipe);
	
	public List<Recipe> getRecipes();
	
	public Recipe getRecipeById(Integer id);
	
	public Recipe getRecipeByRecipeName(String name);
	
	public Food addFoodById(Integer idr, Integer idf);
	
}