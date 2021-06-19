package com.vedrudietbackend.vedrudiet.services_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vedrudietbackend.vedrudiet.model.Food;
import com.vedrudietbackend.vedrudiet.model.Recipe;
import com.vedrudietbackend.vedrudiet.repository.FoodRepository;
import com.vedrudietbackend.vedrudiet.repository.RecipeRepository;
import com.vedrudietbackend.vedrudiet.services.RecipeService;

@Service
@Transactional
public class RecipeServiceImpl implements RecipeService{
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	@Autowired
	private FoodRepository foodRepository;

	@Override
	public Recipe createRecipe(Recipe recipe) {
		recipeRepository.save(recipe);
		return recipe;
	}

	@Override
	public List<Recipe> getRecipes() {
		return (List<Recipe>)recipeRepository.findAll();
	}

	@Override
	public Recipe getRecipeById(Integer id) {
		return recipeRepository.findById(id).get();
	}

	@Override
	public Food addFoodById(Integer idr, Integer idf) {
		Recipe recipe1 = recipeRepository.findById(idr).get();
		Food food1 = foodRepository.findById(idf).get();
		food1.getRecipes().add(recipe1);
//		System.out.println(food1);
//		var foods = recipe1.getFoods();
//		foods.add(food1);
//		recipe1.setFoods(foods);
//		System.out.println(recipe1.getFoods().size());
		return foodRepository.save(food1);
	}

	@Override
	public Recipe getRecipeByRecipeName(String name) {
		return recipeRepository.getRecipeByRecipeName(name);
	}


}
