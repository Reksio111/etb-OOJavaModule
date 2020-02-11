package com.example.inheritance.animals;



public class Dog extends Animals{
	private double loyalityIndex;
	public Dog(String name, String colour, String breed, int numberOfLegs,boolean hasTail, double weight, double loyality) {
		super(name,colour,breed,numberOfLegs, hasTail,weight);
		this.loyalityIndex=loyality;
	}
	public void pant() {
		System.out.println(getName() + " is panting");
	}
	@Override
	public void makeSounds() {
		System.out.println(getName() + " is barking");
	}
	@Override 
	public String toString() {
		String output=super.toString();
		output+="\nLoyality index: " + this.loyalityIndex;
		return output;
	}


}
