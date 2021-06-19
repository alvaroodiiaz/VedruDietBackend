package com.vedrudietbackend.vedrudiet.services_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedrudietbackend.vedrudiet.model.Food;
import com.vedrudietbackend.vedrudiet.repository.FoodRepository;
import com.vedrudietbackend.vedrudiet.services.FoodService;

@Service
public class FoodServiceImpl implements FoodService{
	
	@Autowired
	private FoodRepository foodRepository;

	@Override
	public Food createFood(Food food) {
		foodRepository.save(food);
		return food;
	}

	@Override
	public List<Food> getFoods() {
		return (List<Food>)foodRepository.findAll();
	}

	@Override
	public Food getFoodById(Integer id) {
		return foodRepository.findById(id).get();
	}
	
	@Override
	public Food getFoodByFoodName(String name) {
		return foodRepository.getFoodByFoodName(name);
	}

	@Override
	public List<Food> orderByNutrientDesc(String nutriente) {
		return (List<Food>)foodRepository.orderByNutrientDesc(nutriente);
	}

}
