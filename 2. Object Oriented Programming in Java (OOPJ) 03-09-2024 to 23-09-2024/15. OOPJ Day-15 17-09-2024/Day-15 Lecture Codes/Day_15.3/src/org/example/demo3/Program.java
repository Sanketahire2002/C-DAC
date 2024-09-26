package org.example.demo3;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Complex{
	private int real;
	private int imag;
	
}

public class Program {
	public static void main(String[] args) {
		Class<?> c = Complex.class;
		//Field[] fields = c.getFields();
		Field[] fields = c.getDeclaredFields();
		
		for (Field field : fields) {
			String modifierName = Modifier.toString(field.getModifiers());
			String fieldType = field.getType().getSimpleName();
			String fieldName = field.getName();
			
			System.out.println( modifierName+" "+fieldType+" "+fieldName);
		}
		
	}
	
	public static void main2(String[] args) {
		Class<?> c = Thread.class;
		Field[] fields = c.getFields();
		
		for (Field field : fields) {
			String modifierName = Modifier.toString(field.getModifiers());
			String fieldType = field.getType().getSimpleName();
			String fieldName = field.getName();
			
			System.out.println( modifierName+" "+fieldType+" "+fieldName);
		}
		
	}
	
	public static void main1(String[] args) {
		Class<?> c = Thread.class;
		Field[] fields = c.getFields();
		
		for (Field field : fields) {
			System.out.println( field.toString());
		}
		
	}
}
