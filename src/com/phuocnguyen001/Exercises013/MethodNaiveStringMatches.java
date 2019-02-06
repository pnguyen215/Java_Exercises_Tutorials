/**
 *
 */
package com.phuocnguyen001.Exercises013;

/**
 * @author David Nguyen
 *
 */

public class MethodNaiveStringMatches {
	public void nativeStringMathes(String postfix, String prefix) {
		boolean flag = true;
		int no_One;
		int no_Two;

		no_One = postfix.length();
		no_Two = prefix.length();

		for (int extra_Variable = 0; extra_Variable <= no_One - no_Two; extra_Variable++) {
			flag = true;
			for (int sub_Variable = 0; sub_Variable < no_Two; sub_Variable++) {
				if (prefix.charAt(sub_Variable) == postfix.charAt(extra_Variable + sub_Variable)) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			/* if flag is true */
			if (flag) {
				System.out.println("Position: " + extra_Variable);
			}
		}
	}
}
