package fr.projet_cuisine.projet_cuisine;

import fr.projet_cuisine.model.Aliment;
import fr.projet_cuisine.model.Ingredient;
import fr.projet_cuisine.repository.AlimentRepository;
import fr.projet_cuisine.repository.IngredientRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjetCuisineApplicationTests {
	@Autowired
	private AlimentRepository alrepo;

	@Autowired
	private IngredientRepository inrepo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void ecrireAliments(){
		Aliment aliment1= new Aliment();
		aliment1.setName("farine");

		alrepo.save(aliment1);

		List<Aliment> aliments=alrepo.findByName("farine");
		Aliment aliment1prime=aliments.get(0);

		Assert.assertEquals("farine", aliment1prime.getName());
	}

	@Test
	public void ingredientIsSaved(){
		Aliment aliment1= new Aliment();
		aliment1.setName("farine");

		alrepo.save(aliment1);

		Ingredient ingredient1 = new Ingredient();
		Ingredient ingredient1prime = new Ingredient();

		ingredient1.setAliment(aliment1);

		inrepo.save(ingredient1);

		inrepo.findById(1L)
				.ifPresent(ingredient -> Assert.assertEquals("farine", ingredient1prime.getAliment().getName()));

	}


}
