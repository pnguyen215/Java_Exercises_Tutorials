package com.phuocnguyen001.Exercises023;

import java.util.Scanner;

public class EnterValue {
	Scanner scanner;
	boolean checkValue;

	public EnterValue() {
	}

	public Object ValueOfEnter(String stringname) {
		scanner = new Scanner(System.in);
		checkValue = false;
		Object n = null;
		while (!checkValue) {
			System.out.println("");
			try {
				if (stringname.equals("integer")) {
					n = scanner.nextInt();
				}
				if (stringname.equals("double")) {
					n = scanner.nextDouble();
				}
				if (stringname.equals("long")) {
					n = scanner.nextLong();
				}
				if (stringname.equals("string")) {
					n = scanner.nextLine();
				}
				if (stringname.equals("float")) {
					n = scanner.nextFloat();
				}
				checkValue = true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				scanner.nextLine();
			}
		}
		return n;
	}

	public String isObject(Object object) {
		if (object instanceof Integer) {
			return object + " :Integer";
		}
		if (object instanceof Double) {
			return object + " :Double";
		}
		if (object instanceof String) {
			return object + " :String";
		}
		if (object instanceof Float) {
			return object + " :Float";
		}
		if (object instanceof Long) {
			return object + " :Long";
		}
		return null;

	}
}
