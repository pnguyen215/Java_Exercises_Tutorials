package com.phuocnguyen001.Exercises020;

import java.io.Serializable;

public class MyException extends Exception implements Serializable {

	private static final long serialVersionUID = 1L;
	private String message;

	public MyException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
