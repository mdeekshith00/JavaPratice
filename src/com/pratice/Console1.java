package com.pratice;

import java.io.Console;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Console1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Console c = System.console();
		PrintStream ps = new PrintStream("DEEKSHITH");
		
		System.out.println("Enter Password:");
		char ch[] = c.readPassword();
		System.out.println(ch);
		char ch1[] = c.readPassword("DEEKSHITH REDDY", args);
		System.out.println(ch1);
	}

}
