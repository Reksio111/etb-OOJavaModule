package com.example.inheritance.sahapes;

public class Rectangle extends Shape {

	private double length;
	private double width;

	public Rectangle(String colour, int x, int y, double width, double length) {
		super(colour, x, y);
		this.width = width;
		this.length = length;

	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public double getCicumstance() {
		return (2 * length) + (2 * width);
	}

	@Override
	public String toString() {
		return "Rectangle:\n" + super.toString() + "\nDimensions: " + this.length + ", " + this.width + "\nArea:"
				+ this.getArea() + "\nCircumstance: " + this.getCicumstance() + "\n";
	}
}
