package fr.projet_cuisine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.ArrayList;

@Entity
public class Recette {

    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String nom;

    private ArrayList<Ingredient> ingredients;

    private int nombrePersonnes;
    private String provenance;

    public Recette(Long id) {
        this.id = id;
    }
}
