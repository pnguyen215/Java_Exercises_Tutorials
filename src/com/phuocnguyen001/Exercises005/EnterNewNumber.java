package com.phuocnguyen001.Exercises005;

import java.util.Scanner;

public class EnterNewNumber {
	Scanner scanner;
	boolean checkValue;

	public EnterNewNumber() {
	}

	public Object ValueOfEnter() {
		scanner = new Scanner(System.in);
		checkValue = false;
		int n = 0;
		while (!checkValue) {
			System.out.println("");
			try {
				n = scanner.nextInt();
				checkValue = true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				scanner.nextLine();
			}
		}
		return (n);
	}
}
