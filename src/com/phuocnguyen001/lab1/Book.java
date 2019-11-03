package com.phuocnguyen001.lab1;

public class Book {

	private String name;
	private Author author;
	private double price;
	private int qty = 0;

	public Book(String name, Author author, double price, int qty) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getAuthorName() {
		return this.author.getName();
	}

	public String getAuthorEmail() {
		return this.author.getEmail();
	}

	public char getAuthorGender() {
		return this.author.getGender();
	}

	@Override
	public String toString() {
		return "Book[name = " + this.name + ", " + "Author[name = " + getAuthorName() + ", " + "email = "
				+ getAuthorEmail() + ", " + "gender = " + getAuthorGender() + "]" + ", " + "price = " + getPrice()
				+ ", " + "qty = " + getQty() + "]";
	}

}
