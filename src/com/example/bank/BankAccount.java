package com.example.bank;

public class BankAccount {
	private int accountNumber;
	private String name;
	private double balance;

	public BankAccount() {
	}

	public BankAccount(int accNo, String nameIn, double balIn) {
		this.accountNumber = accNo;
		this.name = nameIn;
		this.balance = balIn;
	}

	public void deposit(double bal) {
		this.balance += bal;
	}

	public double getAccountBalance() {
		return this.balance;
	}

	public String getAccountName() {
		return this.name;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountBalance(double amount) {
		this.balance = amount;
	}

	public void setAccountNumber(int num) {
		this.accountNumber = num;
	}

	public void setAccountName(String nameIn) {
		this.name = nameIn;
	}

	public void withdraw(int amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
		} else {
			System.out.println("No enough balans in hand");
		}

	}

	public String displaiAccountInfo() {
		String output = String.format("Account info:" + "\nAccount number: %d" + "\nAccount name:%s" + "\nBalance: %2f",
				this.getAccountNumber(), this.getAccountName(), this.getAccountBalance());
		return output;
	}

}
