package com.example.staticVariables;

public class Monster {
	private String colour;
	private int health;
	private static int monsterCount = 0;

	public Monster(String color) {
		super();
		this.colour = color;
		this.health = 100;
		monsterCount++;
		System.out.println("Current monster count: " + monsterCount);

	}

	public Monster(String colour, int health) {
		super();
		this.colour = colour;
		this.health = health;
		monsterCount++;
		System.out.println("Current monster count: " + monsterCount);
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "Monster [colour=" + colour + ", health=" + health + "]";
	}
	public void attackPlayer(Player player) {
		if(monsterCount>2) {
			player.takeDamage(20);
		}else {
			player.takeDamage(20);
		}
	}

}
