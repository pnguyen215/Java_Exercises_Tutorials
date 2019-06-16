package com.phuocnguyen001.Exercises023;

import java.io.Serializable;

public class ServiceImplement implements Serializable {
	private static final long serialVersionUID = 1L;
	private Service service = new Service();
	private EnterValue enterValue = new EnterValue();

	public void calulator() {
		System.out.print("Enter the order of polynomials n = ");
		int number = (int) enterValue.ValueOfEnter("integer");
		float[] array = new float[number + 1];
		/*
		 * input for polynomials
		 */
		for (int i = number; i >= 0; i--) {
			System.out.print("Enter the coefficient x^" + i + " = ");
			array[i] = (float) enterValue.ValueOfEnter("float");
		}
		System.out.println("Result of polynomials is: " + service.horner(array, number));
	}
}
