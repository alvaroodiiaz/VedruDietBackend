package com.vedrudietbackend.vedrudiet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.vedrudietbackend.vedrudiet.model.Recipe;
import com.vedrudietbackend.vedrudiet.services.RecipeService;

@RestController
@RequestMapping(path = "/recipe")
@CrossOrigin(origins = "*")
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
	@PostMapping
	public ResponseEntity<?> createRecipe(@RequestBody Recipe recipe) {
		return ResponseEntity.status(HttpStatus.CREATED).body(recipeService.createRecipe(recipe));
	}
	
	@GetMapping
	public ResponseEntity<?> getRecipes(){
		return ResponseEntity.status(HttpStatus.OK).body(recipeService.getRecipes());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getRecipeById(@PathVariable("id") Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(recipeService.getRecipeById(id));
	}
	
	@GetMapping("/filter/{name}")
	public ResponseEntity<?> getRecipeByRecipeName(@PathVariable("name") String name){
		System.out.println(name);
		return ResponseEntity.status(HttpStatus.OK).body(recipeService.getRecipeByRecipeName(name));
		
	}
	
	@GetMapping("/recipe/{idrecipe}&{idfood}")
	public ResponseEntity<?> addFoodById(@PathVariable("idrecipe") String idr, @PathVariable("idfood") String idf){
		System.err.println(idr);
		System.err.println(idf);
		return ResponseEntity.status(HttpStatus.OK).body(recipeService.addFoodById(Integer.valueOf(idr), Integer.valueOf(idf)));
	}
}
