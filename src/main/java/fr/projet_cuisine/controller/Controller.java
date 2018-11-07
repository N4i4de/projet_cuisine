package fr.projet_cuisine.controller;

import fr.projet_cuisine.model.Aliment;
import fr.projet_cuisine.repository.AlimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private AlimentRepository repository;
	
	@GetMapping("/all")
	public Iterable<Aliment> listAll() {
		return repository.findAll();
	}


	@GetMapping
	public String test() {
		return "test";
	}
}
