package com.example.inheritance.sahapes;

public class Shape {
	private String colour;
	private int coordX;
	private int coordY;

	public Shape(String color, int x, int y) {
		this.colour = color;
		this.coordX = x;
		this.coordY = y;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}

	public double getArea() {
		return 0;
	}

	public double getCicumstance() {
		return 0;
	}

	@Override
	public String toString() {
		String output = "Color: " + this.colour;
		output += "\nCoordinates: X= " + this.coordX + ", Y= " + this.coordY;
		
	

		return output;
	}

}
