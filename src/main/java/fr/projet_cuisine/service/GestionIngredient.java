package fr.projet_cuisine.service;

import fr.projet_cuisine.model.Aliment;
import fr.projet_cuisine.model.Ingredient;
import fr.projet_cuisine.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GestionIngredient implements IGestionIngredient{

    @Autowired
    IngredientRepository ingredientRepository;

    @Override
    public List<Ingredient> getIngredientByAliment(Aliment aliment) {
        return ingredientRepository.findByAlimentName(aliment.getName());
    }

    @Override
    public List<Ingredient> getAllIngredients() {
        return (List<Ingredient>) ingredientRepository.findAll();
    }

    @Override
    public List<Ingredient> getIngredientByDuree() {
        return null;
    }

    @Override
    public List<Ingredient> getIngredientByNameAliment() {
        return null;
    }

    @Override
    public void saveIngredient(Ingredient ingredient) {
        ingredientRepository.save(ingredient);
    }

}
