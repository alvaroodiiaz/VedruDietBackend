package com.vedrudietbackend.vedrudiet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.vedrudietbackend.vedrudiet.model.Food;
import com.vedrudietbackend.vedrudiet.services.FoodService;

@RestController
@RequestMapping(path = "/food")
@CrossOrigin(origins = "*")
public class FoodController {
	@Autowired
	private FoodService foodService;
	
	@PostMapping
	public ResponseEntity<?> createFood(@RequestBody Food f) {
		return ResponseEntity.status(HttpStatus.CREATED).body(foodService.createFood(f));
	}
	
	@GetMapping
	public ResponseEntity<?> getFoods(){
		return ResponseEntity.status(HttpStatus.OK).body(foodService.getFoods());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getFoodById(@PathVariable("id") Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(foodService.getFoodById(id));
	}
	
	@GetMapping("/filter/{name}")
	public ResponseEntity<?> getFoodByFoodName(@PathVariable("name") String name){
		System.out.println(name);
		return ResponseEntity.status(HttpStatus.OK).body(foodService.getFoodByFoodName(name));
	}
	
	@GetMapping("/order/{nutriente}")
	public ResponseEntity<?> orderByNutrientDesc(@PathVariable("nutriente") String nutriente){
		System.out.println(nutriente);
		return ResponseEntity.status(HttpStatus.OK).body(foodService.orderByNutrientDesc(nutriente));
	}
}
