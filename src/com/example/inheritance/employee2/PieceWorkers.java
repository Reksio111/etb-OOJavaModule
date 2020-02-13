package com.example.inheritance.employee2;

public class PieceWorkers extends Employee {

	private double pieceRate;

	public PieceWorkers(String name, String fname, double pieceRateIn) {
		super(name, fname);
		this.pieceRate = pieceRateIn;
	}

	public double getPieceRate() {
		return pieceRate;
	}

	public void setPieceRate(double pieceRate) {
		this.pieceRate = pieceRate;
	}

	public double calculateSalary(int pieces) {
		return this.getPieceRate() * pieces;
	}

	@Override
	public String toString() {
		String message = super.toString() + "\nStaff type: Piece Workers \nRate per piece: " + this.pieceRate;
		return message;

	}
}
