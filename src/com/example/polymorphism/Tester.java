package com.example.polymorphism;

public class Tester {

	public static void main(String[] args) {
		Overloading_Overwriting tester=new Overloading_Overwriting();
		
		System.out.println(tester.multiply(2.1, 2.3));
		System.out.println(tester.multiply(2, 4, 7));
		System.out.println(tester.multiply(21, 12));
		System.out.println(tester.multiply(2,4,3,4,1,10,1));

	}

}
