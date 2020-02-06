package com.example.delph;

public class CupTest {

	public static void main(String[] args) {
		Cup cup1=new Cup();
		Cup cup2=new Cup();

		
		System.out.println(cup1);
		System.out.println(cup2);
		cup1.setCapacity(300);
		cup1.setColor("white");

		cup2.setCapacity(500);
		cup2.setColor("Red");
		
		System.out.println(cup1);
		System.out.println(cup1.getCapacity());
		System.out.println(cup1.getColor());
		
		System.out.println(cup2);
		System.out.println(cup2.getCapacity());
		System.out.println(cup2.getColor());
		
	}

}
