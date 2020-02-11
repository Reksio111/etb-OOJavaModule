package com.example.inheritance.sahapes;

public class Cuboid extends Shape {

	private double sideA;
	private double sideB;
	private double sideC;

	public Cuboid(String colour, int x, int y, double sideA, double sideB, double sideC) {
		super(colour, x, y);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;

	}

	@Override
	public double getArea() {
		return 2 * ((sideA + sideB) + (sideA + sideC) + (sideC + sideB));
	}

	@Override
	public double getCicumstance() {
		return 2 * (sideA + sideB) + 2 * (sideB + sideC);
	}

	@Override
	public String toString() {
		return "Cuboid:\n" + super.toString() + "\nDiamensions: " + this.sideA + ", " + this.sideB + ", " + this.sideC
				+ "\nArea: " + this.getArea() + " \nCircumstance: " + this.getCicumstance() + "\n";
	}

}
