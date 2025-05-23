package com.pratice;

import java.util.ArrayList;

public class BankAccount {
	
	private int accountNumber;
	private String pin;
	private double balance;
	private ArrayList<String> transcationHistory;
	public BankAccount(int accountNumber, String pin, double initilaBalance, double intilaBalance) {
		super();
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = intilaBalance;
		this.transcationHistory = new ArrayList<>();
		addTrascation("Account created with balance: " + initilaBalance);
	}
	private void addTrascation(String details) {
		// TODO Auto-generated method stub
		transcationHistory.add(details);
		
	}
	
	
	

}
