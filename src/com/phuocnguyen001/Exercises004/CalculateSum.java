package com.phuocnguyen001.Exercises004;

public class CalculateSum {
	int sum;

	public CalculateSum() {
	}

	public int ValueOfSum(long number) {
		sum = 0;
		long i;
		while (number != 0) {
			i = number % 10;
			sum += i;
			number /= 10;
		}
		return sum;
	}
}
