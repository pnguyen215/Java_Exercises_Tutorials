package com.phuocnguyen001.Exercises003;

public class DecimalToBase {

	public DecimalToBase() {
	}

	public void ValuesOfDecimalToBase(int n, int base) {
		if (n >= base) {
			ValuesOfDecimalToBase(n / base, base);
		}
		if (n % base > 9) {
			System.out.printf("%c", n % base + 55);
		} else {
			System.out.print((n % base));
		}
	}
}
