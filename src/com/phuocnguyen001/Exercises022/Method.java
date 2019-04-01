package com.phuocnguyen001.Exercises022;

import java.util.Scanner;

public class Method {

	Scanner scanner = new Scanner(System.in);
	/*
	 * A. Convert String into number
	 */

	/*
	 * 1. Using parseType()
	 */
	public void StringIntoNumberUsingParseType() {
		/* type number = Type.parseType(string_value); */
		String sample = "1109";

		int number_integer = Integer.parseInt(sample);
		long number_long = Long.parseLong(sample);
		float number_float = Float.parseFloat(sample);
		double numbenr_double = Double.parseDouble(sample);

		System.out.println(number_integer + " is number");
		System.out.println(number_long + " is number");
		System.out.println(number_float + " is number");
		System.out.println(numbenr_double + " is number");
	}

	/*
	 * 2. Using valueOf()
	 */
	public void StringIntoNumberUsingValueOf() {
		/* Type number = Type.valueOf(string_value); */
		String sample = "1109";

		Integer number_integer = Integer.parseInt(sample);
		Long number_long = Long.parseLong(sample);
		Float number_float = Float.parseFloat(sample);
		Double numbenr_double = Double.parseDouble(sample);

		System.out.println(number_integer + " is number");
		System.out.println(number_long + " is number");
		System.out.println(number_float + " is number");
		System.out.println(numbenr_double + " is number");

	}

	/*
	 * B. Convert Number into String
	 */

	/*
	 * 1. Add empty string with number
	 */
	public void NumberIntoStringUsingEmptyStringWithNumber() {
		/* String string = "" + number_value; */
		int number_Integer = 1109;
		double number_Double = 1109.1997;
		String sample_Integer = " " + number_Integer;
		String sample_Double = " " + number_Double;

		System.out.println(sample_Double + " is string");
		System.out.println(sample_Integer + " is string");
	}

	/*
	 * 2. Using String.valueOf()
	 */
	public void NumberIntoStringUsingStringValueOf() {
		/* String string = String.valueOf(number_value); */
		int number_Integer = 1109;
		double number_Double = 1109.1997;
		String sample_Integer = String.valueOf(number_Integer);
		String sample_Double = String.valueOf(number_Double);

		System.out.println(sample_Double + " is string");
		System.out.println(sample_Integer + " is string");
	}

	/*
	 * 3. Using toString()
	 */
	public void NumberIntoStringUsingToString() {
		/* String string = Type.toString(type_value); */
		int number_Integer = 1109;
		double number_Double = 1109.1997;
		String sample_Integer = Integer.toString(number_Integer);
		String sample_Double = Double.toString(number_Double);

		System.out.println(sample_Double + " is string");
		System.out.println(sample_Integer + " is string");
	}

	/*
	 * C. Change the string to an array of bytes
	 */
	public void StringIntoArrayBytes() {
		/* byte[] b = string_value.getBytes(); */
		String sample = "David Nguyen";

		byte[] bty = sample.getBytes();

		for (int i = 0; i < bty.length; i++) {
			System.out.print(bty[i]);
		}

	}

	/*
	 * D. Change the byte array to string
	 */
	public void ByteArrayIntoString() {

		/* String string = new String(mang_byte); */
		byte[] bty = { 'D', 'a', 'v', 'i', 'd' };
		String sample = new String(bty);

		System.out.println(sample);
	}
}
