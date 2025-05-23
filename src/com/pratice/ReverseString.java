package com.pratice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String s = "MANADADI DEEKSHITH REDDY";
            StringBuilder sb = new StringBuilder("M DEEKSHITH");
            String r = "";
            char c[] = s.toCharArray();
            
            for(int i=s.length()-1; i>=0; i--) {
            	r +=s.charAt(i);
            //	System.out.println(s.charAt(i));
            }
            System.out.println(r);
            System.out.println(s.length());
            System.out.println(sb.reverse());
   }
}