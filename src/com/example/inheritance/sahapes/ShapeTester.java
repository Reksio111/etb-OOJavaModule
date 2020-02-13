package com.example.inheritance.sahapes;

public class ShapeTester {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle("White", 12, 22, 5, 12);
		Square square = new Square("Black", 22, 40, 4);
		Circle circle = new Circle("Brown", 6, 120, 6);
		Triangle triangle = new Triangle("Blue", 12, 36, 12, 36, 12, 4);
		Cube cube = new Cube("Green", 23, 157, 3);
		Cuboid cuboid = new Cuboid("Gray", 12, 12, 2, 4, 6);
		Sphere sphere = new Sphere("Orange", 100, 100, 12);

		Shape[] shapes = { rectangle, square, circle, triangle, cube, cuboid, sphere };

		for (Shape shape : shapes) {
			printShapeDetails(shape);
			printArea(shape);
			System.out.println();
		}

		System.out.println("POLIMORFYZM ");
		Shape theAcctuallyACircle = new Circle("Navy", 12, 234, 4);
		printArea(theAcctuallyACircle);
		System.out.println();

		if (theAcctuallyACircle instanceof Circle) {
			System.out.println("acctuallACircle objec is a Circle.");
			Circle theActuallyACircle = (Circle) theAcctuallyACircle;
			theActuallyACircle.setRadius(9);
		} else {
			System.out.println("theAcctuallyACircle it's not a Cicrvcle object");
		}
		Shape acctuallASquare = new Square("Gray", 12, 234, 4);
		printArea(acctuallASquare);
		System.out.println();

		if (acctuallASquare instanceof Circle) {
			System.out.println("acctuallASquare objec is a Circle.");
			Circle theActuallyASquare = (Circle) theAcctuallyACircle;
			theActuallyASquare.setRadius(9);
		} else {
			System.out.println("theAcctuallySquare it's not a Cicrcle object");
		}

	}

	public static void printShapeDetails(Shape shape) {
		System.out.println(shape.toString());
	}

	public static void printArea(Shape shape) {
		System.out.println(shape.getArea());
	}

}
