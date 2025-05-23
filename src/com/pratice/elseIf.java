package com.pratice;


public class elseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operator = 1;
		int a = 21;
		int b = 33;
		
		
		if(operator == 1) {
            System.out.println(a+b);
        }else if(operator == 2) {
            System.out.println(a-b);
        } else if(operator == 3) {
            System.out.println(a*b);
        }else {
            System.out.println("Invalid Input");
        }
		
	}

}
