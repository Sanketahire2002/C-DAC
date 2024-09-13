package org.example.main;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = null;
		sc = new Scanner(System.in);
		System.out.print("Enter number	:	");
		int number = sc.nextInt();
		System.out.println("Number	:	"+number);
	}
}
