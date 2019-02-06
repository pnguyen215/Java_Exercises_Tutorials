package com.phuocnguyen001.Exercises008;

public class FindStringFibonacci {

	public FindStringFibonacci() {
	}

	public int findStringFibonacci(int number) {
		if (number < 0)
			return -1;
		else if (number == 0 || number == 1) {
			return number;
		} else {
			return findStringFibonacci(number - 1) + findStringFibonacci(number - 2);
		}
	}

	public void valuesOfFindStringFibonacci() {
		EnterNewNumber enterNewNumber = new EnterNewNumber();
		System.out.println("Enter args[0]: ");
		int number = (int) enterNewNumber.ValueOfEnter("integer");
		System.out.println("The first " + number + "  numbers of Fibonacci string: ");
		for (int i = 0; i < number; i++) {
			System.out.print(findStringFibonacci(i) + " ");
		}
	}

}
