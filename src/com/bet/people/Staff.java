package com.bet.people;

public class Staff extends Person implements Payable {
	private int staffId;
	private String jobTitle;

	public Staff(String name, String lname, int id, String title) {
		super(name, lname);
		this.staffId = id;
		this.jobTitle = title;

	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEmployee Id: " + this.getStaffId() + "\nJob title: " + this.getJobTitle();
	}

	@Override
	public void pay(double amount) {
		System.out.println(this.getFirstName() + " " + this.getLastName() + "get paid " + amount);
	}

}
