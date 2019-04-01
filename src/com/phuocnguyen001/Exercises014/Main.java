package com.phuocnguyen001.Exercises014;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		cau1 A = new cau1();
		// cau2 B = new cau2();
		// String s1 = "And the GS75 Stealth doesn't compromise on the specs: With its
		// 17.3 inch, 144Hz FHD screen, 8th GEN Core i7, and GeForce RTX 2070 Max-Q
		// GPU.";
		// String s2 = "All good things must come to an end, even Windows 7. After
		// 2020/01/14 Microsoft will no longer provide security updates or support for
		// PCs running Windows 7. But you can keep the good times rolling by moving to
		// Windows 10.";
		// String s3 = "The expiration date of this certificate is 18/02/2017. So you
		// need to extend it before 2017/02/17.";

		try {
			System.out.println(A.countWords("input2.txt"));
			System.out.println(A.sumPrime("input2.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
