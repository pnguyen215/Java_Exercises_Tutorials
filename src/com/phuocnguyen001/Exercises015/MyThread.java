package com.phuocnguyen001.Exercises015;

/*
 * Question 2
 */
public class MyThread implements Runnable {

	private int count = 0;

	public synchronized void counter() throws InterruptedException {
		for (int i = 1; i <= 1000; i++) {
			try {
				count++;
				Thread.sleep(1000);
				System.out.println(count + " ");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void run() {
		try {
			counter();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
