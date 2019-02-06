package com.phuocnguyen001.Exercises010;

public class CallMethod {

	public CallMethod() {

	}

	public void callMethod() {
		EnterNewNumber enterNewNumber = new EnterNewNumber();
		MethodFindBinaryNumber methodFindBinaryNumber = new MethodFindBinaryNumber();
		/*
		 * 1. Using method normal to print out string binary numbers
		 */
		System.out.println("Enter args[0]: ");
		int number = (int) enterNewNumber.ValueOfEnter("integer");
		/*
		 * call method on that class and show result
		 */
		methodFindBinaryNumber.usingMethodNormal(number);
		/*
		 * count no Of cases, can be show in console
		 */
		System.out.println("There are: " + methodFindBinaryNumber.countCase(number) + " cases.");

		/*
		 * 2. Using method back-tracking
		 */
		System.out.println("Using Back-Tracking, to show binary numbers: ");
		methodFindBinaryNumber.usingMethodBackTracking(number);
	}

}
