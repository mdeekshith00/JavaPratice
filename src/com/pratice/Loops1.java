package com.pratice;

public class Loops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci();

	}
	public static void Fibonacci() {
		int n =10;
		int a=0, b=1;
		
		System.out.println("Fibonacci Series: ");
		for(int i=1; i<=n; i++) {
			System.out.println(a + " ");
			int next = a+b;
			a=b;
			b=next;
		}
	}

}
