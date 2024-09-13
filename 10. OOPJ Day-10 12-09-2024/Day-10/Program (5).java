package org.example.demo3;

import java.util.InputMismatchException;
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
			if( num2 == 0 )
				throw new ArithmeticException("Value of denominator should not be zero");
			int result = num1 / num2;
			System.out.println("Result	:	"+result);				
		}catch( ArithmeticException ex ) {
			ex.printStackTrace();
		}catch( InputMismatchException ex ){
			ex.printStackTrace();
		}
		finally {
			sc.close();
			System.out.println("File Close()");	
		}
			
	}
}
