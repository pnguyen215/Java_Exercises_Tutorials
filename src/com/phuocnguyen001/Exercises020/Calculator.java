package com.phuocnguyen001.Exercises020;

public class Calculator {

	public Calculator() {
	}

	public int divide(int number_1, int number_2) throws MyException {
		try {
			int result;
			result = number_1 / number_2;
			return result;
		} catch (ArithmeticException e) {
			throw new MyException("Error divided by 0");
		}
	}

	public int multipy(int number_1, int number_2) throws MyException {
		return number_2;
	}
}
