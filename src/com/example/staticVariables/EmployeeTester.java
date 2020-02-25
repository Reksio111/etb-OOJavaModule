package com.example.staticVariables;

public class EmployeeTester {

	public static void main(String[] args) {

		Employee employee1 = new Employee("John", "McCabe");
		Employee employee4 = new Employee("John", "McCabe");
		Employee employee2 = new Employee("Martin", "Smith");
		Employee employee3 = new Employee("Billy", "Kid");
//		System.out.println(employee1.toString());
//		System.out.println(employee2.toString());
//		System.out.println(employee3.toString());
		
		if(employee1.equals(employee4)) {
			System. out.println("The same person");
		}else {
			System. out.println("Not the same person");
		}
//
	}

}
