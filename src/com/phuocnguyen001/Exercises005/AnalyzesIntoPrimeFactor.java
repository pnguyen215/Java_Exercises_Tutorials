package com.phuocnguyen001.Exercises005;

import java.util.ArrayList;
import java.util.List;

public class AnalyzesIntoPrimeFactor {

	public AnalyzesIntoPrimeFactor() {
	}

	public List<Integer> analyzesIntoPrimeFactor(int number) {
		int i = 2;
		List<Integer> list = new ArrayList<Integer>();
		/*
		 * analyzes
		 */
		while (number > 1) {
			if (number % i == 0) { /* if number divided by i, equal to 0. It is prime number */
				number /= i; /* number = number / i */
				list.add(i); /* add each i is prime number */
			} else {
				i++;
			}
		}
		/*
		 * if list is empty so then add number into list
		 */
		if (list.isEmpty()) {
			list.add(number);
		}
		return list;

	}

	public void valuesOfAnalyzesIntoPrimeFactor() {
		/*
		 * declared function to enter new number input
		 */
		EnterNewNumber enterNewNumber = new EnterNewNumber();
		System.out.println("Enter args[0]: ");
		int number = (int) enterNewNumber.ValueOfEnter();
		/*
		 * get all of values number integer into list, call method to analysis
		 */
		List<Integer> list = analyzesIntoPrimeFactor(number);
		System.out.printf("Result: %d =  ", number);
		for (int i = 0; i < list.size() - 1; i++) {
			System.out.print(list.get(i) + " * "); // is written in pattern: x * x * ...
		}
		System.out.print(list.get(list.size() - 1));
	}
}
