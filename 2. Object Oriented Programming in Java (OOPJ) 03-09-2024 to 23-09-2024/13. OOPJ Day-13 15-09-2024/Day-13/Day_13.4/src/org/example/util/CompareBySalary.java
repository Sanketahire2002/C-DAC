package org.example.util;

import java.util.Comparator;

import org.example.domain.Employee;

public class CompareBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return (int) (e1.getSalary() - e2.getSalary());
	}
	
}
