package com.example.enums;

public class LevelTester {

	public static void main(String[] args) {
		Level level = Level.LEVEL3;

		switch (level) {
		case LEVEL1:
			System.out.println("This level is 1- " + "Rate: " + level.getRate());
			break;
		case LEVEL2:
			System.out.println("This level is 2- " + "Rate: " + level.getRate());
			break;
		case LEVEL3:
			System.out.println("This level is 3- " + "Rate: " + level.getRate());
			break;
		default:
			break;
		}

	}

}
