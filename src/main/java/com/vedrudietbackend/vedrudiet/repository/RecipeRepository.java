package com.vedrudietbackend.vedrudiet.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vedrudietbackend.vedrudiet.model.Recipe;

@Repository
public interface RecipeRepository extends CrudRepository <Recipe, Integer>{

	@Query("SELECT r from Recipe r where LOWER(r.recipeName) = LOWER(:nombre)")
	Recipe getRecipeByRecipeName(@Param("nombre") String name);
	
}
