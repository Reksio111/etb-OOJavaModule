package com.example.polymorphism;

public class Overloading_Overwriting {
	

	public int multiply(int num1, int num2) {
		System.out.println("Multiply two integers: ");
		return num1 * num2;
	}

	public int multiply(int num1, int num2, int num3) {
		System.out.println("Multiply three integers");
		return num1 * num2 * num3;
	}

	public double multiply(double num1, double num2) {
		System.out.println("Multiply two doubles");
		return num1 * num2;
	}

	public int multiply(int... n) {
		System.out.println("Multiply n-times integer");
		int total = 1;
		for (int i : n) {
			total *= i;
		}
		return total;
	}



}
