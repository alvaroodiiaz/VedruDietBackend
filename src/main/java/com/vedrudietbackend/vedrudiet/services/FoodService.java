package com.vedrudietbackend.vedrudiet.services;

import java.util.List;

import com.vedrudietbackend.vedrudiet.model.Food;

public interface FoodService {
	public Food createFood(Food food);
	
	public List<Food> getFoods();
	
	public Food getFoodById(Integer id);
	
	public Food getFoodByFoodName(String name);
	
	public List<Food> orderByNutrientDesc(String nutriente);	
}
