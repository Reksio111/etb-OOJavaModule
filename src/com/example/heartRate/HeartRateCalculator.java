package com.example.heartRate;

import java.time.LocalDate;


public class HeartRateCalculator {

	private String fname;
	private String lname;
	private LocalDate date;

	public HeartRateCalculator(String first, String last, LocalDate date) {
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
		LocalDate d = this.getDate();
		LocalDate todayDate = LocalDate.now();

		int curYear = todayDate.getYear();
		int dobYear = d.getYear();

		int age = curYear - dobYear;

		// if dob is month or day is behind today's month or day
		// reduce age by 1
		int curMonth = todayDate.getMonthValue();
		int dobMonth = d.getMonthValue();
		if (dobMonth > curMonth) { // this year can't be counted!
			age--;
		} else if (dobMonth == curMonth) { // same month? check for day
			int curDay = todayDate.getDayOfMonth();
			int dobDay = d.getDayOfMonth();
			if (dobDay > curDay) { // this year can't be counted!
				age--;
			}
		}

		return age;
	}

	public int calculateHeartRate() {

		return 220 - this.calculateAge();
	}

	public void targetRate() {

		int mintarget = (int) (this.calculateHeartRate() * .50);
		int maxtarget = (int) (this.calculateHeartRate() * .85);

		System.out.println(
				"Your target heart rate is between " + mintarget + " and " + maxtarget + " heart beats per minute");

	}

	public void displayCustomerDetails() {
		System.out.println("Customer details: " + this.fname + " " + this.lname + "\nDate of birth: " + this.date);
	}

}
