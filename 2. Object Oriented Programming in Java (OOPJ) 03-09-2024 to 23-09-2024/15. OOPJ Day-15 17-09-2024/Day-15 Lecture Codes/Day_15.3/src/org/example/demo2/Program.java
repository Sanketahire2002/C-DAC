package org.example.demo2;

public class Program {
	public static void main(String[] args) {
		Class<?> c = Thread.class;
		String name = c.getName();
		System.out.println("Name	:	"+name);
		
		Class<?>[] arr = c.getInterfaces();
		String str = "";
		for (Class<?> c1 : arr) {
			str = str.concat(c1.getName()+",");
		}
		System.out.println("Interface	:	"+str);
	}
	
	public static void main4(String[] args) {
		Class<?> c = Thread.class;
		String subClassName = c.getSimpleName();
		Class<?> superClass = c.getSuperclass();
		String superClassName = superClass.getSimpleName();
		System.out.println("Super Class	:	"+superClassName);
		System.out.println("Sub Class	:	"+subClassName);
	}
	
	public static void main3(String[] args) {
		Class<?> c = Thread.class;
		String name = c.getSimpleName();
		System.out.println("Name	:	"+name);
	}
	
	public static void main2(String[] args) {
		Class<?> c = Thread.class;
		String name = c.getName();
		System.out.println("F.Q.Name	:	"+name);
	}
	
	public static void main1(String[] args) {
		Class<?> c = Thread.class;
		Package pckg = c.getPackage();
		System.out.println("Name	:	"+pckg.getName());
	}
}
