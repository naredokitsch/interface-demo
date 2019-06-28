package com.interfaces.interfacesdemo;

import org.junit.Test;
import com.microservices.training.demo.api.ILivingBeing;
import com.microservices.training.demo.api.IBugEater;
import com.microservices.training.demo.api.Aardvark;;

public class AardvarkTest {

	@Test
	public void testAardvark() {
		ILivingBeing animalLivingBeing = new Aardvark();
		IBugEater animalBugEater = new Aardvark();
	
		animalLivingBeing.born();
		animalLivingBeing.breed();
		animalLivingBeing.eat();
		animalBugEater.eatBugs();
		animalLivingBeing.die();
	
	}
}