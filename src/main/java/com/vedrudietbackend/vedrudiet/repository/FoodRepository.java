package com.vedrudietbackend.vedrudiet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vedrudietbackend.vedrudiet.model.Food;

@Repository
public interface FoodRepository extends CrudRepository <Food, Integer>{

	@Query("SELECT f from Food f where LOWER(f.foodName) = LOWER(:nombre)")
	Food getFoodByFoodName(@Param("nombre") String name);
	
	@Query(value = "SELECT * FROM food ORDER BY ?1 DESC;", nativeQuery = true)
	List<Food> orderByNutrientDesc(String nutriente);
}
