package com.example.inheritance.sahapes;

public class ShapeTester {

	public static void main(String[] args) {
	Rectangle rectangle =new Rectangle("White", 12, 22, 5, 12);
	Square square=new Square("Black", 22,40, 4);
	Circle circle=new Circle("Brown", 6, 120, 6 );
	Triangle triangle=new Triangle("Blue", 12, 36, 12,36, 12,4);
	Cube cube=new Cube("Green", 23,157,3);
	Cuboid cuboid=new Cuboid("Gray", 12,12,2,4,6);
	Sphere sphere=new Sphere("Orange", 100,100, 12);
	
	System.out.println(rectangle.toString());
	System.out.println(square.toString());
	System.out.println(circle.toString());
	System.out.println(triangle.toString());
	System.out.println(cube.toString());
	System.out.println(cuboid.toString());
	System.out.println(sphere.toString());
	
	
	

	}

}
