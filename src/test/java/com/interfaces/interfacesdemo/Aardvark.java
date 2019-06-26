package com.interfaces.interfacesdemo;

import org.junit.Test;
import com.microservices.training.demo.api.Aardvark;
import com.microservices.training.demo.api.ILivingBeing;

public class AardvarkTest {

	@Test
	public void testAardvark() {
		ILivingBeing aardvarkLivingBeing = new Aardvark();
		Animal aarkvardAnimal = ( Animal ) aarkvardLivingBeing();

		aarkvardAnimal.born();
		aarkvardAnimal.die();
		aarkvardAnimal.eat();
		aarkvardAnimal.breed();
	}
	
}