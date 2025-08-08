package Patterns;

import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number n:");
		int n = sc.nextInt();
		
		RightAngledTriangle(n);
		RightAlignedStarTriangle(n);
		InvertedCenteredPyramid(n);
		PascalTriangle(n);
		
		sc.close();
	}



	private static void RightAngledTriangle(int n) {
		// TODO Auto-generated method stub
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

	private static void RightAlignedStarTriangle(int n) {
		// TODO Auto-generated method stub
		for(int i=1; i<=n; i++) {
			for(int k= 1; k<=n-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}
//	 TODO pratice this onr again 
	private static void InvertedCenteredPyramid(int n) {
		// TODO Auto-generated method stub
		for(int i=n; i<=1; i--) {
				for(int j=1; j<=n-i; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=n; j--) {
					System.out.print("*");
				}
			System.out.println();	
		}
		
	}


	private static void PascalTriangle(int n) {
		// TODO Auto-generated method stub
		for(int i=0; i<n; i++) {
			for(int space =0; space <= n-i-1; space++) {
				System.out.print(" ");
			}
			int num = 1;
			for(int j=0; j<=i; j++) {
				System.out.print(num + " ");
				num = num *(i-j)/(j+1);
			}
			System.out.println();
			
		}
		
	}
	

}


