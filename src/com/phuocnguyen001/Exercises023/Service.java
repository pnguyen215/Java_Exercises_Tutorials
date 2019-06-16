package com.phuocnguyen001.Exercises023;

import java.io.Serializable;

public class Service implements Serializable {

	private static final long serialVersionUID = 1L;
	private EnterValue enterValue = new EnterValue();

	public float horner(float array[], int element) {
		float sum = 0;
		int x;
		System.out.print("Enter x:  ");
		x = (int) enterValue.ValueOfEnter("integer");
		sum = array[0];
		for (int i = element; i > 0; i--) {
			sum = sum * x + array[i - 1];
		}
		return sum;
	}
}
