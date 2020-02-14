package com.example.abstractConcept;

public class Trike extends Vehicle {

	public Trike(String color, int wheels) {
		super(color, wheels);
	}

	@Override
	public void move() {
		System.out.println("Trike is moving");
	}

	@Override
	public void stop() {
		System.out.println("Trike is stopped");
	}

	@Override
	public String toString() {
		return "Type: Trike.\n" + super.toString();
	}

}
