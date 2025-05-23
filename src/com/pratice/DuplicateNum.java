package com.pratice;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,1,2,3,2};
		System.out.println(findDuplicate(arr));

	}
	public static List<Integer> findDuplicate(int arr[]) {
		int n = arr.length;
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j] && !list.contains(arr[i])) {
					list.add(arr[i]);
					 break;
				}
			}
		} 
		int n1 = list.size();
		if(n1>1) {
			return list;
		}
		return list;
	}

}
