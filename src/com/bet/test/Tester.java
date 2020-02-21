package com.bet.test;

import com.bet.people.*;
import com.bet.companies.*;
import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		List<Integer> courseId = new ArrayList<Integer>();
		List<Payable> payables = new ArrayList<Payable>();
		Student joeBloggs = new Student("Joe", "Bloggs", 123, 12, "Software developer");
		Staff martinCole=new Staff("Martin","Cole",77,"Programmer");
		Tutor johnDale=new Tutor("John", "Dole", 33, "Math's tutor","modular math");
		ContractingCompany company=new ContractingCompany("Etb", 1234, courseId);
		
		courseId.add(1234);
		courseId.add(23467);
		courseId.add(7890);
		
		
		payables.add(johnDale);
		payables.add(joeBloggs);
		payables.add(martinCole);
		payables.add(company);
		
		for(Payable p:payables) {
			p.pay(500);
		}
		
		
		
		


		

	}

}
