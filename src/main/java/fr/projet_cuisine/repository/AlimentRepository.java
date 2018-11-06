package fr.projet_cuisine.repository;

import fr.projet_cuisine.model.Aliment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlimentRepository extends CrudRepository<Aliment, Long> {

    List<Aliment> findByName(String Name);

    List<Aliment> findAll();
}
