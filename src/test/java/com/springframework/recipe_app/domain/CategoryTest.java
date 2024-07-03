package com.springframework.recipe_app.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;

    @BeforeEach
    void setUp() {
        category = new Category();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getId() {
        Long valueId = 4L;
        category.setId(valueId);

        assertEquals(valueId, category.getId());
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}