package com.phuocnguyen001.Exercises002;

public class GreatestCommonDivisor {

	public GreatestCommonDivisor() {
	}

	/*
	 * declared method to calculate Greatest Common Divisor
	 */
	public int ValueGreatestCommonDivisor(int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
				// System.out.println(a);
			} else {
				b -= a;
				// System.out.println(b);
			}
		}
		return a;
	}
}
