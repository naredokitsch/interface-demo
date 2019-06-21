package com.microservices.training.demo.api;

public class VenusFlyTrap extends Plant {

	@Override
	public void eat() {
		System.out.println("Eat like a " + this.getType());
		
	}

	@Override
	public void breed() {
		System.out.println("Breed like a " + this.getType());
		
	}

	@Override
	public void born() {
		System.out.println("Born like a " + this.getType());
		
	}

	@Override
	public void die() {
		System.out.println("Die like a " + this.getType());
		
	}

	@Override
	public void photosynthesis() {
		System.out.println("Make photosynthesis like a " + this.getType());
		
	}
}
