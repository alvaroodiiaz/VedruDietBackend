package com.vedrudietbackend.vedrudiet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.vedrudietbackend.vedrudiet.services.FoodService;
import com.vedrudietbackend.vedrudiet.services.MenuService;
import com.vedrudietbackend.vedrudiet.services.RecipeService;

@SpringBootApplication
@ComponentScan(basePackages = { "com.vedrudietbackend.vedrudiet.model", "com.vedrudietbackend.vedrudiet.repository",
		"com.vedrudietbackend.vedrudiet.services", "com.vedrudietbackend.vedrudiet.services_impl",
		"com.vedrudietbackend.vedrudiet.controller" })
@EntityScan(basePackages = { "com.vedrudietbackend.vedrudiet.model" })
@EnableJpaRepositories(basePackages = { "com.vedrudietbackend.vedrudiet.repository", "com.vedrudietbackend.vedrudiet.controller",
		"com.vedrudietbackend.vedrudiet.services_impl" })

public class VedrudietBackendApplication {
	
	@Autowired
	FoodService foodService;
	
	@Autowired
	RecipeService recipeService;
	
	@Autowired
	MenuService menuService;
	
	public static void main(String[] args) {
		SpringApplication.run(VedrudietBackendApplication.class, args);
	}

}
