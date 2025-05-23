package com.pratice;

public class Plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "oyo";
		int n = s.length();
		System.out.println(n);
		boolean res = isPalindrome(s);
		if(res) {
			System.out.println(res + " is Palindrome");
		} else {
			System.out.println(res + "is not a Palindrome ");
		}
		System.out.println(isPrime(n));
	} 
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		String res = "";
		for(int i=s.length()-1; i>=0; i--) {
			res +=s.charAt(i);
		}
		System.out.println(res);
		
		return s.equals(res);
	} 
	public static boolean isPrime(int n) {
		if(n%2 == 0) {
			return true;
		}
		return false;
	}

}
