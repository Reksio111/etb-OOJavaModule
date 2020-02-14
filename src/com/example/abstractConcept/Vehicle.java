package com.example.abstractConcept;

public abstract class Vehicle {

	private int numberOfWheels;
	private String colour;

	public Vehicle(String col, int wheels) {
		this.colour = col;
		this.numberOfWheels = wheels;
	}

	public String toString() {
		String message;
		message = "Color: " + this.colour;
		message += "\nNumber of wheels: " + this.numberOfWheels;
		return message;
	}

	public abstract void move();

	public abstract void stop();

}
