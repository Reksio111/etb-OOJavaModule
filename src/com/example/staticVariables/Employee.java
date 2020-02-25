package com.example.staticVariables;

public class Employee {

	private String fName, lName;
	private static int num = 1;
	private int emplId;

	public Employee(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		emplId = num++;
	}

	public static int getEmplId() {
		return num;
	}

	@Override
	public String toString() {
		return "Employee Name=" + fName + ", " + lName + ", Employee number: " + emplId;
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
