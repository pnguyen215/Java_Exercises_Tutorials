package com.phuocnguyen.lab1;

public class MainBook {

	public static void main(String[] args) {
		Author author = new Author("John", "john@gmail.com", 'm');
		Book book = new Book("Tag", author, 29.78, 1);

		System.out.println(book.toString());

		Author[] authors = new Author[2];
		authors[0] = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
		authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
		Book2 aBook = new Book2("Java", authors, 19.95, 1000);

		System.out.println(aBook.toString());

	}

}
