package FunctionalProgramming;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Fun2 {
	public static void main(String[] args) {
		List<Integer> list = List.of(12,34,56,7,89,02,13,2,54,6,5,100,76,9,8,5);
		 int count = 0;
		List<Integer> optional = list.stream()
		.filter(x->x%2 ==0)
		.map(x -> x*1)
		.collect(Collectors.toList());
//		.forEach(System.out::println);
		System.out.println(optional);
		
		System.out.println(list);
		
		list.stream()
				 .filter(x -> x%2 ==1)
				 .forEach(System.out::println);;
//		 .map(x -> x+x)
		 
		
//	     count = count + ;
	     
	}

}
