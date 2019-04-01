package com.phuocnguyen001.Exercises016;

public class Consumer extends Thread {
	private Method method;
	boolean check;

	public Consumer(Method method) {
		this.method = method;

	}

	@Override
	public void run() {

		while (true) {
			check = method.consumer();
		}
	}
}
