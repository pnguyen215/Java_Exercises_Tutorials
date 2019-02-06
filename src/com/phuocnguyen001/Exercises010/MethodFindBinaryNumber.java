package com.phuocnguyen001.Exercises010;

public class MethodFindBinaryNumber {

	public int convertStringBinaryToDecimalNumber(String input) {
		int decimalNumber = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '1') {
				decimalNumber = decimalNumber + 1 * (int) Math.pow(2, input.length() - i - 1);
			} else if (input.charAt(i) == '0') {
				decimalNumber = decimalNumber + 0 * (int) Math.pow(2, input.length() - i - 1);
			}

		}
		return decimalNumber;

	}

	public void usingMethodBackTracking(int number) {

		/*
		 * declared array to save binary number
		 */
		int[] arrayBinary = new int[number];
		int integrated;
		int temporaryVariable = 0;
		do {
			integrated = 1;
			System.out.println(" ");
			for (int i = 0; i < number; i++) {
				System.out.print(arrayBinary[i]);
				integrated *= arrayBinary[i];
			}
			temporaryVariable = number - 1;
			do {

				if (arrayBinary[temporaryVariable] == 0) {
					arrayBinary[temporaryVariable] = 1;
					for (int i = number - 1; i > temporaryVariable; i--) {
						arrayBinary[i] = 0;
					}
					break;

				} else {
					temporaryVariable--;
				}
			} while (temporaryVariable >= 0);
		} while (integrated != 1);

	}

	public void usingMethodNormal(int number) {
		String binary_Min = "";
		String binary_Max = "";
		int number_Min;
		int number_Max;
		int length_Number_Max;
		/*
		 * add values for binary_Max and binary_Min
		 */
		for (int i = 0; i < number; i++) {
			binary_Min += "0";
			binary_Max += "1";
		}
		number_Min = convertStringBinaryToDecimalNumber(binary_Min);
		number_Max = convertStringBinaryToDecimalNumber(binary_Max);
		length_Number_Max = Integer.toBinaryString(number_Max).length();
		for (int i = number_Min; i <= number_Max; i++) {
			String integerToBinary = Integer.toBinaryString(i);
			if (integerToBinary.length() < length_Number_Max) {
				while (integerToBinary.length() < length_Number_Max) {
					integerToBinary = "0" + integerToBinary;
				}
				System.out.println("Case " + i + " - " + integerToBinary);
			} else {
				System.out.println("Case " + i + " - " + integerToBinary);
			}
		}

		System.out.println("Number Min: " + number_Min);
		System.out.println("Number Max: " + number_Max);
		System.out.println("Length Of last case: " + length_Number_Max);
	}

	public int countCase(int number) {
		int noOfCase = (int) Math.pow(2, number);
		return noOfCase;
	}
}
