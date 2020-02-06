/*
 * 1.	Define a class named Student that has the following properties:
a.	Name
b.	Age
c.	Course
d.	Favourite hobby
2.	Write a constructor for the Student class to initialise the member variables defined above.
3.	Add the following methods to this Student class
a.	eat (takes in no parameters)
b.	sleep (takes in no parameters)
c.	study (takes in the subject being studied as a parameter)
The first two methods should just print a message that says “[name] is eating/sleeping”.  The last method should print a message that says “[name] is studying [subject]”
4.	Write a StudentTest class that creates four students.  Call each of the three methods on each of the three Student objects.
5.	Add breakpoints and step over/into the code to see the values of the properties as each method is called on each object

 * 
 */

package com.example.human;

public class Student {

	private String name;
	private int age;
	private String course;
	private String hobby;

	public Student(String nameIn, int ageIn, String courseIn, String hobbyIn) {
		this.name = nameIn;
		this.age = ageIn;
		this.course = courseIn;
		this.hobby = hobbyIn;
	}

	public void eat() {
		System.out.println(this.name + " is eating.");
	}

	public void sleep() {
		System.out.println(this.name + " is sleeping... ZZZZzzzzzz.");
	}

	public void study(String subject) {
		System.out.println(this.name + " is studing " + subject + ".");
	}
	public String getHobby() {
		return this.hobby;
	}
	public String getName() {
		return this.name;
	}
	public String getcourse() {
		return this.course;
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String nameIn) {
		this.name = nameIn;
	}
	public void setAge(int ageIn) {
		this.age = ageIn;
	}
	public void setCourse(String courseIn) {
		this.course = courseIn;
	}
	public void setHobby(String hobbyIn) {
		this.hobby= hobbyIn;
	}
	public String toString() {
		return "\nStudent details: \nName: " + this.name + "\nAge: " + this.age + "\nStudy: " + this.course + "\nHobby: " + this.hobby + "\n";
	}
	public boolean equals(Student stu) {
		
		return (this.name == stu.name) && (this.age == stu.age) && (this.course == stu.course );	
	
	}
	

}
