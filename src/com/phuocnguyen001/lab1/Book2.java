package com.phuocnguyen001.lab1;

public class Book2 {

	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;

	public Book2(String name, Author[] authors, double price, int qty) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public Book2(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author[] getAuthors() {
		return this.authors;
	}

	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}

	public double getPrice() {
		return this.price;
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

	public Author[] getAuthorsNames() {
		return this.getAuthors();
	}

	public String printAuthors() {

		String string = "";
		String string2 = "";
		for (Author author : this.authors) {
			string = "Author[name = " + author.getName() + ", " + "email = " + author.getEmail() + ", " + "gender = "
					+ author.getGender() + "]";
			string2 += string;
		}
		return string2;
	}

	@Override
	public String toString() {
		return "Book[name = " + getName() + ", " + "author={" + printAuthors() + "}" + ", " + "price = " + getPrice()
				+ ", " + "qty = " + getQty() + "]";
	}
}
