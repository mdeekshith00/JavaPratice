package com.pratice;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,4,56,32,8,3,12};
		System.out.println(SecondLargest(arr));
	}
	
	public static int SecondLargest(int arr[]) {
		int n = arr.length;
		int first =Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		if(n < 2) {
			return -1;
		}
			for(int i=0; i<n; i++) {
				if(arr[i]>first) {
					second = first;
					first = arr[i];
				} else if(arr[i] == second && arr[i] != first) {
					second = arr[i];
				}
			}
			if(second == Integer.MIN_VALUE) {
				return -1;
			}
		
		return second;
	}

}
