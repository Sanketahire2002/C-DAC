package org.example.demo6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		InterruptedException ex1 = new InterruptedException();
		Exception ex2 = new InterruptedException();
	}
	public static void main1(String[] args) {
		Scanner sc = null;
		try {
			System.out.println("File Open()");
			sc = new Scanner(System.in);

			System.out.print("Num1	:	");
			int num1 = sc.nextInt();

			System.out.print("Num2	:	");
			int num2 = sc.nextInt();

			if (num2 == 0)
				throw new InterruptedException();
				//throw new ArithmeticException("Value of denominator should not be zero");
			int result = num1 / num2;
			System.out.println("Result	:	" + result);
		}catch (InterruptedException ex) {
			ex.printStackTrace();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
		finally {
			sc.close();
			System.out.println("File Close()");
		}

	}
}
