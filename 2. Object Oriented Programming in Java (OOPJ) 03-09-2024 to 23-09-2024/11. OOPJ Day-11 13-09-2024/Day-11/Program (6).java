package org.example.demo5;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try {
			try( Scanner sc = new Scanner(System.in)){
				System.out.print("Num1	:	");
				int num1 = sc.nextInt();
				
				System.out.print("Num2	:	");
				int num2 = sc.nextInt();
				
				int result = num1 / num2;
				System.out.println("Result	:	"+result);
			}catch( NullPointerException ex ) {
				ex.printStackTrace();
			}
			
		}catch( NumberFormatException ex ) {
			ex.printStackTrace();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
