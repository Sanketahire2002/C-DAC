package org.example.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import org.example.domain.Employee;
import org.example.util.CompareByEmpid;
import org.example.util.CompareByName;
import org.example.util.CompareBySalary;

public class Program {
	private static Scanner sc = new Scanner(System.in);
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
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Compare By Name");
		System.out.println("2.Compare By Empid");
		System.out.println("3.Compare By Salary");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void releaseResource( ) {
		sc.close();
	}
	public static void main(String[] args) {
		int choice;
		Employee[] arr = Program.getArray( );
		while( ( choice = Program.menuList( ) ) != 0 ) {
			Comparator<Employee> comparator = null;
			switch( choice ) {
			case 1:
				comparator = new CompareByName();	//Upcasting
				break;
			case 2:
				comparator = new CompareByEmpid();	//Upcasting
				break;
			case 3:
				comparator = new CompareBySalary();	//Upcasting
				break;
			}
			
			Arrays.sort(arr, comparator);
			Program.printRecord(arr);
		}
	}
}
