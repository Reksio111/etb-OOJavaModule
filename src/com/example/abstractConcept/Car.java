package com.example.abstractConcept;

public class Car extends Vehicle {

	public Car(String color, int wheels) {
		super(color, wheels);
	}

	@Override
	public void move() {
		System.out.println("Car is moving");
	}

	@Override
	public void stop() {
		System.out.println("Car is stopped");
	}

	@Override
	public String toString() {
		return "Type: Car.\n" + super.toString();
	}

	public void engineStart() {
		System.out.println("Car engine is started");
	}
}
