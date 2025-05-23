package com.pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Scannner1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		
		 // console c = new console(System.in);
		int n1 = br.read();
		System.out.println(n1);
		String n = br.readLine();
		System.out.println(n);

	}

}
