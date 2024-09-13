package org.example.demo1;

class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class Employee extends Person{
	
}
public class Program {
	public static void main(String[] args) {

		Person p = new Person();
		p.setName("Sandeep");
		p.setAge(40);
		
		Employee emp = new Employee();
		emp.setName("Mahesh");
		emp.setAge(34);
		
		System.out.println( p.getName()+"	"+p.getAge());
		System.out.println( emp.getName()+"	"+emp.getAge());
		
	}
}
