package com.example.human;

public class Person {

	private String firstName;
	private String lastName;
	private double height;
	private int age;
	private double weight;
	
	public Person(String fname, String lname, double heightIn, int ageIn, double weightIn) {
		this.firstName=fname;
		this.lastName=lname;
		this.height=heightIn;
		this.age=ageIn;
		this.weight=weightIn;		
	}

	public void eat() {
		System.out.println(this.firstName + " is eating");
	}
	public void sleep() {
		System.out.println(this.firstName + " is speeping... ZZZZzzzzzz");
	}
	public void talk(String message) {
		System.out.println(this.firstName + " says: " + message);
	}

}
