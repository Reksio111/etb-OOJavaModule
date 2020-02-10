package com.example.heartRatewithArrayList;


import java.util.ArrayList;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HeartRateWithArrayListTester {

	public static void main(String[] args) {

		Scanner keyIn = new Scanner(System.in);
		ArrayList<HeartRateWitharrayList>list=new ArrayList<>();
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

			HeartRateWitharrayList heartrate = new HeartRateWitharrayList(fname, lname, LocalDate.of(year, month, day));
			list.add(heartrate);
			
			heartrate.displayCustomerDetails();
			System.out.println("Customer age is: " + heartrate.calculateAge());
			System.out.println("Maximum safe heart rate is " + heartrate.calculateHeartRate() + " heart beats per hour");
			System.out.print("Target rate is between "+ heartrate.targetRate());
			
			
			for(int i=0; i < list.size(); i++)
				System.out.println(list.get(i).getFname());
		} catch (DateTimeException error) {
			System.out.print("Invalid input\n" + error.getMessage());
		} catch (InputMismatchException error) {
			System.out.print("Integer values only please\n" + error.getMessage());
		}
	}

}