package fr.projet_cuisine.repository;

import fr.projet_cuisine.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IngredientRepository extends CrudRepository <Ingredient, Long>{

    public List<Ingredient> findByAlimentName(String name);
}
