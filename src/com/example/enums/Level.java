package com.example.enums;

public enum Level {
	LEVEL1(12), LEVEL2(15), LEVEL3(20);

	private final int rate;

	Level(int rate) {
		this.rate = rate;
	}

	public int getRate() {
		return this.rate;
	}
}
