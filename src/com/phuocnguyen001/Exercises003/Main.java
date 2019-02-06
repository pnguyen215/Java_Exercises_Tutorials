package com.phuocnguyen001.Exercises003;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		/*
		 * Method from name class
		 */
		DecimalToBase decimalToBase = new DecimalToBase();
		EnterNewNumber enterNewNumber = new EnterNewNumber();

		/*
		 * input values
		 */
		System.out.println("Enter args[0] and base[1]: ");
		int n = (int) enterNewNumber.ValueOfEnter();
		int base = (int) enterNewNumber.ValueOfEnter();
		System.out.print("Result: ");
		decimalToBase.ValuesOfDecimalToBase(n, base);
	}

}
