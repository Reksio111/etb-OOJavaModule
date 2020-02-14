package com.example.abstractConcept;

public class Bicycle extends Vehicle {

	public Bicycle(String color, int wheels) {
		super(color, wheels);
	}
	@Override
	public void move() {
		System.out.println("Bicycle is moving");
	}
	@Override
	public void stop() {
		System.out.println("Bicycle is stopped");
	}

	@Override
	public String toString() {
		return "Type: Bicycle.\n" + super.toString();

	}
}
