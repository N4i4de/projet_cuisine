package fr.projet_cuisine.projet_cuisine;

import fr.projet_cuisine.repository.AlimentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjetCuisineApplicationTests {
	@Autowired
	AlimentRepository alrepo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void ecrireAliments(){
		//Aliment aliment1= new Aliment();
		//aliment1.setName("farine");

		//alrepo.save(aliment1);

		//List<Aliment> aliments=alrepo.findByName("farine");
		//Aliment aliment1prime=aliments.get(0);

		//Assert.assertEquals("farine", aliment1prime.getName());
	}


}
