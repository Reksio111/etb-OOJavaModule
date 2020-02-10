package com.example.heartRatewithArrayList;

import java.time.LocalDate;
import java.util.ArrayList;

public class HeartRateWitharrayList {

	private String fname;
	private String lname;
	private LocalDate date;
	private ArrayList customerlist;

	public HeartRateWitharrayList(String first, String last, LocalDate date) {

		this.fname = first;
		this.lname = last;
		this.date = date;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public int calculateAge() {
		LocalDate dob = this.getDate();
		LocalDate todayDate = LocalDate.now();

		int curYear = todayDate.getYear();
		int dobYear = dob.getYear();

		int age = curYear - dobYear;

		// reduce age if month or day is behind today's month or day
		int currentMonth = todayDate.getMonthValue();
		int dobMonth = dob.getMonthValue();
		if (dobMonth > currentMonth) {
			age--;
		} else if (dobMonth == currentMonth) {
			int currentDay = todayDate.getDayOfMonth();
			int dobDay = dob.getDayOfMonth();
			if (dobDay > currentDay) {
				age--;
			}
		}

		return age;
	}

	public int calculateHeartRate() {

		return 220 - this.calculateAge();
	}

	public String targetRate() {

		int mintarget = (int) (this.calculateHeartRate() * .50);
		int maxtarget = (int) (this.calculateHeartRate() * .85);

		return mintarget + " and " + maxtarget;
	}

	public void displayCustomerDetails() {
		System.out.println("Customer details: " + this.fname + " " + this.lname + "\nDate of birth: " + this.date);
	}
public ArrayList<HeartRateWitharrayList> getCustomers() {
	return this.customerlist;
}





}
