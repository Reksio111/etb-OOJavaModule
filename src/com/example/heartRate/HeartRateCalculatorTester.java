package com.example.heartRate;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HeartRateCalculatorTester {

	public static void main(String[] args) {

		Scanner keyIn = new Scanner(System.in);
		try {

			System.out.println("Please enter yor details");
			System.out.print("Your name:");
			String fname = keyIn.nextLine();
			System.out.print("Your  last name:");
			String lname = keyIn.nextLine();
			System.out.print("DOB-day:");
			int day = keyIn.nextInt();
			System.out.print("DOB-month:");
			int month = keyIn.nextInt();
			System.out.print("DOB-year:");
			int year = keyIn.nextInt();

			HeartRateCalculator heartrate = new HeartRateCalculator(fname, lname, LocalDate.of(year, month, day));
			
			heartrate.displayCustomerDetails();
			System.out.println("Customer age is: " + heartrate.calculateAge());
			System.out.println("Maximum safe heart rate is " + heartrate.calculateHeartRate() + " heart beats per hour");
			System.out.print("Target rate is between "+ heartrate.targetRate());

		} catch (DateTimeException error) {
			System.out.print("Invalid input\n" + error.getMessage());
		} catch (InputMismatchException error) {
			System.out.print("Integer values only please\n" + error.getMessage());
		}
	}

}
