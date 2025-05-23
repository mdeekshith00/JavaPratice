package com.pratice;

import java.util.HashMap;

public class set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MANADADI DEEKSHITH REDDY";
		
		HashMap<Character , Integer> freq = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) +1);
		}
		System.out.println("Character Frequencies: ");
		
		for(char key : freq.keySet()) {
			System.out.println(key + ":" + freq.get(key));
		}

	}
	public  void main() {
		
	}

}
