package com.pratice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargSmall();
		System.out.println("---------");
		Reversed();
		System.out.println("---------");
		Soreted();
		System.out.println("---------");
		Duplicates();
		RotateArray();
	}
	 public static void LargSmall() {
		 int arr[] = {100,29,33,41,67,81};
			int n = arr.length;
		// to find the largest and smallest element in array 
		 Arrays.sort(arr);
			System.out.println("largest Element: " + arr[n-1]);
			System.out.println("Smallest element " + arr[0]);
			
			int largest = arr[0];
			int  smallest = arr[0];
			
			for(int i=0; i<n; i++) {
				if(arr[i]>largest) 
					largest = arr[i];
				if(arr[i]<smallest)
					smallest = arr[i];
			}
			System.out.println(largest);
			System.out.println(smallest);
	 }
	 
	 public static void Reversed() {
		 int arr[] = {54,21,56,88,12,33,11};
		  int start = 0;
		  int end = arr.length-1;
		  
		  while(start < end) {
			  int temp = arr[0];
			  arr[start] = arr[end];
			  arr[end] = temp;
			  start++;
			  end--;
		  }
		  for(int i : arr)
		  System.out.println(i);
	 }
	 public static void Soreted() {
		 int arr[] = {54,21,56,88,12,33,11};
		 boolean isSorted = true;
		 for(int i=1; i<arr.length;i++) {
			 if(arr[i]<arr[i-1]) 
				 isSorted = false;
			 break;
		 }
		 System.out.println(" Sorted:");
	 }
	 public static void Duplicates() {
		 int arr[] = {54,21,56,88,12,33,11};
		 HashSet<Integer> map = new HashSet<>();
		 
		 for(int i : arr) {
			 if(!map.add(i)) 
				 System.out.println(i + " ");
		 }
	 }
	 public static void RotateArray() {
		 int arr[] = {10,20,30,40,50,60};
		 int k=2;
		 int start = arr[0];
		 int n = arr.length-1;
		 
		
	 }

}
