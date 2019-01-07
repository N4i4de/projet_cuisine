package fr.projet_cuisine.service;

import fr.projet_cuisine.model.Aliment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IGestionAliment {

    public List<Aliment> getAllAliments();

    public List<Aliment> getAlimentByName(String name) ;

    public void saveAliment(Aliment aliment);
    }
