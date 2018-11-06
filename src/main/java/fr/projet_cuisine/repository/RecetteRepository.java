package fr.projet_cuisine.repository;

import fr.projet_cuisine.model.Recette;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecetteRepository extends CrudRepository <Recette,Long>{

    List<Recette> findByNom(String nom);

}
