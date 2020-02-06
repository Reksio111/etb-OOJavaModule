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

	public String getPartnumber() {
		return partnumber;
	}

	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}

	public String getPartdescription() {
		return partdescription;
	}

	public void setPartdescription(String partdescription) {
		this.partdescription = partdescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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
