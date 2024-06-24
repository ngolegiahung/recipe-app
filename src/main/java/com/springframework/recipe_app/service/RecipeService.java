package com.springframework.recipe_app.service;

import com.springframework.recipe_app.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
