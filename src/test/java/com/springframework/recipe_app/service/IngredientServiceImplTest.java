package com.springframework.recipe_app.service;

import com.springframework.recipe_app.commands.IngredientCommand;
import com.springframework.recipe_app.converters.IngredientToIngredientCommand;
import com.springframework.recipe_app.domain.Ingredient;
import com.springframework.recipe_app.domain.Recipe;
import com.springframework.recipe_app.repositories.RecipeRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

class IngredientServiceImplTest {

    @Mock
    IngredientToIngredientCommand ingredientToIngredientCommand;

    @Mock
    RecipeRepository recipeRepository;

    IngredientService ingredientService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        ingredientService = new IngredientServiceImpl(recipeRepository, ingredientToIngredientCommand);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findByRecipeIdAndIngredientId() {
    }

    @Test
    public void findByRecipeIdAndRecipeIdHappyPath() throws Exception {
//        //give
//        Recipe recipe = new Recipe();
//        recipe.setId(1L);
//
//        Ingredient ingredient1 = new Ingredient();
//        ingredient1.setId(1L);
//        ingredient1.setDescription("radishes, thinly sliced");
//        ingredient1.setAmount( new BigDecimal(4));
//
//        recipe.addIngredient(ingredient1);
//        Optional<Recipe> recipeOptional = Optional.of(recipe);
//
//        when(recipeRepository.findById(anyLong())).thenReturn(recipeOptional);
//
//        //then
//        IngredientCommand ingredientCommand = ingredientService.findByRecipeIdAndIngredientId(1L, 1L);
//
//        //when
//        assertEquals(Long.valueOf(1L), ingredientCommand.getId());
//        assertEquals(recipeOptional.get().getId(), ingredientCommand.getRecipeId());
//        verify(recipeRepository, times(1)).findById(anyLong());
    }
}