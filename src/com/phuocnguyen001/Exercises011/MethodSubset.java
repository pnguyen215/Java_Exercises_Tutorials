package com.phuocnguyen001.Exercises011;

public class MethodSubset {

	/*
	 * method print out for result
	 */
	public void printfOut(int[] array, int number) {
		System.out.println();
		for (int i = 1; i <= number; i++) {
			System.out.println(" " + array[i]);

		}
	}

	/*
	 * using method backTrack to find subset
	 */
	public void backTracking(int[] array, int no_One, int no_Two, int extra_Variable) {

		for (int sub_Variable = array[extra_Variable - 1] + 1; sub_Variable <= (no_One - no_Two
				+ extra_Variable); sub_Variable++) {

			array[extra_Variable] = sub_Variable;
			if (extra_Variable == no_Two) {
				printfOut(array, no_Two);
			} else {
				backTracking(array, no_One, no_Two, extra_Variable + 1);
			}
		}
	}
}
