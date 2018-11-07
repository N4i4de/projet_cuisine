package fr.projet_cuisine;

import fr.projet_cuisine.model.Aliment;
import fr.projet_cuisine.repository.AlimentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjetCuisineApplication {

	private static final Logger log = LoggerFactory.getLogger(ProjetCuisineApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetCuisineApplication.class, args);
	}


	@Bean
	public CommandLineRunner fillUpDb(AlimentRepository repository) {
			return (args) -> {
			// save a couple of customers
			//repository.save(new Customer("Jack", "Bauer"));
			repository.save(new Aliment("farine"));
			repository.save(new Aliment("oeuf"));

			// fetch all customers
			log.info("Aliment found with findAll():");
			log.info("-------------------------------");
			for (Aliment customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			repository.findById(1L)
				.ifPresent(customer -> {
					log.info("aliment found with findById(1L):");
					log.info("--------------------------------");
					log.info(customer.toString());
					log.info("");
				});

			// fetch customers by last name
			log.info("Customer found with findByName('farine'):");
			log.info("--------------------------------------------");
			repository.findByName("farine").forEach(farine -> log.info(farine.toString()));
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			// 	log.info(bauer.toString());
			// }
			log.info("");
		};


	}

}
