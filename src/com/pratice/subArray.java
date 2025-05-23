package com.pratice;

import java.util.HashMap;

public class subArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 5, 2, 7, 1, -10};
		int k = 15;
		System.out.println(longetSubArray(arr,k));

	}
	public static int longetSubArray(int []arr, int k) {
		HashMap<Integer,Integer> map = new HashMap<>();
		
		int sum =0 , maxLen = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			if(sum == k) {
				maxLen = i+1;
			}
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
			if(map.containsKey(sum-k)) {
				maxLen = Math.max(maxLen, i-map.get(sum-k));
			}
		}
		return maxLen;
		
	}

}
