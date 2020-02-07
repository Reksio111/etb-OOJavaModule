package com.example.employee;

public class Employee {

	private String fname;
	private String lname;
	private double salary;

	public Employee(String fnameIn, String lnameIn, double sal) {
		this.fname = fnameIn;
		this.lname = lnameIn;
		this.salary = sal;
	}

	public String getFirstName() {
		return fname;
	}

	public void setFirstName(String fname) {
		this.fname = fname;
	}

	public String getLastName() {
		return lname;
	}

	public void setLastName(String lname) {
		this.lname = lname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		}else 
			this.salary=0;
	}

	public double riseSalary() {
		return this.salary + (this.salary * .10);
	}

	public String displaiemployeeInfo() {
		String output = String.format(
				"\nEmployee details:" + "\nEmployee first name: %s" + "\nEmployee last name: %s" + "\nSalary: %.2f",
				this.getFirstName(), this.getLastName(), this.getSalary());
		return output;
	}

}
