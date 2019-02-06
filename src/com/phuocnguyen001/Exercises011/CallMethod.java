package com.phuocnguyen001.Exercises011;

public class CallMethod {
	public static int[] array;

	public void callMethod() {
		/*
		 * create new object to call method
		 */
		EnterNewNumber enterNewNumber = new EnterNewNumber();
		MethodSubset methodSubset = new MethodSubset();
		/*
		 * enter input
		 */
		int number;
		System.out.println("Enter args[0]: ");
		number = (int) enterNewNumber.ValueOfEnter("integer");
		/* initial integer array */
		array = new int[number + 1];
		System.out.println("Subset of k elements 1, 2, ..." + number + " : ");
		for (int i = 1; i <= number; i++) {
			System.out.println("Subset of " + i + " elements: ");
			methodSubset.backTracking(array, number, i, 1);
		}
	}
}
