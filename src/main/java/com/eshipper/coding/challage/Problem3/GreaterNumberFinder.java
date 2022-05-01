package com.eshipper.coding.challage.Problem3;

import java.util.Scanner;

public class GreaterNumberFinder {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Double Number  for a : ");
		double a = sc.nextDouble();
		System.out.println("Please Enter Double Number  for b : ");
		double b = sc.nextDouble();

		System.out.println("(" +getGreater(a, b) + " )");
	}

	private static double getGreater(double a, double b) {
		// your code goes here
		double ans;
		if (a > b) {
			ans = a;
			System.out.print("The Grater Number is a: ");
		} else {
			ans = b;
			System.out.print("The Grater Number is b: ");
		}

		return ans;
	}
}