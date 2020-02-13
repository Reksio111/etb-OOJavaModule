package com.example.inheritance.employee;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseMonthlyPay;

	public BasePlusCommissionEmployee(String fname, String lname, double com, double salary) {
		super(fname, lname, com);
		this.baseMonthlyPay = salary;
	}

	public double getMonthlySalary() {
		return baseMonthlyPay;
	}

	public void setMonthlySalary(double baseMonthlyPay) {
		this.baseMonthlyPay = baseMonthlyPay;
	}

	@Override
	public double calculateMonthlyEarnings(double monthlySales) {
		return super.calculateMonthlyEarnings(monthlySales) + baseMonthlyPay;
	}

public String toString() {
	String output="Employee: " +super.toString()+ "\nBase salary: " +this.baseMonthlyPay;
	return output;
}

}
