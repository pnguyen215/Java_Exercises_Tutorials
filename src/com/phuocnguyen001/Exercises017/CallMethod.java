package com.phuocnguyen001.Exercises017;

import java.io.IOException;
import java.util.List;

public class CallMethod {
	public void callMethodReadFile() {
		/*
		 * create new object
		 */
		MethodOnFile fileMethod = new MethodOnFile();
		/*
		 * create new list data to save data after values is returned
		 */
		List<String> listData;
		String[] words = null;
		int count = 0;
		try {
			/* call method */
			listData = fileMethod.readFileText("input1.txt");
			/* print out result after save into list data */
			for (String result : listData) {
				words = result.split("");
				/*
				 * print out after split string
				 */
				for (String word : words) {
					System.out.println(word);

				}
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("count = " + count);
	}
}
