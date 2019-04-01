package com.phuocnguyen001.Exercises018;

import java.io.IOException;

public class StreamIntoFile {

	public StreamIntoFile() {
	}

	public void streamToFile() throws IOException {
		MethodOnFile methodOnFile = new MethodOnFile();
		methodOnFile.readFile("input2.txt");

	}
}
