package com.example.machines;
import com.example.delph.Cup;

public class CoffeTest {

	public static void main(String[] args) {
		Cup cup1=new Cup();
		Cup cup2=new Cup();
		CoffeMachines machine= new CoffeMachines();

		System.out.println(cup1);
		System.out.println(cup2);
		cup1.setCapacity(300);
		cup1.setColor("white");

		cup2.setCapacity(500);
		cup2.setColor("red");
		
		System.out.println("\n" + cup1);
		System.out.println("First cup capacity is " + cup1.getCapacity());
		System.out.println("First cup color is " + cup1.getColor());
		
		System.out.println("\n" + cup2);
		System.out.println("The second cup capacity is " + cup2.getCapacity());
		System.out.println("The second cup color is " + cup2.getColor());
		
		cup1.setColor("blue");
		cup2.setColor("green");
		
		//efouweoiuwew
		System.out.println("\nThe first cup new color is " + cup1.getColor() + ", the capacity hadn't change");
		System.out.println("The second cup new color is " + cup2.getColor() + ", the capacity hadn't change");
		

	}

}
