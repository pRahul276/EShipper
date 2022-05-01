package com.eshipper.coding.challage.problem2;

import java.text.DecimalFormat;

public class GrossPriceCalculator {

	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		
		System.out.println(getGrossPrice(49999, 0.28));
	}

	/*
	 * I tried to solve this but, can't
	 * can you display your logic please.
	 * */
	private static double getGrossPrice(double netPrice, double taxRate) {

		// your code goes here
		
		double grossPrise = 0.00;
		double taxAmount = 0.00;
		double tax = Math.round(taxRate * 100);

//		taxAmount = Math.round(netPrice * tax);
		grossPrise = Math.round(netPrice - tax);

		return grossPrise;
	}
}
