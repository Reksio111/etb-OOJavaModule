package com.bet.people;

public class Student extends Person implements Payable {
	private int studentId;
	private int courseId;
	private String courseTitle;

	public Student(String name, String lname, int id, int course, String title) {
		super(name, lname);
		this.courseId = id;
		this.courseId = course;
		this.courseTitle = title;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	@Override
	public String toString() {
		return super.toString() + "\nStudent Id: " + this.getStudentId() + "\nCourse Id: " + this.getCourseId()
				+ "\ncourse title: Id: " + this.getCourseTitle();

	}

	@Override
	public void pay(double amount) {
		System.out.println(this.getFirstName() + " " + this.getLastName() + 
				 "get paid " + amount);
	}

}
