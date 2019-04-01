package com.phuocnguyen001.Exercises014;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class cau1 {
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

	/*
	 * check number is number prime?
	 */
	public boolean isPrime(int n) {

		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;

	}

	public int countWords(String inputPath) throws IOException {
		/*
		 * open thread to read file input
		 */
		File file = new File(inputPath);
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
		int countToken = 0; /* count token is words */
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
			}
			default: {
				/* convert from char into string and save to list */
				subListOther.add(String.valueOf((char) characters));
				/* System.out.println((char) characters); */
			}
			}
		}
		fileInputStream.close();
		/* return to value of number word */
		return countToken;
	}

	public int sumPrime(String inputPath) throws IOException {
		/*
		 * open thread to read file input
		 */
		File file = new File(inputPath);
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
		int sum = 0; /* sum all of number from content in file */
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
				break;
			}
			/* if characters is number */
			case StreamTokenizer.TT_NUMBER: {
				/* add numbers into list */
				subListNumber.add((int) streamTokenizer.nval);
			}
			default: {
				/* convert from char into string and save to list */
				subListOther.add(String.valueOf((char) characters));
			}
			}
		}
		/* calculate sum */

		for (int number : subListNumber) {
			/* if number is number prime */
			if (isPrime(number)) {
				sum += number;
			}
		}
		fileInputStream.close();
		return sum;
	}

}
