package org.example.main;

import org.example.employee.Employee;

public class Program {
	public static void main(String[] args) {
		//Sandeep, 40, 33, 45000.50
		Employee emp = new Employee( "Sandeep", 40, 33, 45000.50f );
		
		emp.printRecord();
	}
}
