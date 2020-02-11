package com.example.inheritance.animals;

public class Animals {

	private String name;
	private String colour;
	private String breed;
	private boolean hasTail;
	private int numberOfLegs;
	private double weigth;

	public Animals(String name, String colour, String breed, int numberOfLegs, boolean hasTail, double weight) {
		this.name = name;
		this.colour = colour;
		this.breed = breed;
		this.numberOfLegs = numberOfLegs;
		this.hasTail = hasTail;
		this.weigth = weight;
	}

	public void eat() {
		System.out.println(this.name + " is eating");
	}

	public void sleep() {
		System.out.println(this.name + " is sleeping");
	}

	public void makeSounds() {
		System.out.println(this.name + " is making sounds");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean isHasTail() {
		return hasTail;
	}

	public void setHasTail(boolean hasTail) {
		this.hasTail = hasTail;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	@Override
	public String toString() {
		String output = "Name: " + this.name;
		output += "\nColour: " + this.colour;
		output += "\nBreed: " + this.breed;
		output += "\nNumber of legs: " + this.numberOfLegs;
		output += "\nHas tail: " + this.hasTail;
		output += "\nWeigth: " + this.weigth;

		return output;

	}

}
