package com.example.inheritance.sahapes;

public class Sphere extends Shape {

	private double radius;

	public Sphere(String colour, int x, int y, double radous) {
		super(colour, x, y);
		this.radius = radous;

	}

	@Override
	public double getArea() {
		return 4 * (Math.PI * radius);
	}

	@Override
	public String toString() {
		return "Sphere:\n" + super.toString() + "\nDiamensions: " + this.radius + "\nArea: " + this.getArea() + "\n";

	}
}
