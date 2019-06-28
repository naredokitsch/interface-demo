package com.microservices.training.demo.api;

public class Aardvark extends Animal implements IBugEater {

	@Override
	public void eat() {
		System.out.println("Eat like an " + this.getType());
	
	}
	
	@Override
	public void eatBugs() {
		System.out.println("Eat bugs like a " + this.getType());
		
	}

	@Override
	public void breed() {
		System.out.println("Breed like an " + this.getType());
	
	}

	@Override
	public void born() {
		System.out.println("Born like an " + this.getType());
	
	}

	@Override
	public void die() {
		System.out.println("Die like an " + this.getType());
	
	}
}

