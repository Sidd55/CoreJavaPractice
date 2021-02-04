package com.Learning.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamOperation {

	public static void main(String[] args) {
		
		
		
		Random random = new Random();
		
		//random.ints().limit(10).sorted().forEach(System.out::println);
		
		List<Integer> integers = Arrays.asList(1, 4, 3);
		Integer reduced = integers.stream().reduce(23, (a, b) -> a + b);
		
		//System.out.println(reduced);
		
		// create a list of integers 
	    List<Integer> number = Arrays.asList(2,3,4,5,7); 
	  
	    // demonstration of map method 
	    List<Integer> square = number.stream().map(x -> x*x).filter(x-> x>16). 
	                           collect(Collectors.toList()); 
	    System.out.println(square); 
	    
	    List<String> names = 
                Arrays.asList("Reflection","Collection","Stream"); 
  
    // demonstration of filter method 
	    List<String> result = names.stream().filter(s->s.startsWith("R")). 
                          collect(Collectors.toList()); 
	  System.out.println(result); 
  
    // demonstration of sorted method 
	    List<String> show = 
            names.stream().sorted().collect(Collectors.toList()); 
	    //System.out.println(show); 
	    

	}

}
