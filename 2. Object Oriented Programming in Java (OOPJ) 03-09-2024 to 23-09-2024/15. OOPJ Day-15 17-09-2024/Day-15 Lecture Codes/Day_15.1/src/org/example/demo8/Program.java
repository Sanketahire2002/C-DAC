package org.example.demo8;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Program { 
	//void accept(T t)
	public static void print( Consumer< String> c, String str ) {
		c.accept(str);
	}
	
	public static void main(String[] args) {
		Program.print(str -> System.out.println( str ), "Hello1");
	}
	public static void main1(String[] args) {
		//Consumer<String> c1 =  str -> System.out.println( str );
		//c1.accept("Good Morning!!");
	}
	
}
