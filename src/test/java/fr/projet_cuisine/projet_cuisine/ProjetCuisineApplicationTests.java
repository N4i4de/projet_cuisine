package fr.projet_cuisine.projet_cuisine;

import fr.projet_cuisine.model.Aliment;
import fr.projet_cuisine.model.Ingredient;
import fr.projet_cuisine.repository.AlimentRepository;
import fr.projet_cuisine.repository.IngredientRepository;
import fr.projet_cuisine.service.GestionAliment;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
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

	@Autowired
	private GestionAliment gesali;
	//@Autowired
	//@Mock
	//AlimentRepository alrepomock;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);}

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

		ingredient1.setAliment(aliment1);

		inrepo.save(ingredient1);

		inrepo.findById(1L)
				.ifPresent(ingredient -> Assert.assertEquals("farine", ingredient.getAliment().getName()));

	}

	//@Test
	//public void gestionIngredientgetAllIngredient(){
	//	Aliment aliment1= new Aliment();
	//	aliment1.setName("farine");
	//	List<Aliment> lali=new ArrayList<Aliment>();
	//	lali.add(aliment1);
	//	String nomali1=lali.get(0).getName();
	//	when(alrepomock.findByName("farine")).thenReturn(lali);
//
//
//		gesali.getAlimentByName("farine");

	//Assert.assertEquals("farine", gesali.getAlimentByName("farine").get(0).getName());
	//verify(alrepomock.findByName("farine"));




	//}


}
