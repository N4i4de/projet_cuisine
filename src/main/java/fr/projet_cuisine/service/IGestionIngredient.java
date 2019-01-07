package fr.projet_cuisine.service;

import fr.projet_cuisine.model.Aliment;
import fr.projet_cuisine.model.Ingredient;

import java.util.List;

public interface IGestionIngredient {
    public List<Ingredient> getIngredientByAliment(Aliment aliment);

    public List<Ingredient> getAllIngredients();

    public List<Ingredient> getIngredientByDuree();

    public List<Ingredient> getIngredientByNameAliment();

    public void saveIngredient(Ingredient ingredient);


}
