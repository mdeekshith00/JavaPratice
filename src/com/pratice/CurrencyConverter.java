package com.pratice;

import java.util.Scanner;

public class CurrencyConverter {
	static final double USD_TO_INR = 88.50;
	static final double USD_TO_EUR = 0.94;
	static final double EUR_TO_INR = 88.00;
	private static Object targetConcurrency;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Avalilable currencies : USD , EUR , INR");
		System.out.println("Enter source currency: ");
		String sourceCurrency = sc.nextLine().toUpperCase();
		System.out.println("Enter target currency: ");
		String targetCurrency = sc.nextLine().toUpperCase();
		System.out.println("Enter amount to Convert: ");
		double amount = sc.nextDouble();
		
		double convertedAmount = convertCurrency(sourceCurrency,targetCurrency,amount);
		
		
		if(convertedAmount != -1) {
			System.out.println("Converted amount : " + convertedAmount + " " + targetCurrency);
		} else {
			System.out.println("Invalid currency code. ");
		}
         sc.close();
	}


	private static double convertCurrency(String sourceCurrency, String targetCurrency, double amount) {
		// TODO Auto-generated method stub
		if(sourceCurrency.equals("USD") && targetCurrency.equals("INR")) {
			return amount * USD_TO_INR;
		} else if(sourceCurrency.equals("USD") && targetCurrency.equals("EUR")) {
			return amount * USD_TO_EUR;
		} else if(sourceCurrency.equals("EUR") && targetCurrency.equals("INR")) {
			return amount * EUR_TO_INR;
		}
		return -1;
	}




	

}
