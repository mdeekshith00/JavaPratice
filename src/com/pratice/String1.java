package com.pratice;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "CHINTU REDDY";
		reverse(str);
		Palindrome();
		CountVowelsConsonants(str);

	}
	public static void reverse(String str) {
		String reversed = "";
		for(int i=str.length()-1; i>=0; i--) {
			reversed +=str.charAt(i);
		}
		System.out.println(reversed);
	}
	public static void Palindrome()  {
		String str = "RADAR";
		String res = "";
        int n = str.length();
        
        for(int i=n-1; i>0; i--) {
        	res +=str.charAt(i);
        }
        System.out.println(str.equals(res));
	
	} 
	public static void CountVowelsConsonants(String str) {
		int vowels = 0, constansts = 0;
		
		for(char c : str.toLowerCase().toCharArray()) {
			if("aeiou".indexOf(c) >= 0) {
				vowels++;
			} else {
				constansts++;
			}
		} 
		System.out.println(vowels + " " + constansts);
	}

}
