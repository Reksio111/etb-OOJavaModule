package com.example.assesment;

import java.io.IOException;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws IOException {

		Scanner keyIn = new Scanner(System.in);

		System.out.println("Test for NewTime ");
		System.out.print("Enter hour:");
		int hour = keyIn.nextInt();
		System.out.print("Enter minute:");
		int min = keyIn.nextInt();
		System.out.print("Enter hour:");
		int hour1 = keyIn.nextInt();
		System.out.print("Enter minute:");
		int min1 = keyIn.nextInt();
	
//
//		NewTime time = new NewTime();
//		if (time.valid24Time(hour, min)) {
//			time.setHour(hour);
//			time.setMins(min);
//			System.out.println("Time in correct format");
//		} else {
//			System.out.println("Hours must be between 0 and 23 and minutes mmust be between 0 and 59");
//		}

//		System.out.println("Test for file copying");
//		System.out.print("Enter the file content be copied from:");
//		String output = keyIn.nextLine();
//		System.out.print("Enter the file name to write content to:");
//		String input = keyIn.nextLine();
//
//		NewCopyFile file = new NewCopyFile();
//
//		file.copyFile(input + ".txt", output + ".txt");
		NewTime time = new NewTime();
		
		 System.out.println(time.addTime(hour, min, hour1, min1));
		
		if(time.substractTime(hour, min, hour1, min1)==-1) {
			System.out.println("Cant calculate as at least one of input values is incorrect");
		}else
			System.out.println(time.substractTime(hour, min, hour1, min1));

	}

}
