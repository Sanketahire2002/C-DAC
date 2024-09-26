package org.example.demo4;

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
	String getDetail( Employee emp );
}

public class Program {
	public static void main(String[] args) {
		//String getDetail( Employee emp );
		
		//Sample s = ( Employee emp ) -> emp.getName();
		//Sample s = ( emp ) -> emp.getName();
		//Sample s =  emp  -> emp.getName();
		Sample s =  Employee::getName;
		
		Employee emp = new Employee("Sandeep", 33, 45000.50f );
		String name = s.getDetail(emp);
		System.out.println("Name	:	"+name);
	}
}
