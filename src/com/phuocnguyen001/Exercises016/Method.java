package com.phuocnguyen001.Exercises016;

public class Method {

	private int data;
	private boolean empty;
	private boolean check;

	public Method() {
		this.empty = true;
	}

	public synchronized void produce(int data_new) {
		while (!this.empty) {
			try {
				this.wait();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		this.data = data_new;
		this.empty = false;
		this.notify(); /* notify the consumer */
		System.out.println("Number: " + data);
	}

	public boolean isPrime(int n) {

		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;

	}

	public synchronized boolean consumer() {
		while (this.empty) {
			try {
				this.wait();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		/* handing */
		if (isPrime(this.data)) {
			check = true;
		} else {
			check = false;
		}
		/* notify to producer */
		this.empty = true;
		this.notify();
		System.out.println("is number prime: " + check);
		return check;

	}
}
