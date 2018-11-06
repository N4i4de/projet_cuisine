package fr.projet_cuisine.service;

import fr.projet_cuisine.model.Aliment;
import fr.projet_cuisine.repository.AlimentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GestionAliment implements IGestionAliment {

    @Autowired
    private AlimentRepository alimentRepository;

    public List<Aliment> getAlimentByName(String name) {
        return alimentRepository.findByName(name);
    }

    @Override
    public List<Aliment> getAllAliments() {
        return alimentRepository.findAll();
    }
}
