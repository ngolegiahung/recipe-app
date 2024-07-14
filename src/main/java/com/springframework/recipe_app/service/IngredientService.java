package com.springframework.recipe_app.service;

import com.springframework.recipe_app.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
