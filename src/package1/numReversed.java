package package1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class numReversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter n value : ");
		int n = 10;
	//	System.out.println("enter a value :");
		int a = 18;
	//	System.out.println("enter b value : ");
		int b = 16;
		System.out.println("Enter str1 value :");
		String str1 = sc.next();
		System.out.println("Enter str2 value :");
		String str2 = sc.next();
		
		String s1 = "abcdef";
		String s2 = "a*?f";
		
		reverse(n);
		fabonacii(n);
		System.out.println(gcd(a,b));
		System.out.println(perfectNum(n));
		System.out.println(anagram(str1,str2));
		
		 palindrome(str1);
		 charFrequency(str1);
		System.out.println("match " +  match(s1,s2));
		
	}
	public static void reverse(int n ) {
		int reve = 0;
		while( n != 0) {
			reve = reve * 10 + n%10;
			n = n/10;
		} 
		System.out.println("reversed :" + reve);
	}
	public static void fabonacii(int n ) {
		int a = 0, b =1;
		for(int i=2; i<n; i++) {
			int temp = a+b;
			System.out.print(temp + " ");
			a=b;
			b=temp;
		}
		System.out.println();
	}
	public static int gcd(int a , int b) {
		if(b == 0) {
			return a;
		}
		return  gcd(b , a%b);
	}
	public static boolean perfectNum(int n) {
		int sum =0;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				sum = sum + i;
			}
		}
		if(sum == n) {
			return true;
		}
		return false;
	}
	public static boolean anagram(String str1, String str2) {
		char c1[] = str1.toCharArray();
		char c2[] = str2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
	}
	public static boolean  palindrome(String str1) {
		return str1.equals(new StringBuilder(str1).reverse().toString());
	}
	public static void charFrequency(String str1) {
		int n = str1.length();
		 HashMap<Character , Integer> map = new HashMap<>();
		 for(char c : str1.toCharArray()) {
			 map.put(c, map.getOrDefault(c,0) + 1);
			}
		 System.out.println(map);
	}
	// pattern check with wildcard 
	public static boolean match(String s1, String s2) {
		return s1.matches(s2.replace("*", ".*").replace("?","."));
	}
}
