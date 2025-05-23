package com.pratice;

import java.io.IOException;

class ExcePropagation {
	 void m() {
		 n();
	 }
	 void n() {
		 throw new  ArithmeticException("msg");
	 }
	 void p() {
		 m();
	 }
 }
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcePropagation obj = new ExcePropagation();
		obj.n();

	}

}
