package com.bet.companies;

import com.bet.people.Payable;;

public abstract class Company implements Payable {
	private String companyName;
	private int companyId;

	public Company(String name, int id) {
		this.companyName = name;
		this.companyId = id;
	}

	@Override
	public String toString() {

		return "Company: " + this.companyName + "\nCompany id: " + this.companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Company " + this.getCompanyName() + " get paid " + amount);
	}

}
