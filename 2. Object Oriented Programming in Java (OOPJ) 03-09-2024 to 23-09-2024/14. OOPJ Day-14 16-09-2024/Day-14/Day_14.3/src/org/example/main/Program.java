package org.example.main;

import org.example.domain.Employee;

public class Program {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Sandeep", 33, 45000.50f, 1, 9, 2021);
		Employee emp2 = emp1.clone();
		
		emp2.getJoinDate().setDay(1);
		emp2.getJoinDate().setMonth(1);
		emp2.getJoinDate().setYear(2007);
		
		System.out.println( emp1.toString());
		System.out.println( emp2.toString());
	}
	public static void main2(String[] args) {
		Employee emp1 = new Employee("Sandeep", 33, 45000.50f, 1, 9, 2021);
		Employee emp2 = emp1.clone();
		if( emp1 == emp2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
	public static void main1(String[] args) {
		Employee emp1 = new Employee("Sandeep", 33, 45000.50f, 1, 9, 2021);
		Employee emp2 = emp1;	//Shallow Copy of reference
	}
}
