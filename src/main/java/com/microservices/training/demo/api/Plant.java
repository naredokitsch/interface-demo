package com.microservices.training.demo.api;

public abstract class Plant implements ILivingBeing, IBugEater {
	
	private String type = "Plant";
	
	public abstract void photosynthesis();
	
	public String getType() {
		return this.type;
	}

}
