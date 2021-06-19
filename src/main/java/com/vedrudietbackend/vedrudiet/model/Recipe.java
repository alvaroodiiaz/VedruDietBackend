package com.vedrudietbackend.vedrudiet.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="recipe")
public class Recipe implements Serializable{
private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String recipeName;
	
	private String recipeTime;
	
	private String recipePreparation;
	
	private Set<Food> foods;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer recipeId) {
		this.id = recipeId;
	}

	@Column(name="nombre", unique=false,nullable=false)
	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	@Column(name="tiempo", unique=false,nullable=false)
	public String getRecipeTime() {
		return recipeTime;
	}

	public void setRecipeTime(String recipeTime) {
		this.recipeTime = recipeTime;
	}

	@Column(name="preparacion", unique=false,nullable=false)
	public String getRecipePreparation() {
		return recipePreparation;
	}

	public void setRecipePreparation(String recipePreparation) {
		this.recipePreparation = recipePreparation;
	}

	
	@ManyToMany(mappedBy = "recipes")
	public Set<Food> getFoods() {
		return foods;
	}

	public void setFoods(Set<Food> food) {
		this.foods = food;
	}
	
}
