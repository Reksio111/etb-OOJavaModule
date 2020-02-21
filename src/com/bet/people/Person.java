package com.bet.people;

public abstract class Person {
	private String firstName;
	private String lastName;

	public Person(String name, String lname) {
		this.firstName = name;
		this.lastName = lname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String toString() {
		return "Person details:" + "\nName: " + this.getFirstName() + "\nLast name: " + this.getLastName();
	}

}
