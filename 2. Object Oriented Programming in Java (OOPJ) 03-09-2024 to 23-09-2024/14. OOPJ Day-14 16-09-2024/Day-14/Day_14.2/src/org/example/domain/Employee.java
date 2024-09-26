package org.example.domain;

public class Employee {
	private String name;
	private int empid;
	private float salary;
	private Date joinDate = new Date( );
	public Employee() {
	}
	public Employee(String name, int empid, float salary, int day, int month, int year ) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		this.joinDate.setDay(day);
		this.joinDate.setMonth(month);
		this.joinDate.setYear(year);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	@Override
	public String toString() {
		return this.name+" "+this.empid+" "+this.salary+" "+this.joinDate;
	}
}
