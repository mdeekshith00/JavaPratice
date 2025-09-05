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
		InvertedHalfPyramid(n);
		DiamondShape(n);
		NumberPyramid(n);
		PascalTriangleNumbers(n);
		HollowDiamond(n);
		HollowRightTriangle(n);
		RightAlignedTriangle(n);
		PyramidNumbers(n);
		RightAlignedTriangle2(n);
		HalfInvertedPyramid(n);
		NumberHourglassPattern(n);
		sc.close();
	}



	private static void RightAngledTriangle(int n) {
		// TODO Auto-generated method stub
		System.out.println("-------RightAngledTriangle-------");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

	private static void RightAlignedStarTriangle(int n) {
		// TODO Auto-generated method stub
		System.out.println("-------RightAlignedStarTriangle-------");
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
		System.out.println("-------InvertedCenteredPyramid-------");
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
		System.out.println("-------PascalTriangle-------");
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
	private static void InvertedHalfPyramid(int n) {
		// TODO Auto-generated method stub
		System.out.println("------InvertedHalfPyramid--------");
		for(int i=n; i>=0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
				
			}
			System.out.println();
		}
	}
	private static void DiamondShape(int n) {
		// TODO Auto-generated method stub
		System.out.println("-------DiamondShape-------");
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i; j++) {
			System.out.print("*");
		}
		for(int j=1;j<=i; j++) {
			if(i!=j)
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=n; i>=1; i--) {
		for(int j=1; j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i; j++) {
			System.out.print("*");
		}
		for(int j=1;j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	}

	private static void NumberPyramid(int n) {
		// TODO Auto-generated method stub
		System.out.println("-------Number Pyramid-------");
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

	private static void PascalTriangleNumbers(int n) {
		// TODO Auto-generated method stub
		System.out.println("-------PascalTriangleNumbers-------");
		for(int i=0; i<n; i++) {
			for(int j=1; j<=n-i-1; j++) {
				System.out.print(" ");
			}
			int sum = 1;
			for(int j=0; j<i; j++) {
				System.out.print(sum + " ");
				sum = sum *(i-j)/(j+1);
			}
			System.out.println();
		}
	}
//	TODO :complete this pattern
	private static void HollowDiamond(int n) {
		// TODO Auto-generated method stub
		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print();
//			}
		}
	}


	private static void HollowRightTriangle(int n) {
		// TODO Auto-generated method stub
		System.out.println("-------HollowRightTriangle-------");
	  for(int i=1; i<=n; i++) {
		  for(int j=1; j<=i; j++) {
			  if(j==1 || i == 5 || i==j) {  
				  System.out.print("*");
			  } else {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	  }
		
	}


	private static void RightAlignedTriangle(int n) {
		// TODO Auto-generated method stub
		System.out.println("-------RightAlignedTriangle-------");
		for(int i=0; i<=n; i++) {
			for(int j=0;j<=n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void PyramidNumbers(int n) {
		// TODO Auto-generated method stub
		System.out.println("-------PyramidNumbers-------");
         for(int i=1; i<=n; i++) {
        	 for(int j=1; j<=n-i;j++) {
        		 System.out.print(" ");
        	 }
        	 for(int j=1; j<=i;j++) {
        		 System.out.print(j);
        	 }
        	 for(int j=i; j>=1; j--) {
        		 if(i!=j)
        		 System.out.print(j);
        	 }
        	 System.out.println();
         }
		
	}
	
	private static void RightAlignedTriangle2(int n) {
		// TODO Auto-generated method stub
		System.out.println("-------RightAlignedTriangle2-------");
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}

	private static void HalfInvertedPyramid(int n) {
		// TODO Auto-generated method stub
		System.out.println("-------HalfInvertedPyramid-------");
		    for (int i = 0; i < n; i++) {
		        // Print spaces
		        for (int j = 0; j < i; j++) {
		            System.out.print(" ");
		        }
		        // Print stars
		        for (int j = 0; j < 2 * (n - i) - 1; j++) {
		            System.out.print("*");
		        }
		        System.out.println();
		    }
	}
	private static void NumberHourglassPattern(int n) {
		// TODO Auto-generated method stub
		System.out.println("-------Number-Hourglass-Pattern-------");
	      for(int i=0; i<n; i++) {
		     for(int j=1; j<=n-i;j++) {
		    	 System.out.print(j);
		     }
		     for(int j=1;j<2*i;j++) {
		    	 System.out.print(" ");
		     }
		     for(int j=n-i; j>=1;j--) {
		   
		    	 System.out.print(j);
		     }
		     System.out.println();
	      }
	      for(int i=n-2; i>=0; i--) {
			     for(int j=1; j<=n-i;j++) {
			    	 System.out.print(j);
			     }
			     for(int j=1;j<2*i;j++) {
			    	 System.out.print(" ");
			     }
			     for(int j=n-i; j>=1;j--) {
			   
			    	 System.out.print(j);
			     }
			     System.out.println();
		      }
		
	}



}


