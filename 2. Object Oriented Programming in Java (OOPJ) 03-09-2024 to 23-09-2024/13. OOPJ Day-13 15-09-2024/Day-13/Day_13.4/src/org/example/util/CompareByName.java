package org.example.util;

import java.util.Comparator;

import org.example.domain.Employee;

public class CompareByName implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
	
}
