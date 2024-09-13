package org.example.demo6;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try ( Scanner sc = new Scanner(System.in)){
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();
			
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
			
			try{
				
			}catch( ArithmeticException ex ) {
				ex.printStackTrace();
			}
			
		}catch( ArithmeticException ex ) {
			ex.printStackTrace();
		}
	}
}
