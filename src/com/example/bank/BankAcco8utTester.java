package com.example.bank;

public class BankAcco8utTester {

	public static void main(String[] args) {
		BankAccount bankaccount = new BankAccount();

		bankaccount.setAccountName("Jacek");
		bankaccount.setAccountNumber(12345);
		bankaccount.setAccountBalance(2100);
		System.out.println(bankaccount.toString() + "\n");

		bankaccount.setAccountName("Matthew");
		bankaccount.setAccountNumber(1234567);
		// bankaccount.setAccountBalance(1000);
		System.out.println(bankaccount.displaiAccountInfo());

		bankaccount.withdraw(900);

		System.out.println(bankaccount.getAccountBalance());
	}

	/*public static void displaiAccountInfo(BankAccount bankAccount) {
		String output = String.format("Account info:" + "\nAccount number: %d" + "\nAccount name: %s" + "\bBalance: 2f",
				bankAccount.getAccountNumber(), bankAccount.getAccountName(), bankAccount.getAccountBalance());
		System.out.println(output);
	}*/
}
	