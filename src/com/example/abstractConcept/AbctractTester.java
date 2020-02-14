package com.example.abstractConcept;

public class AbctractTester {

	public static void main(String[] args) {
		Car car = new Car("White", 4);
		Bicycle bicycle = new Bicycle("Yellow", 2);
		Trike trike = new Trike("Red", 3);
		Vehicle[] vehicles = { bicycle, trike, car };

		for (Vehicle target : vehicles) {
			System.out.println(target.toString());
			if (target instanceof Car) {
				((Car) target).engineStart();
			}
			target.move();
			target.stop();
			System.out.println();
		}
	}

}
