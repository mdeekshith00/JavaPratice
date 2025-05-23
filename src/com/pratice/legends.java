package com.pratice;

import java.util.ArrayList;
import java.util.Collections;

public class legends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {16,17,4,3,5,2};
		System.out.println(leaders(arr));
		
	}
	public static ArrayList<Integer> leaders(int arr[]) {
		int n = arr.length;
		ArrayList<Integer> list = new ArrayList<>();
		int max = arr[n-1];
		
		for(int i=n-1; i>=0; i--) {
			if(arr[i] >= max) {
				max=arr[i];
				list.add(max);
			}
		}
		Collections.reverse(list);
		return list;
	}

}
