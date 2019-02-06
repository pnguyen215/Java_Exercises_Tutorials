package com.phuocnguyen001.Exercises012;

import com.phuocnguyen001.Exercises010.EnterNewNumber;

public class MethodPermutation {

	private int number;
	private int[] array;
	private int extra_Variable;

	/*
	 * Initials each values
	 */
	public void init() {
		/* call method to enter argument */
		EnterNewNumber enterNewNumber = new EnterNewNumber();
		System.out.println("Enter args[0]: ");
		number = (int) enterNewNumber.ValueOfEnter("integer");
		/* initial array */
		array = new int[number + 1];
		/* using for loop to assign values */
		for (int sub_Variable = 1; sub_Variable <= number; sub_Variable++) {
			array[sub_Variable] = sub_Variable;
		}
	}

	/*
	 * Generation permutation
	 */
	public void generationPermutation() {
		do {
			printfOut();
			extra_Variable = number - 1;
			while (extra_Variable > 0 && array[extra_Variable] > array[extra_Variable + 1]) {
				extra_Variable--;
			}
			if (extra_Variable > 0) {
				int sub_Variable = number;
				/*
				 * Gradually fade from the end of the range to find the first larger molecule x
				 * [i] swapped after finding
				 */
				while (array[sub_Variable] < array[extra_Variable]) {
					--sub_Variable;
				}
				/* swap position */
				int template = array[sub_Variable];
				array[sub_Variable] = array[extra_Variable];
				array[extra_Variable] = template;
				/* Overturned position */
				sub_Variable = number;
				for (int sub_Variable_Second = extra_Variable
						+ 1; sub_Variable_Second < sub_Variable; sub_Variable_Second++, sub_Variable--) {
					template = array[sub_Variable_Second];
					array[sub_Variable_Second] = array[sub_Variable];
					array[sub_Variable] = template;
				}
			}

		} while (extra_Variable != 0);
	}

	/*
	 * Show result
	 */
	public void printfOut() {
		/* using for loop */
		for (int i = 1; i <= number; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
