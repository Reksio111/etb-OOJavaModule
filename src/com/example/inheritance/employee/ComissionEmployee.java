package com.example.inheritance.employee;

public class ComissionEmployee {
	private String fname;
	private String lname;
	private double commisionRate;
	
	public ComissionEmployee(String fname, String lname, double com) {
		this.fname=fname;
		this.lname=lname;
		this.commisionRate=com;
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

	public double getCommision() {
		return commisionRate;
	}

	public void setCommision(double commision) {
		this.commisionRate = commision;
	}
	public double calculatemonthlyEarnings(double amount) {
		return amount+=getCommision();
	}
	@Override
	public String toString() {
		String output="Employee details";
		output+="\nName: " +this.fname+ ", "+ this.lname;
		output+="\nComission rate: " +this.commisionRate;
		return output;
	}

}
