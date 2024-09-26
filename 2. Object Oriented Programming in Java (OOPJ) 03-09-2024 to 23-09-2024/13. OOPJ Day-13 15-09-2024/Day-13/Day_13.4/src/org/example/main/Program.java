package org.example.main;

import java.util.Arrays;
import java.util.Comparator;

import org.example.domain.Employee;
import org.example.util.CompareByEmpid;
import org.example.util.CompareByName;
import org.example.util.CompareBySalary;

public class Program {
	private static Employee[] getArray() {
		Employee[] arr = new Employee[ 5 ];
		arr[ 0 ] = new Employee("Umesh",15, 75000.50f);
		arr[ 1 ] = new Employee("Amit",13, 70000.50f);
		arr[ 2 ] = new Employee("Shivprasad",12, 65000.50f);
		arr[ 3 ] = new Employee("Mahesh",11, 60000.50f);
		arr[ 4 ] = new Employee("Chetan",14, 55000.50f);
		return arr;
	}
	
	private static void printRecord(Employee[] arr) {
		for( Employee emp : arr )
			System.out.println( emp.toString());
		System.out.println();
	}
	
	public static void main(String[] args) {
		Employee[] arr = Program.getArray( );
		
		Program.printRecord( arr );
		
		Comparator<Employee> comparator = new CompareByName();	//Upcasting
		Arrays.sort(arr, comparator);
		
		comparator = new CompareByEmpid();	//Upcasting
		Arrays.sort(arr, comparator);
		
		comparator = new CompareBySalary();	//Upcasting
		Arrays.sort(arr, comparator);
		
		comparator = null;	//Upcasting
		Arrays.sort(arr, comparator);
		
		Program.printRecord( arr );
	}
}
