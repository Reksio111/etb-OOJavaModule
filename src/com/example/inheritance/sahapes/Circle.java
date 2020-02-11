package com.example.inheritance.sahapes;

public class Circle extends Shape {

	private double radius;

	public Circle(String colour, int x, int y, double radius) {
		super(colour, x, y);
		this.radius = radius;

	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getCicumstance() {
		return (Math.PI * radius) * 2;
	}

	@Override
	public String toString() {
		return "Circle:\n" + super.toString() + "\nDiamensions: " + this.radius + "\nArea:" + this.getArea()
				+ "\nCircumstance: " + this.getCicumstance() + "\n";
	}

}
