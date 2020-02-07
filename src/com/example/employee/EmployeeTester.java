package com.example.employee;

public class EmployeeTester {

	public static void main(String[] args) {

		Employee empl1 = new Employee("Mark", "Johanson", 123000);
		Employee empl2 = new Employee("Scarlet", "Walberg", 103000);

		System.out.println(empl1.displaiemployeeInfo());
		System.out.println("New salary: " + ((empl1.getSalary()*.10) + empl1.getSalary()));
		
		System.out.println(empl2.displaiemployeeInfo());
		System.out.println("New salary: "+ ((empl2.getSalary()*.10) + empl2.getSalary()));
		

	}

}
