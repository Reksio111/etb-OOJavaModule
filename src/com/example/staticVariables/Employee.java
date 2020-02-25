package com.example.staticVariables;

public class Employee {

	private String fName, lName;
	private static int emplId = 100;
	private int number;

	public Employee(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		number = emplId++;
	}

	public static int getEmplId() {
		return emplId;
	}

	@Override
	public String toString() {
		return "Employee [First ame=" + fName + ", Last name=" + lName + ", Employee number: " + number + "]";
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

}
