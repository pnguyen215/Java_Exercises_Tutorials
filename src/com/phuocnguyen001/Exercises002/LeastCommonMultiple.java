package com.phuocnguyen001.Exercises002;

public class LeastCommonMultiple {

	public LeastCommonMultiple() {
	}

	public int ValuesLeastCommonMultiple(int a, int b, GreatestCommonDivisor greatestCommonDivisor) {
		return (int) (a * b) / (greatestCommonDivisor.ValueGreatestCommonDivisor(a, b));

	}
}
