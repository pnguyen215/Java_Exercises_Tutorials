package com.phuocnguyen001.Exercises009;

import java.util.ArrayList;
import java.util.List;

public class MethodReversalNumbers {
	public static final int NUMBER_FIRST = 1000; /* start number */
	public static final int NUMBER_LAST = 9999; /* last number */

	public MethodReversalNumbers() {
	}

	public boolean checkReversalNumber(int number) {
		/*
		 * stringBuilder, secondary chain to append new string
		 */
		StringBuilder stringBuilder = new StringBuilder();
		/*
		 * convert new string from number
		 */
		String testLine = "" + number;
		/*
		 * append number in form string 'testLine' into stringBuilder
		 */
		stringBuilder.append(testLine);
		/*
		 * to reverse stringBuilder into checkLine, example: 1234 -> 4321
		 */
		String checkLine = "" + stringBuilder.reverse();
		/*
		 * to compare between the initial string with final string after reverse string
		 */
		if (testLine.equals(checkLine))
			return true;
		else
			return false;

	}

	public void valuesOfReversalNumber() {
		int count = 0;
		/*
		 * declared list to save all reversal number
		 */
		List<Integer> list = new ArrayList<Integer>();
		for (int i = NUMBER_FIRST; i <= NUMBER_LAST; i++) {
			if (checkReversalNumber(i)) {
				list.add(i);
				count++; /* count number reversal */
			}
		}
		/*
		 * print out all reciprocal Numbers
		 */
		for (int reciprocalNumbers : list) {
			System.out.println(reciprocalNumbers);
		}
		System.out.println("There are: " + count + " reversal numbers!");
	}
}
