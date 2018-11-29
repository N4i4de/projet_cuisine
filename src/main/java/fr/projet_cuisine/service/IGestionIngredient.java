package fr.projet_cuisine.service;

import fr.projet_cuisine.model.Aliment;

import java.util.List;

public interface IGestionIngredient {
    public List<Aliment> getIngredientByAliment(Aliment aliment);

    public List<Aliment> getAllIngredients();

    public List<Aliment> getIngredientByDuree();

    public List<Aliment> getIngredientByNameAliment();

    public void saveIngredient(Aliment Ingredient);


}
