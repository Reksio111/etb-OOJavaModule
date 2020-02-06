package com.example.delph;

public class Cup {
	private String color;
	private int capacity;
	
	
	public Cup() {}
	
	public Cup(String colorIn, int capacityIn) {
		this.color=colorIn;
		this.capacity=capacityIn;
	}
	public int getCapacity() {
		return this.capacity;
	}
	public String getColor() {
		return this.color;
	}
	public void setCapacity(int capIn) {
		this.capacity=capIn;
	}
	public void setColor(String colIn) {
		this.color=colIn;
	}
	public String toString() {
		return "The cup color is " + this.color + ", and its capacity is " + this.capacity + " ml";
	}

}
