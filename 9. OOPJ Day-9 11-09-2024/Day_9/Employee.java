package org.example.employee;

import org.example.person.Person;

public class Employee extends Person{
	private int empid;
	private float salary;
	public Employee(String name, int age, int empid, float salary) {
		super( name, age);	//Super Statement
		this.empid = empid;
		this.salary = salary;
	}
	
	@Override	//Annotation
	public void printRecord( ) {
		super.printRecord();
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
