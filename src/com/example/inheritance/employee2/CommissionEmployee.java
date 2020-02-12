package com.example.inheritance.employee2;

public class CommissionEmployee extends Employee{


	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, double commissionRate) {
		super(firstName, lastName);
		this.commissionRate=commissionRate;

		if(commissionRate > 0 && commissionRate < 1) {
			this.commissionRate = commissionRate;
		} else {
			this.commissionRate = 0;
		}
	}
	
	public double calculateMonthlyEarnings(double monthlySales) {
		return monthlySales * commissionRate;
	}


	/**
	 * @return the commissionRate
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

	/**
	 * @param commissionRate the commissionRate to set
	 */
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	@Override
	public String toString() {
		return super.toString() + "\nCommission rate: "+ this.commissionRate; 
	}
}
