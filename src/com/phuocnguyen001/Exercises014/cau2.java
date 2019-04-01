package com.phuocnguyen001.Exercises014;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class cau2 {

	public boolean isNumberEven(int number) {
		if (number % 2 == 0) {
			return true;
		}
		return false;
	}

	public int countEven(String input) throws IOException {
		/*
		 * open thread to read file input
		 */
		File file = new File(input);
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
				// System.out.println((char) characters);
			}
			}
		}
		fileInputStream.close();

		/*
		 * check number is number even
		 */
		int count = 0;
		for (int number : subListNumber) {
			if (isNumberEven(number)) {
				count++;
			}
		}
		return count;
	}
}
