package com.example.inheritance.employee2;

public class EmployeeTester {

	public static void main(String[] args) {
		HourlyEmployee employee = new HourlyEmployee("Joe", "Crow", 12.5);
		System.out.println(employee.toString());
		employee.setWage(12.75);
		System.out.println("New hourly wage:" + employee.getWage());
		System.out.println("Weekly salary: " + employee.weeklyEarning(168) + " euro.");
	}

}
