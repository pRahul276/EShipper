package com.eshipper.coding.challage.problem1;

import java.util.Scanner;

public class DigitCounter {

	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		int digit = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Integer Number: ");
		int number = sc.nextInt();
		digit = getDigitCount(number);

		System.out.println(" ");
		System.out.println("Number of Digit in Input Integer is: " + digit);
	}

	public static int getDigitCount(int number) {
		// your code goes here
		int ans = 0;
		number = Math.abs(number);
		String string = Integer.toString(number);
		ans = string.length();

		return ans;
	}
}