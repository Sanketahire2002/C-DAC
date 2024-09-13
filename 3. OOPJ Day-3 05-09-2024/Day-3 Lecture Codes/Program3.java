package org.example;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		//java.util.Scanner sc = new java.util.Scanner( System.in );
		Scanner sc = new Scanner( System.in );
		
		System.out.print("Name	:	");
		String name = sc.nextLine();
		System.out.print("Empid	:	");
		int empid = sc.nextInt();
		System.out.print("Salary	:	");
		float salary = sc.nextFloat();
		
		System.out.println(name+"	"+empid+"	"+salary);
		
		sc.close();
 	}
}