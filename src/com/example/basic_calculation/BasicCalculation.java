package com.example.basic_calculation;

public class BasicCalculation {



	public BasicCalculation() {

	}

	public double sum(double num1, double num2) {
		return num1 + num2;
	}

	public  double substract(double num1, double num2) {
		return num1 - num2;
	}

	public  double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public double division(double num1, double num2) {

		if (num2 > 0) {
			return num1 / num2;
		} else
			return 0;

	}

}
