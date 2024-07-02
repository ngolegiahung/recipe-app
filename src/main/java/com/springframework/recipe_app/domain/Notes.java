package com.springframework.recipe_app.domain;

import jakarta.persistence.*;
import lombok.*;

/**
 * Created by jt on 6/13/17.
 */
@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;
}
