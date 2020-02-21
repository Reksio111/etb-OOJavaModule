package com.bet.companies;

import java.util.List;

public class ContractingCompany extends Company {
	private List courses;

	public ContractingCompany(String name, int id, List list) {
		super(name, id);
		this.courses = list;
	}

	public List getCourses() {
		return courses;
	}

	public void setCourses(List courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {

		return super.toString() + "\nCourses list: " + this.getCourses();
	}

}
