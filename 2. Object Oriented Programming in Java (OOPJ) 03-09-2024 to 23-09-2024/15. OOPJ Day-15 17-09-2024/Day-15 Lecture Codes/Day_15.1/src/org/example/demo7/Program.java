package org.example.demo7;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Program { 
	public static void main(String[] args) {
		//R apply(T t)
		
		
		//Function<String, Integer> function = (String str)-> str.length();
		//Function<String, Integer> function = (str)-> str.length();
		Function<String, Integer> function = str-> str.length();
				
		Integer length =  function.apply("Sandeep");
		
		System.out.println("Length	:	"+length);
	}
	
	public static void main3(String[] args) {
		//T get()

		Supplier<Integer> s = ( )-> new Random().nextInt();
		
		int number =  s.get();
		System.out.println("Number	:	"+number);
	}
	
	public static void main2(String[] args) {
		//void accept(T t)
		
		//Consumer<String> c = (String str) -> System.out.println( str );
		//Consumer<String> c = ( str) -> System.out.println( str );
		Consumer<String> c =  str -> System.out.println( str );
		
		c.accept("Good Morning!!");
	}
	
	public static void main1(String[] args) {
		//boolean test(T t)

		//Predicate<Integer> p = (Integer number ) -> number % 2 == 0 ;
		//Predicate<Integer> p = (number ) -> number % 2 == 0 ;
		Predicate<Integer> p = number -> number % 2 == 0 ;
		
		int number = 10;
		boolean result = p.test( number );
		System.out.println( result);
	}
}
