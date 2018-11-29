package fr.projet_cuisine.service;

import fr.projet_cuisine.model.Aliment;

import java.util.List;


public interface IGestionAliment {

    public List<Aliment> getAllAliments();

    public List<Aliment> getAlimentByName(String name) ;

    public void saveAliment(Aliment aliment);
    }
