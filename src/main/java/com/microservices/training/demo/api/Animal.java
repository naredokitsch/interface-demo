package com.microservices.training.demo.api;

public abstract class Animal implements ILivingBeing {
	
	private String type = "Animal";
	
	public String getType() {
		return this.type;
	}
}
