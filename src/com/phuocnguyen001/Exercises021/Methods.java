package com.phuocnguyen001.Exercises021;

import java.io.Serializable;

public class Methods implements Serializable {

	private static final long serialVersionUID = 1L;

	/*
	 * First, let's delete the first and last spaces using the trim () method.
	 */
	public String standardized_String(String sample) {
		sample = sample.trim();
		/*
		 * Or while (sample.indexOf("  ") != -1) sample = sample.replaceAll("  "," ");
		 */
		sample = sample.replaceAll("\\s+", " ");

		return sample;

	}

	/*
	 * The next step is to capitalize the first letters of each word. We use the
	 * split method () to separate the string into an array of words. Then use
	 * String.valueOf (). ToUperCase () to capitalize the first character each last
	 * word is connected to their remaining characters in the substring (1).
	 */
	public String standardize_Individual_Nouns(String sample) {

		sample = standardized_String(sample);
		/*
		 * We use the split method () to separate the string into an array of words.
		 */
		String template[] = sample.split(" ");
		sample = "";
		for (int i = 0; i < template.length; i++) {
			sample += String.valueOf(template[i].charAt(0)).toUpperCase() + template[i].substring(1);
			/*
			 * break out for loop
			 */
			if (i < template.length - 1) {
				sample += " "; /* connect each words is a space */
			}
		}
		return sample;

	}
}
