package com.pratice;

import java.util.HashSet;
import java.util.Scanner;

public class StringUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = "abd";
		int n = s.length();
	// 	System.out.println(isUnique(s,n));
		isUnique(s,n);
	
	}
	public static void isUnique(String s, int n) {
		HashSet<String> m1 =  new HashSet<>();
		
		for(int i=0; i<n; i++) {
			String w = ""; // abd
			for(int j=i; j<n; j++) {
				w = w + s.charAt(j);
				m1.add(w);
			}
		}
		
		System.out.println(m1);
	}

}
