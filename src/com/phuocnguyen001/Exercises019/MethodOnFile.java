package com.phuocnguyen001.Exercises019;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodOnFile {

	public MethodOnFile() {
	}

	public void printOut(List<String> list) {
		for (String subString : list) {
			System.out.println(subString.toString());
		}
	}

	public int calculateSum(List<Integer> list) {
		int sum = 0;
		for (int number : list) {
			sum += number;
		}
		return sum;
	}

	public void readFile(String fileName) throws IOException {
		/*
		 * open thread to read file input
		 */
		File file = new File(fileName);
		FileInputStream fileInputStream = new FileInputStream(file);
		/*
		 * declared array list to save all words
		 */
		List<String> subListString = new ArrayList<String>();
		List<Integer> subListNumber = new ArrayList<Integer>();
		List<String> subListOther = new ArrayList<String>();

		/*
		 * declared sum variable to calculate sum of numbers in file
		 */
		int countNumber = 0;
		int countToken = 0;
		/*
		 * open thread stream Token
		 */
		@SuppressWarnings({ "deprecation" })
		StreamTokenizer streamTokenizer = new StreamTokenizer(fileInputStream);
		streamTokenizer.ordinaryChars('.', '.');
		/*
		 * declared a variable to run in while, check token
		 */
		int characters;
		while ((characters = streamTokenizer.nextToken()) != StreamTokenizer.TT_EOF) {
			switch (characters) {
			/* if characters is word */
			case StreamTokenizer.TT_WORD: {
				/* add words into list */
				subListString.add(streamTokenizer.sval);
				countToken++;
				break;
			}
			/* if characters is number */
			case StreamTokenizer.TT_NUMBER: {
				/* add numbers into list */
				subListNumber.add((int) streamTokenizer.nval);
				countNumber++;
			}
			default: {
				/* convert from char into string and save to list */
				subListOther.add(String.valueOf((char) characters));
				// System.out.println((char) characters);
			}
			}
		}
		System.out.println("After handing file :) ...");
		System.out.println("Sort list words [a -> z ]: ");
		Collections.sort(subListString);
		printOut(subListString);
		System.out.println("There are " + countToken + " tokens");
		System.out.println("There are " + countNumber + " numbers");
		System.out.println("Sum all of number in file: " + calculateSum(subListNumber));
		fileInputStream.close();
	}

}
