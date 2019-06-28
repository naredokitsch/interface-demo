package com.interfaces.interfacesdemo;

import org.junit.Test;

import com.microservices.training.demo.api.IBugEater;
import com.microservices.training.demo.api.ILivingBeing;
import com.microservices.training.demo.api.Plant;
import com.microservices.training.demo.api.VenusFlyTrap;

public class VenusFlyTrapTest {

	@Test
	public void testVenusFlyTrap() {
		ILivingBeing plantLivingBeing = new VenusFlyTrap();
		IBugEater plantBugEater = new VenusFlyTrap();
		Plant plantPhotosynthesis = (Plant) plantLivingBeing;
	
		plantLivingBeing.born();
		plantLivingBeing.breed();
		plantLivingBeing.eat();
		plantBugEater.eatBugs();
		plantPhotosynthesis.photosynthesis();
		plantLivingBeing.die();
	
	}
	
}