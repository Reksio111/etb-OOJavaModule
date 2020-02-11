package com.example.inheritance.sahapes;

public class Cube extends Shape{

	private double width;

	public Cube(String colour, int x, int y, double width) {
		super(colour, x, y);
		this.width = width;

	}

	@Override
	public double getArea() {
		return width * 6;
	}

	@Override
	public double getCicumstance() {
		return width*width*width;
	}

	@Override
	public String toString() {
		return "Cube:\n" + super.toString() + "\nDiamensions: " + this.width + "\nArea: " + this.getArea()
				+ " \nCircumstance: " + this.getCicumstance() + "\n";
	}
}



