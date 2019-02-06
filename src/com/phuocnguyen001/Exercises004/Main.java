package com.phuocnguyen001.Exercises004;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		EnterNewNumber enterNewNumber = new EnterNewNumber();
		CalculateSum calculateSum = new CalculateSum();

		System.out.println("Enter args[0]: ");
		int number = (int) enterNewNumber.ValueOfEnter();
		System.out.println("Result: " + calculateSum.ValueOfSum(number));
	}

}
