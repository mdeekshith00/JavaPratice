package Patterns;

import java.util.Scanner;

public class AllPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =8;
		int m = 9;
		System.out.println("----------rec-----------");
		rec(n,m);
		System.out.println("----------hallowRec-----------");
		hallowRec(n,m);
		System.out.println("----------triangle-----------");
		triangle(n,m);
		System.out.println("-----------revTrian----------");
		revTrian(n,m);
		System.out.println("----------revTrian1-----------");
		revTrian1(n,m);
		System.out.println("----------numbers-----------");
		numbers(n,m);
		System.out.println("-----------revNum----------");
		revNum(n);
		System.out.println("----------floyd-----------");
		 floyd(n,m);
		System.out.println("----------ZeroOneTrian-----------");
		ZeroOneTrian(n,m);
		System.out.println("----------rightAngledTriangle-----------");
		rightAngledTriangle(n);
		System.out.println("----------PalindromeTriangle-----------");
		PalindromeTriangle(n);
		System.out.println("----------Diamond-----------");
		Diamond(n);
		System.out.println("----------Butterfly-----------");
		Butterfly(n);
		System.out.println("----------Rhombus-----------");
		rhombus(n);
		System.out.println("----------hollowTriangle-----------");
		hollowTriangle(n);
		System.out.println("----------mirrorImageTriangle-----------");
		mirrorImageTriangle(n);
		System.out.println("----------hollowDiamondPyramid-----------");
		hollowDiamondPyramid(n);

	}
	
	// printing rectangle pattern 
		public static void rec(int n , int m ) {
			
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	} 
		// printing hallow rectangle pattern
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
		// printing triangle  pattern
		public static void triangle(int n , int m) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*  ");
				}
				System.out.println();
			}
		}
		// printing reverse triangle  pattern
		public static void revTrian(int n , int m) {
			for(int i=1; i<=n; i++) {
				for(int j=m; j>i; j--) {
					System.out.print("* ");
				} 
				System.out.println();
			}
		}
		// printing reverse traingle  pattern
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
		// printing traingle numbers pattern
		public static void numbers(int n, int m) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}
		// printing reverse traingle numbers pattern
		public static void revNum(int n) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=(n-i+1); j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}
		
		// printing traingle numbers pattern
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
		// printing traingle  0 and 1 s pattern
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
//	  right-angled triangle with numbers in increasing row order, aligned to the right.
		public static void  rightAngledTriangle(int n ) {
		
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=(n-i); j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++) {
					System.out.print(i + " ");
					
				}
				System.out.println();
			}
		}
//		 Palindrome Triangle Pattern
		public static void PalindromeTriangle(int n) {
			for(int i=1; i<=n; i++) {
				
//				for(int j=1; j<(n-i); j++) {
//					System.out.print(" ");
//				}
				 for (int j = 1; j <= 2 * (n - i); j++) {
		                System.out.print(" ");
		            }

				for(int j=i; j>=1; j--) {
					System.out.print(j + " ");
				}
				for(int j=1+1; j<=i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
				
			}
		}
// Diamond Star Pattern
		public static void Diamond(int n) {
			
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=(n-i); j++) {
					System.out.print(" ");
				}
				for(int j=1; j<i; j++) {
					System.out.print("*");
				}
				for(int j=2; j<i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=n; i>=1; i--) {
				for(int j=(n-i); j>=1; j--) {
					System.out.print(" ");
				}
				for(int j=1; j<i; j++) {
					System.out.print("*");
				}
				for(int j=2; j<i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
		}
		
//		Butterfly Star Pattern
		public static void Butterfly(int n) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				for(int j=1; j<=(n-i)*2; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=n; i>=1; i--) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				for(int j=1; j<=(n-i) *2 ; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
//		Rhombus Pattern
		public static void rhombus(int n) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j <n-i; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=n; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
//		Hollow Triangle Pattern
		public static void hollowTriangle(int n) {
			for(int i=1; i<=n; i++) {
				for(int j=i; j<n; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=(2 *i -1); j++) {
					if(j ==1  || i ==n || j == (2 * i -1)) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
//		Mirror Image Triangle Pattern
		public static void mirrorImageTriangle(int n ) {
			// upper part 
			for(int i=1; i<=n; i++) {
				 
				for(int j=1; j<i; j++) {
					System.out.print(" ");
				}
				for(int j=i; j<=n; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			// lower part printing 
			for(int i=n; i>=1; i--) {
				for(int j=1; j<i; j++) {
					System.out.print(" ");
				}
				for(int j=i; j<=n; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}	
//		Hollow Diamond Pyramid
		public static void hollowDiamondPyramid(int n ) {
	        for (int i = 1; i <= n; i++) {
	           
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	          
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                if (j == 1 || j == 2*i-1)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	        for (int i = n; i >= 1; i--) {
	            
	      
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            
	            
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                if (j == 1 || j == 2*i-1)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        
		}
		}

}
