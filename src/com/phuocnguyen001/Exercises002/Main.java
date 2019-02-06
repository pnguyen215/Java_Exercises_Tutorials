package com.phuocnguyen001.Exercises002;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		/*
		 * Call method by name class
		 */
		EnterNewNumber enterNewNumber = new EnterNewNumber();
		GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
		LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple();
		/*
		 * create two variables
		 */
		System.out.println("Enter args[0] and args[1]: ");
		int a = (int) enterNewNumber.ValueOfEnter();
		int b = (int) enterNewNumber.ValueOfEnter();
		/*
		 * print values to out screen
		 */
		System.out.println("Greatest Common Divisor: " + greatestCommonDivisor.ValueGreatestCommonDivisor(a, b));
		System.out.println(
				"Least Common Multiple :" + leastCommonMultiple.ValuesLeastCommonMultiple(a, b, greatestCommonDivisor));

	}

}
