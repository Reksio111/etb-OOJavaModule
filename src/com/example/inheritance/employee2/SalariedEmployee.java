package com.example.inheritance.employee2;

public class SalariedEmployee extends Employee {
	
	private int numfOfWeeks;

	public SalariedEmployee(String fname,String lname, int weeks ) {
		super(fname,lname);
		this.numfOfWeeks=weeks;
		
	}

	public int getNumfOfWeeks() {
		return numfOfWeeks;
	}

	public void setNumfOfWeeks(int numfOfWeeks) {
		this.numfOfWeeks = numfOfWeeks;
	}
	
}
