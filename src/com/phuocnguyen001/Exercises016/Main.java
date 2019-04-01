package com.phuocnguyen001.Exercises016;

public class Main {

	public static void main(String[] args) {
		Method method = new Method();
		Producer producer = new Producer(method);
		Consumer consumer = new Consumer(method);
		producer.start();
		consumer.start();
	}

}
