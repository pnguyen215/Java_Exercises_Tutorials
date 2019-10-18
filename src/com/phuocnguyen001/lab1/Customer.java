package com.phuocnguyen.lab1;

public class Customer {

	private int id;
	private String name;
	private int discount;

	public Customer(int id, String name, int discount) {
		super();
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiscount() {
		return this.discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return getName() + "("  + getId() + ")";
	}
}
