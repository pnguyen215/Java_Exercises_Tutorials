package com.phuocnguyen001.Exercises017;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MethodOnFile {
	public List<String> readFileText(String fileName) throws IOException {
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
		return listString;
	}
}
