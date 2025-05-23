package com.pratice;

import java.util.Arrays;

public class LargSmal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {210,23,455,65,98,65,3,155};
		int n = arr.length;
		isLargest(arr,n);
		System.out.println("--");
		isSecond(arr,n);
	
	

	}
	// Find the largest and smallest elements in an array.
	public static void isLargest(int arr[], int n) {
		
		int big = arr[0];
		int small = arr[0];
		
		for(int i=1; i<n; i++) {
			if(big<arr[i]) {
				big = arr[i];
			} else if(small > arr[i]) {
				small = arr[i];
			} 
		}
		System.out.println(big);
		System.out.println(small);
	}
	// Find the second largest element in an array.
	public static void isSecond(int arr[], int n) {
		int secondLargest = Integer.MIN_VALUE;
		int largest = Integer.MIN_VALUE;
		
		System.out.println(secondLargest);
		
		for(int num : arr) {
			if(num>largest) {
				secondLargest = largest;
				largest = num;
			}
		}
	}

}

