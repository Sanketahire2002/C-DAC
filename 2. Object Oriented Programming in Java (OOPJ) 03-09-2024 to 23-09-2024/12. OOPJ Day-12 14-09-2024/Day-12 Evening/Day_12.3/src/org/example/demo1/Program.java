package org.example.demo1;

public class Program {
	public static void main(String[] args) {
		Integer i = new Integer( 10);
		
		int number = i;	//Auto-UnBoxing
		//int number = i.intValue();
		System.out.println("Number	:	"+number);
	}
	public static void main2(String[] args) {
		int number = 10;
		
		Object object = number;
		//First number gets converted into Integer object : Integer.valueOf( number)
		//Then reference of Integer instance will be copied into object.
		
		System.out.println( object );
	}
	public static void main1(String[] args) {
		int number = 10;
		Integer integer = Integer.valueOf(number);	//Boxing
		
		Object object = integer;	//Upcasting
	}
}
