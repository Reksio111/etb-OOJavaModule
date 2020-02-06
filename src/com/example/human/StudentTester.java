package com.example.human;

public class StudentTester {

	public static void main(String[] args) {

		Student student1 = new Student("Joe", 24, "Math", "volleyball");
		Student student2 = new Student("Martin", 25, "Accounting", "basketball");
		Student student3 = new Student("John", 19, "Computing", "futball");
		Student student4 = new Student("Monica", 33, "Art", "ice hockey");
		Person person=new Person("John","Mcgavey", 22, 33, 191.2);
		
		person.sleep();

		Student[] students = { student1, student2, student3, student4 };
		String[] subjects = { "Modular Math", "Personal Finance", "Java Obiect Oriented Programming", "Paint History" };

		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i].toString());
			students[i].study(subjects[i]);
			students[i].sleep();
			students[i].eat();
		
			
		}
		if(student1.equals(student1)) {
			System.out.print("Its the same student");
		}
		else
			System.out.print("Its not the same student");
		
	}
}
