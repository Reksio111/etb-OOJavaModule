package com.example.heartRate;

import java.time.LocalDate;




public class HeartRateCalculatorTester {

	
	public static void main(String[] args) {
		
		HeartRateCalculator heartrate=new HeartRateCalculator("Jacek", "Kania", LocalDate.of(1977, 2, 8));
		HeartRateCalculator heartrate1=new HeartRateCalculator("Jacek", "Kania", LocalDate.of(1987, 5, 8));
		
		
		heartrate.displayCustomerDetails();
		System.out.println("Your age is: " + heartrate.calculateAge());
		System.out.println("Your maximum hear rate is " + heartrate.calculateHeartRate() + " heart beats per hour");
		heartrate.targetRate();
		
		heartrate1.displayCustomerDetails();
		System.out.println("Your age is: " + heartrate1.calculateAge());
		System.out.println("Your maximum hear rate is " + heartrate1.calculateHeartRate() + " heart beats per hour");
		heartrate1.targetRate();

	}

}
