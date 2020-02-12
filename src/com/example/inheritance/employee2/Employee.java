package com.example.inheritance.employee2;

/*
 *The common attributes and behaviours for all Employees are firstName, lastName, getFirstName, getLastName and a portion of method toString

Create a new superclass Employee that contains these instance variables and methods and a
constructor. Next, rewrite class CommissionEmployee from the previous exercise as a subclass of Employee.
 
 * */

public class Employee {
	private String firstName;
	private String lastName;
	
	public Employee(String fname, String lname) {
		this.firstName=fname;
		this.lastName=lname;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		String output="Employee datails:";
		output+="\nFirst name: " + this.firstName ;
		output+="\nFamily name: " +this.lastName;
		return output;
	}

}
