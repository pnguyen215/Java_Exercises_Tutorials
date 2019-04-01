package com.phuocnguyen001.Exercises018;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MethodOnFile {

	public MethodOnFile() {
	}

	public void readFile(String fileName) throws IOException {
		/*
		 * open thread to read file input
		 */
		File file = new File(fileName);
		FileInputStream fileInputStream = new FileInputStream(file);
		/*
		 * declared ArrayList to save all words from file text
		 */
		List<String> listString = new ArrayList<String>();
		/*
		 * initial two variables, to hand in file and convert characters into string
		 */
		int c = fileInputStream.read();
		String stringValuesOf = null;
		/*
		 * processing read file
		 */
		while (c != -1) {
			/* convert char into string */
			stringValuesOf = String.valueOf((char) c);
			/* add string into list data */
			listString.add(stringValuesOf);
			/* continue read until the end of line */
			c = fileInputStream.read();
		}
		/*
		 * close thread
		 */
		fileInputStream.close();
		/*
		 * Using StringTokenizer to split string
		 */
		StringTokenizer stringTokenizer = null;
		/*
		 * declared two variables
		 */
		String word = null;
		String[] listString1 = null;
		int count = 0;
		/*
		 * create for loop, get string type to hand into StringTokenizer
		 */
		for (String subString : listString) {
			stringTokenizer = new StringTokenizer(subString, "\\s");
			while (stringTokenizer.hasMoreTokens()) {
				word = stringTokenizer.nextToken();
				listString1 = word.split(" ");
				for (int i = 0; i < listString1.length; i++) {
					/*
					 * check the first character upperCase
					 */
					if (listString1[i].charAt(0) < 91) {
						count++;
					} else {
						count += 0;
					}
				}
			}
		}
		System.out.println("In this file, has  " + count + " words is written with the first character uppercase.");
	}
}
