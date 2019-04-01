package com.phuocnguyen001.Exercises015;

public class Main {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread thread1 = new Thread(myThread);
		Thread thread2 = new Thread(myThread);
		Thread thread3 = new Thread(myThread);
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread2.start();
		try {
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread3.start();
	}

}
