package com.interfaces.interfacesdemo;

import org.junit.Test;
import com.microservices.training.demo.api.Aardvark;
import com.microservices.training.demo.api.ILivingBeing;
import com.microservices.training.demo.api.Plant;
import com.microservices.training.demo.api.VenusFlyTrap;

public class livingBeingTest {

	@Test
	public void testLivingBeing() {
	
	//VERIFICAR QUE EL AMBIENTE ESE ENCUENTRE SIN PROBLEMAS
	
	ILivingBeing plantLivingBeing = new VenusFlyTrap();
	Plant plantPhotosynthesis = (Plant) plantLivingBeing;
	
	ILivingBeing animalLivingBeing = new Aardvark();

	
	plantLivingBeing.born();
	plantLivingBeing.die();
	plantLivingBeing.eat();
	plantLivingBeing.breed();
	plantPhotosynthesis.photosynthesis();
	
	System.out.println("");
	
	animalLivingBeing.born();
	animalLivingBeing.die();
	animalLivingBeing.eat();
	animalLivingBeing.breed();
	}
	
}
