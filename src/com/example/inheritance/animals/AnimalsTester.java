package com.example.inheritance.animals;

import com.example.inheritance.animals.Cat;
import com.example.inheritance.animals.Dog;

public class AnimalsTester {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Lassie", "Brown & White", "Coolie", 4, true, 20, 1);
		Dog dog2 = new Dog("Cujo", "Dark Brown & White", "St. Bernard", 4, true, 40, 0);

		Cat cat1 = new Cat("Ginger", "Ginger", "tomcat", 4, true, 4.3, 6);
		Cat cat2 = new Cat("Garfield", "Ginger", "tabby cat", 4, true, 7.3, 6);

		dog1.eat();
		cat1.eat();

		dog1.sleep();
		cat1.sleep();
		dog1.makeSounds();
		cat1.makeSounds();

		String dogString = dog1.toString();
		System.out.println();
		System.out.println(dogString);

		System.out.println();
		System.out.println(cat1.toString());

	}

}
