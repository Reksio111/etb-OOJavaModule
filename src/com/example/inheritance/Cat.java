package com.example.inheritance;



public class Cat extends Animals{
	private int numberOfWhiskers;
	public Cat(String name, String colour, String breed, int numberOfLegs,boolean hasTail, double weight, int numberOfWhiskers) {
		super(name,colour,breed,numberOfLegs, hasTail,weight);
		this.numberOfWhiskers=numberOfWhiskers;
	}
	public void climb() {
		System.out.println(getName() + " is climbing");
	}
	@Override
	public void makeSounds() {
		System.out.println(getName() + " is meowing");
	}
	@Override 
	public String toString() {
		String output=super.toString();
		output+="\nNumber of whiskars: " + this.numberOfWhiskers;
		
		return output;
	}


}
