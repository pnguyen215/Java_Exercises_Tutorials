package com.phuocnguyen001.Exercises006;

public class ListAllPrime {

	public ListAllPrime() {
	}

	public boolean isPrime(int n) {

		if (n < 2)
			return false;
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;

	}

	public void valuesOfListAllPrimes() {
		EnterNewNumber enterNewNumber = new EnterNewNumber();
		System.out.println("Enter args[0]: ");
		double number = (double) enterNewNumber.ValueOfEnter("double");
		System.out.print("All of number prime has value less than " + number + " : ");
		/*
		 * check and list all of number primes
		 */
		for (int i = 1; i < number; i += 1) {
			if (isPrime(i)) {
				System.out.print(" " + i);
			}
		}
	}
}
