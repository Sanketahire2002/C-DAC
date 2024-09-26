package org.example.demo1;

import java.util.Date;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("Enter F.Q.Class Name	:	");
			String className = sc.nextLine();	//java.util.Stack
			Class<?> c = Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main2(String[] args) {
		Class<?> c1 =  Number.class;
		
		Class<?> c2 = AutoCloseable.class;
		
		Class<?> c3 = Date.class;
	}
	
	public static void main1(String[] args) {
		//java.util.Date is a concrete class
		Date date = new Date();	//Instantiation of class Date
		
		Class<?> c = date.getClass();
	}
}
