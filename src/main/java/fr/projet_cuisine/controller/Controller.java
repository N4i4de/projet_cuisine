package fr.projet_cuisine.controller;

import fr.projet_cuisine.model.Aliment;
import fr.projet_cuisine.model.Ingredient;
import fr.projet_cuisine.repository.AlimentRepository;
import fr.projet_cuisine.service.GestionAliment;
import fr.projet_cuisine.service.GestionIngredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

	@Autowired
	private AlimentRepository repository;

	@Autowired
	private GestionAliment gestionAliment;

	@Autowired
	private GestionIngredient gestionIngredient;
	
	@GetMapping("/allAliment")
	public Iterable<Aliment> listAll() {
		return gestionAliment.getAllAliments();
	}

	@GetMapping("/allIngredient")
	public List<Ingredient> listAllIngredient() {return gestionIngredient.getAllIngredients(); }

	@GetMapping
	public String test() {
		return "test";
	}
}
