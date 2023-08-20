package edu.tacos.repository;

import java.util.Optional;

import edu.tacos.Ingredient;

public interface IngredientRepository {
    
    Iterable<Ingredient> findAll();
    
    Optional<Ingredient> findById(String id);
    
    Ingredient save(Ingredient ingredient);
    
}
