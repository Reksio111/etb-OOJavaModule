package com.bet.people;

public class Tutor extends Staff implements Payable {
	private String specialty;

	public Tutor(String name, String lname, int id, String title, String spec) {
		super(name, lname, id, title);
		this.specialty = spec;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	@Override
	public String toString() {

		return super.toString() + "\nSpecjality: " + this.getSpecialty();
	}

	@Override
	public void pay(double amount) {
		System.out.println(this.getFirstName() + " " + this.getLastName() + " get paid " + amount);
	}

}
