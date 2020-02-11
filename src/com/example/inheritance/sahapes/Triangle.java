package com.example.inheritance.sahapes;

public class Triangle extends Shape {

	private double sideA;
	private double sideB;
	private double height;
	private double base;

	public Triangle(String colour, int x, int y, double sideA, double sideB, double height, double base) {
		super(colour, x, y);
		this.sideA = sideA;
		this.sideB = sideB;
		this.height = height;
		this.base = base;

	}

	@Override
	public double getArea() {
		return (height * base) / 2;
	}

	public double getrCicumstance() {
		return sideA+sideB+base;
	}

	@Override
	public String toString() {
		return "Triangle:\n" + super.toString() + "\nDiamensions:" + this.sideA + ", " + this.sideB + ", " + this.height
				+ ", " + this.base + "\nArea:" + this.getArea() + "\ncircumstance: " + this.getrCicumstance() + "\n";
	}
}
