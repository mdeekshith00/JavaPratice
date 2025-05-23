package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Fun1 {
	public static void main(String[] args) {
		List<String> list = List.of("DEEKSHITH","ANU","CHINTU","SWEETY","SAI");
		list.stream().forEach(System.out::println);
		System.out.println();
		list.stream().filter(x ->x.equals("ANU")).map(x -> x.concat(" CHINTU")).forEach(System.out::println);
		System.out.println("printALLSquareNUmber : ");
		printALLSquareNUmber(List.of(12,43,65,76,89,4,22,54,67,89,43,11));
		
	}

	private static void printALLSquareNUmber(List<Integer> numbers) {
		Predicate<? super Integer> predicate = x->x%2 == 0;
		 numbers.stream()
		 .filter(predicate)
		 .map(x->x*x*2)
		 .forEach(System.out::println);
		
	}
	
	

	

}
