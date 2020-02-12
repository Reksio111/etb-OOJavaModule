package com.example.inheritance.employee;

public class EmployeeTester {

	public static void main(String[] args) {
		BasePlusCommissionEmployee empl=new BasePlusCommissionEmployee ("John", "McCormic", .4, 20000);
		System.out.println(empl.toString());
		
	

	}

}
