package package1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class swapNeigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(swap(str));
	    System.out.println(str.length());
	 //   System.out.println(str.charAt(0));
	    
		for(int i=0; i<str.length()-1; i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();
		
		String s  = "CHINTU";
		System.out.println("subString " + s.substring(0));
		
		System.out.println();
		System.out.println(duplicate(str));
		

	}
	public static String swap(String str) {
		char c[] = str.toCharArray();
		for(int i=0; i<str.length()-1; i= i+2) {
			char temp = c[i];
			c[i] =c[i+1];
			c[i+1] = temp;
		}
		return new String(c);
	}
	
	public static String duplicate(String str) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(char c : str.toCharArray()) {
			set.add(Character.toUpperCase(c));
		}
		StringBuilder sb = new StringBuilder();
		for(char c1 : set) {
			sb.append(c1);
		}
		return sb.toString();
	}

}
