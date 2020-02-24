package com.example.staticVariables;

public class Player {

	private String playerName;
	private int health;
	
	
	public Player(String playerName) {
		super();
		this.playerName = playerName;
		this.health=100;
	}


	public void takeDamage(int num) {
		this.health-=num;
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", health=" + health + "]";
	}
	
	
}
