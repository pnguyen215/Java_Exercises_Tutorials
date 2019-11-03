package com.phuocnguyen001.lab1;

public class TestInvoice {

	public static void main(String[] args) {

		Customer customer = new Customer(1, "John", 60);
		Invoice invoice = new Invoice(1, customer, 240000);
		System.out.println(invoice.getAmountAfterDiscount());
	}

}
