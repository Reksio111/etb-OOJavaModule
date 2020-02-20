package com.example.basic_calculation;

import java.text.DecimalFormat;

public class BasicCalculationTester {

	private static DecimalFormat df = new DecimalFormat("#.##");

	public static void main(String[] args) {
		BasicCalculation calculator = new BasicCalculation();

		System.out.println("addition: " + df.format(calculator.sum(12.4,4)));
		System.out.println("Substraction: " + df.format(calculator.substract(13,12.5)));
		System.out.println("Multiply: " + df.format(calculator.multiply(12,6.78)));
		System.out.println("Division: " + df.format(calculator.division(23.76,12.43)));
		
	}

}
