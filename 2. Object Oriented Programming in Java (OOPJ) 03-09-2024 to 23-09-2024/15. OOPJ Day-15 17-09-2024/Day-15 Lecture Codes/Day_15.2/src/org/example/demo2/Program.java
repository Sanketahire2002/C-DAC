package org.example.demo2;

import java.util.function.BiFunction;

public class Program {
	public static void main(String[] args) {
		//R apply(T t, U u)
		BiFunction<Integer, Integer, Integer> function = Integer::sum;
		int result = function.apply(10, 20);
		System.out.println("Result	:	"+result);
	}
	
	public static void main1(String[] args) {
		//R apply(T t, U u)
		BiFunction<Integer, Integer, Integer> function = (Integer num1, Integer num2  ) -> num1 + num2;
		int result = function.apply(10, 20);
		System.out.println("Result	:	"+result);
	}
}
