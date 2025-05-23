package com.pratice;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;
		int b=32;
	// Write a program to swap two numbers without using a temporary variable.
		 a = a+b; // 44
		 b = a-b; // 44-32 = 12
		 a = a-b; // 44-12 = 32
		 System.out.println("After swap :" + "a ="+  a + "  b=" + b);
	
	

	}

}
