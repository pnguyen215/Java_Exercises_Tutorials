package com.phuocnguyen001.Exercises016;

import java.util.Scanner;

public class Producer extends Thread {

	private Method method;
	private Scanner scanner;

	public Producer(Method method) {
		this.method = method;

	}

	@Override
	public void run() {
		scanner = new Scanner(System.in);
		int number;
		while (true) {
			number = scanner.nextInt();
			method.produce(number);
		}
	}
}
