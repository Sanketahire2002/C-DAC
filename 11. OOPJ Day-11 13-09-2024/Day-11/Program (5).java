package org.example.demo2;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {		
		try( Scanner sc = new Scanner(System.in); ){
			System.out.print("Enter number	:	");
			int number = sc.nextInt();
			System.out.println("Number	:	"+number);
		}finally {
			//TODO
		}
	}
	public static void main2(String[] args) {		
		try( Scanner sc = new Scanner(System.in); ){
			System.out.print("Enter number	:	");
			int number = sc.nextInt();
			System.out.println("Number	:	"+number);
		}
	}
	public static void main1(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.print("Enter number	:	");
			int number = sc.nextInt();
			System.out.println("Number	:	"+number);
		}finally {
			sc.close();
		}
	}
}
