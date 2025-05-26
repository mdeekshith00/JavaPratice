package FunctionalProgramming;

import java.util.List;

public class Fun1 {
	public static void main(String[] args) {
		
		
		List<Integer> numbers = List.of(10,54,64,76,43,10, 54,93,26,73);
		fun1(numbers);
		
		
	}
	
	public static void fun1(List numbers) {
//	      numbers.stream()
//	      .filter(n -> n%2 == 0)
//	      .map(n -> n *n)
//	      .collect(Collectors.toList())
//	      .forEach(System.out::println);
		
		numbers.stream()
		.distinct()
		.sorted()
		.skip(2)
		.limit(100)
		.forEach(n -> System.out.println(n));
		
	
		
	 
	}	



	
	
	
	
	

	

}
