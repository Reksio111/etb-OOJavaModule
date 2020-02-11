package com.example.inheritance.employee;

public class BasePlusCommissionEmployee extends ComissionEmployee {
	
	private double monthlySalary;

	public BasePlusCommissionEmployee(String fname, String lname,double com,double salary) {
		super(fname,lname,com);
		this.monthlySalary=salary;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	@Override
	public String toString() {
		String output=super.toString();
		output+="\nMonthly salary: "+ this.monthlySalary
	}
	
	
	
}
