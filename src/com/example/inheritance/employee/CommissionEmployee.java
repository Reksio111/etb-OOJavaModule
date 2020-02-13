package com.example.inheritance.employee;

public class CommissionEmployee {

	private String firstName;
	private String lastName;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, double commissionRate) {
		this.firstName = firstName;
		this.lastName = lastName;

		if (commissionRate > 0 && commissionRate < 1) {
			this.commissionRate = commissionRate;
		} else {
			this.commissionRate = 0;
		}
	}

	public double calculateMonthlyEarnings(double monthlySales) {
		return monthlySales * commissionRate;
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

	public String toString() {
		String output = "Employee: " + this.firstName + ", " + this.lastName;
		output += "\nCommission rate: " + this.commissionRate;
		return output;
	}
}
