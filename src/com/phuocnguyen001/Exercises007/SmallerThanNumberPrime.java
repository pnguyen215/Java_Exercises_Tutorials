package com.phuocnguyen001.Exercises007;

public class SmallerThanNumberPrime {

	public SmallerThanNumberPrime() {
	}

	public boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i < (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void valuesSmallerThanNumberPrime() {
		EnterNewNumber enterNewNumber = new EnterNewNumber();
		int count = 0; /* count number primes */
		int i = 2; /* find number prime from 2 */
		System.out.print("Enter args[0]: ");
		int number = (int) enterNewNumber.ValueOfEnter("integer");
		System.out.println(" The first " + number + " prime numbers: ");
		while (count < number) {
			if (isPrime(i)) {
				System.out.printf("%d ", i);
				count++;
			}
			i++;
		}
	}
}
