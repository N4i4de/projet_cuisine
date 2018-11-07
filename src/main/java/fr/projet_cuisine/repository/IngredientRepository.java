package fr.projet_cuisine.repository;

import fr.projet_cuisine.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository <Ingredient, Long>{
}
