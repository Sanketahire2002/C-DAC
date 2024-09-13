package org.example.demo1;

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
			if( num2 == 0 ) {
				ArithmeticException ex = new ArithmeticException("Value of denominator should not be zero");
				throw ex;
			}else {
				int result = num1 / num2;
				System.out.println("Result	:	"+result);	
			}
		}catch( ArithmeticException ex ) {
			//Logger: Logback, Log4j, java.util.Logging
			//System.out.println( ex.getMessage());
			ex.printStackTrace();
		}
		sc.close();
		System.out.println("File Close()");		
	}
}
