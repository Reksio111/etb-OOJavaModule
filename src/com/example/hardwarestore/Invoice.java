package com.example.hardwarestore;

public class Invoice {
	private String partnumber;
	private String partdescription;
	private int quantity;
	private double price;

	public Invoice() {
	}

	public Invoice(String no, String desc, int quant, double priceIn) {
		this.partnumber = no;
		this.partdescription = desc;
		this.quantity = quant;
		this.price = priceIn;
	}

	public boolean amountvalidate() {
		if (this.quantity > 0)
			return true;
		else
			return false;
	}

	public boolean pricevalidate() {
		if (this.price > 0)
			return true;
		else
			return false;
	}
	

	public void setInvoice() {

		if (!amountvalidate()) {
			int bill = 0;
			System.out.println("Invoice total: " + bill);
		} else if (!pricevalidate()) {
			double bill = 0;
			System.out.println("Invoice total: " + bill);
		} else {
			System.out.println("Invoice total: " + (this.price * this.quantity));
		}
	}
}
