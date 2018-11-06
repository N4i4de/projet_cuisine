package fr.projet_cuisine.controller;

import fr.projet_cuisine.repository.Customer;
import fr.projet_cuisine.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private CustomerRepository repository;
	
	@GetMapping("/all")
	public Iterable<Customer> listAll() {
		return repository.findAll();
	}


	@GetMapping
	public String test() {
		return "test";
	}
}
