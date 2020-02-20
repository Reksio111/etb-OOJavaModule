package com.example.assesment;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NewTest {

	public static void main(String[] args) throws IOException {

		try {

			// create new instance of Scanner class
			Scanner keyIn = new Scanner(System.in);

			// Test NewCopyFile class
			System.out.println("Test for NewCopyfile class");
			System.out.print("Enter the file content be copied from:");
			String output = keyIn.nextLine();
			System.out.print("Enter the file name to write content to:");
			String input = keyIn.nextLine();
			//create the class object and all method to copy file content content to another file
			NewCopyFile file = new NewCopyFile();

			file.copyFile(input + ".txt", output + ".txt");

			// test NewTime class methods
			System.out.println("Test for NewTime class methods ");
			System.out.print("Enter hour:");
			int hour = keyIn.nextInt();
			System.out.print("Enter minute:");
			int min = keyIn.nextInt();
			System.out.print("Enter hour:");
			int hour1 = keyIn.nextInt();
			System.out.print("Enter minute:");
			int min1 = keyIn.nextInt();

			// create new instance of NewTime() class with default constructor
			NewTime time = new NewTime();

			/*
			 * if entered input values for hour and minutes are in correct range then the
			 * values are set as parameters of new object
			 */
			if (time.valid24Time(hour, min)) {
				time.setHour(hour);
				time.setMins(min);
				System.out.println("Time in correct format");
			} else {
				System.out.println("Hours must be between 0 and 23 and minutes mmust be between 0 and 59");
			}

			// if value of any field exceeds prover range methods return -1. In this case
			// message then at least value is incorrect be displayed
			if (time.substractTime(hour, min, hour1, min1) == -1 || time.addTime(hour, min, hour1, min1) == -1) {
				System.out.println("Can't calculate as at least one of input values is incorrect");

				// otherwise converts integer value to String value.
				// divide the integer by 60 to get hours equivalent
				// modulo operation on the integer returns minutes equivalent.
			} else {
				String timeadd = "" + time.addTime(hour, min, hour1, min1) / 60 + ":"
						+ time.addTime(hour, min, hour1, min1) % 60;
				System.out.println("Time adding: " + timeadd);
				String timesubstr = "" + time.substractTime(hour, min, hour1, min1) / 60 + ":"
						+ time.substractTime(hour, min, hour1, min1) % 60;
				System.out.println("Time substract: " + timesubstr);

			}
			// in case of input mismatch exception this message is displayed.
		} catch (InputMismatchException ex) {
			System.out.print("Please enter proper value");
		}
	}
}
