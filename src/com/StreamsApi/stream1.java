package com.StreamsApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names  = Arrays.asList("Deekshith","ANU","CHINTU","SWEETY","SAI","TILLU");
		List<String> na = names.stream().filter(x->!((String)x).isEmpty()).collect(Collectors.toList());
		na.forEach(System.out::println);
		
		List<Integer> i = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> list = i.stream().map(x->x*x).distinct().sorted().limit(5).collect(Collectors.toList());
		list.forEach(System.out::println);
		long count = names.parallelStream().filter(x->((String)x).isEmpty()).count();
		System.out.println(count);
		
		long count1 = getCountEmptyStringUsingJava7(names);
		System.out.println(count1);
		
		
		
		
		
	    
	    
	    
	}

	private static long getCountEmptyStringUsingJava7(List<String> names) {
		// TODO Auto-generated method stub
		long count =0;
		for(String string :names) {
			if(string.isEmpty()) {
				count++;
			}
		}
		return count;
	}

}
