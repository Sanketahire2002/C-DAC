package org.example.demo2;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = null;
		
		System.out.println("File Open()");
		sc = new Scanner(System.in);
		
		System.out.print("Num1	:	");
		int num1 = sc.nextInt();
		
		System.out.print("Num2	:	");
		int num2 = sc.nextInt();
		
		try {
			System.out.println("Inside try block");
			if( num2 == 0 )
				throw new ArithmeticException("Value of denominator should not be zero");
			int result = num1 / num2;
			System.out.println("Result	:	"+result);				
		}catch( ArithmeticException ex ) {
			System.out.println("Inside catch block");
			//Logger: Logback, Log4j, java.util.Logging
			//System.out.println( ex.getMessage());
			ex.printStackTrace();
		}finally {
			System.out.println("Inside finally block");
			sc.close();
			System.out.println("File Close()");	
		}
			
	}
}
