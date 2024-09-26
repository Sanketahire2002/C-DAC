package org.example.demo5;

class Employee{
	private String name;
	private int empid;
	private float salary;
	
	public Employee() {
	}

	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getEmpid() {
		return empid;
	}

	public float getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
	
}

interface Sample{
	Employee get( String name, int empid, float salary );
}

public class Program {
	public static void main5(String[] args) {
		Sample s = Employee::new ;	//Constructor reference 
		
		Employee emp = s.get("Sandeep", 33, 45000.50f );
		System.out.println( emp.toString());
		
	}
	
	public static void main4(String[] args) {
		Sample s = ( name, empid, salary )-> new Employee(name, empid, salary); 
		
		Employee emp = s.get("Sandeep", 33, 45000.50f );
		System.out.println( emp.toString());
		
	}
	
	public static void main3(String[] args) {
		Sample s = ( String name, int empid, float salary )-> new Employee(name, empid, salary); 
		
		Employee emp = s.get("Sandeep", 33, 45000.50f );
		System.out.println( emp.toString());
		
	}
	
	public static void main2(String[] args) {
		Sample s = ( String name, int empid, float salary )->{
			return new Employee(name, empid, salary);
		};
		
		Employee emp = s.get("Sandeep", 33, 45000.50f );
		System.out.println( emp.toString());
		
	}
	
	public static void main1(String[] args) {
		Sample s = ( String name, int empid, float salary )->{
			Employee emp = new Employee(name, empid, salary);
			return emp;
		};
		
		Employee emp = s.get("Sandeep", 33, 45000.50f );
		System.out.println( emp.toString());
		
	}
}
