package com.pratice;

import java.util.Scanner;

public class converter {
	static final double USD_TO_INR = 19.00;
	static final double USD_TO_EUR = 19.00;
	static final double INR_TO_INR = 19.00;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Available curriencies : USD, INT , EUR: ");
		System.out.println("Enter the source:");
		String source = sc.next().toUpperCase();
		System.out.println("Enter the target:");
		String target = sc.next().toUpperCase();
		System.out.println("Enter the amount:");
		double amount = sc.nextDouble();
		
		double ConvertedCurrency = ConvertedCurrency(source,target,amount);
		
		if(ConvertedCurrency != -1) {
			System.out.println("ConvertedCurrency:" + ConvertedCurrency + " " + target);
		}
		sc.close();
	}

	private static double ConvertedCurrency(String source, String target, double amount) {
		// TODO Auto-generated method stub
		if(source.equals("USD") && target.equals("INR")) {
			return amount * USD_TO_INR;
		} else if(source.equals("USD") && target.equals("EUR")) {
			return amount * USD_TO_EUR;
		} else if(source.equals("INR") && target.equals("INR")) {
			return amount * INR_TO_INR;
		}
		return -1;
	}

}
