package com.phuocnguyen001.Exercises019;

import java.io.IOException;

public class StreamIntoFile {

	public StreamIntoFile() {
	}

	public void streamToFile() {
		MethodOnFile methodOnFile = new MethodOnFile();
		try {
			methodOnFile.readFile("input3.txt");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
