package Patterns;

import java.util.Scanner;

public class AllPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =8;
		int m = 9;
		
		rec(n,m);
		System.out.println("---------------------");
		hallowRec(n,m);
		System.out.println("---------------------");
		triangle(n,m);
		System.out.println("---------------------");
		revTrian(n,m);
		System.out.println("---------------------");
		revTrian1(n,m);
		System.out.println("---------------------");
		numbers(n,m);
		System.out.println("---------------------");
		revNum(n);
		System.out.println("---------------------");
		 floyd(n,m);
		System.out.println("---------------------");
		ZeroOneTrian(n,m);
		System.out.println("---------------------");
	}
		public static void rec(int n , int m ) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	} 
		public static void hallowRec(int n , int m) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=m; j++) {
					if(i == 1 || j == 1 || i == n || j == m) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				} 
				System.out.println();
			}
		}
		public static void triangle(int n , int m) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*  ");
				}
				System.out.println();
			}
		}
		public static void revTrian(int n , int m) {
			for(int i=1; i<=n; i++) {
				for(int j=m; j>i; j--) {
					System.out.print("* ");
				} 
				System.out.println();
			}
		}
		public static void revTrian1(int n , int m) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n-i; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
 			}
		}
		public static void numbers(int n, int m) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		public static void revNum(int n) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=(n-i+1); j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}
		public static void floyd(int n, int m) {
			int count = 1;
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print(count + " ");
				    count++;
				}
				System.out.println();
			}
		}
		public static void ZeroOneTrian(int n, int m) {
			for(int i=1; i<=n; i++) {
				 for(int j=1; j<=i; j++) {
					 int sum = i+j;
					 if(sum % 2 == 0) {
						 System.out.print("1" + " ");
					 } else {
						 System.out.print("0" + " ");
					 }
				 }
				 System.out.println();
			}
		}

}
