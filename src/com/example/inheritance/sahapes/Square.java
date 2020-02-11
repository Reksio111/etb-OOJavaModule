package com.example.inheritance.sahapes;

public class Square extends Shape {

	private double width;

	public Square(String colour, int x, int y, double width) {
		super(colour, x, y);
		this.width = width;

	}

	@Override
	public double getArea() {
		return width * width;
	}

	@Override
	public double getCicumstance() {
		return 4 * width;
	}

	@Override
	public String toString() {
		return "Square:\n" + super.toString() + "\nDiamensions: " + this.width + "\nArea: " + this.getArea()
				+ " \nCircumstance: " + this.getCicumstance() + "\n";
	}
}
