package com.pratice;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 27;
		System.out.println(nextPrime(n));
		System.out.println(isPrime1(n));
		printPrimeFactorization(n);

	}
	public static int nextPrime(int n ) {
		n++;
		while(true) {
			int i ;
			for(i=2; i<n; i++) {
				if(n%i == 0) {
					break;
				}
			}
			if(i == n) return n ;
			n++;
		}
	}
	public static boolean isPrime1(int n) {

	    for (int i = 2; i < n; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	public static void printPrimeFactorization(int n) {

	    for (int i = 2; i <= n; i++) {
	        if (isPrime1(i)) {
	            int x = i;   // x = 17
	            while (n % x == 0) {
	                System.out.print(i + " ");
	                x = x * i;
	            }
	        }
	    }
	}

}
