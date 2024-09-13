package org.example;

import java.util.Calendar;
import java.util.Scanner;

class Employee{
	 private String name;	//Non static field( also called as instance variable) 
	 private int empid;		//Non static field( also called as instance variable)
	 private float salary;	//Non static field( also called as instance variable)
	 
	 public void acceptRecord( /*Employee this*/ ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name	:	");
		//name = sc.nextLine();
		this.name = sc.nextLine();
		System.out.print("Empid	:	");
		//empid = sc.nextInt();
		this.empid = sc.nextInt();
		System.out.print("Salary	:	");
		//salary = sc.nextFloat();
		this.salary = sc.nextFloat();
	 }
	 
	 public void setRecord( String name, int empid, float salary ) {
		 this.name = name;
		 this.empid = empid;
		 this.salary = salary;
	 }
	 
	 public void printRecord( /*Employee this*/) {
		//System.out.println("Name	:	"+name);
		System.out.println("Name	:	"+this.name);
		//System.out.println("Empid	:	"+empid);
		System.out.println("Empid	:	"+this.empid);
		//System.out.println("Salary	:	"+salary);
		System.out.println("Salary	:	"+this.salary);
	 }
}

public class Program {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setRecord( "Sandeep", 33, 45000.50f );	//emp1.setRecord( emp1, "Sandeep", 33, 45000.50f );
		emp1.printRecord();
	}
	public static void main3(String[] args) {
		Employee emp1 = new Employee();
		
		//Employee emp2 = new Employee();
		
		emp1.acceptRecord( );	//emp1.acceptRecord( emp1 );	
		//emp2.acceptRecord();	//emp2.acceptRecord( emp2 );
		
		emp1.printRecord( );	//emp1.printRecord( emp1 );	
		//emp2.printRecord();		//emp2.printRecord( emp2 );
		
	}
	public static void main2(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.acceptRecord( );	//Message passing
		//acceptRecord method is called on emp1;
		
		emp1.printRecord( );	//Message passing
		//printRecord method is called on emp1;
		
	}
	public static void main1(String[] args) {
		Employee emp1;
		emp1 = new Employee( );	//OK
		
		Employee emp2 = new Employee( );	//OK
		
	}
}