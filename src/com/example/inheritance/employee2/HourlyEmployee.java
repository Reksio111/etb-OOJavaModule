package com.example.inheritance.employee2;

/*
 * Create class HourlyEmployee that inherits from class Employee and has instance variable wage (a double) that represents the wages per hour, 
 * a constructor that takes as arguments a first name, a last name, an hourly wage, set and get methods for manipulating the wage, 
 * an earnings method to calculate an HourlyEmployee’s earnings based on the hours worked (passed in as a parameter) 
 * and a toString method that returns the HourlyEmployee’s String representation. Method setWage should ensure that wage is nonnegative,
 *  and the code should ensure that the value of hours is between 0 and 168 (the total number of hours in a week).
 * 
 * */

public class HourlyEmployee extends Employee {

	private double wage;

	public HourlyEmployee(String name, String lname, double wageIn) {
		super(name, lname);
		this.wage=wageIn;

	}

	public double getWage() {
		return wage;
	}

	public void setWage(double rate) {
		if (rate > 0) {
			this.wage = rate;
		} else
			this.wage = 1;

	}

	public double weeklyEarning(double hoursWorked) {

		if (hoursWorked > 168 || hoursWorked < 0) {
			System.out.println("Hours worked amount must be between 0 and 168");
			return 0;

		}
		if (hoursWorked > 40) {
			return (40 * this.wage) + ((hoursWorked - 40) * wage * 1.5);
		}
		return this.wage * hoursWorked;

	}

	@Override
	public String toString() {
		return super.toString() + "\nType: Hourly Staff" + "\nHourly wage: " + this.wage;
	}
}
