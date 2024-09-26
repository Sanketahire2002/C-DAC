package org.example.demo4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Program {
	public static void main(String[] args) {
		Class<?> c = Thread.class;
		
		Constructor<?>[] arr = c.getConstructors();
		for (Constructor<?> constructor : arr) {
			String modifierName = Modifier.toString( constructor.getModifiers());
			String ctorName = c.getSimpleName();
			System.out.print( modifierName+" "+ctorName+"( ");
			
			Parameter[] parameters = constructor.getParameters();
			for (Parameter parameter : parameters) {
				String pTypeName = parameter.getType().getSimpleName();
				String pName = parameter.getName();
				System.out.print( pTypeName+" "+pName+" ,");
			}
			
			System.out.println(" )");
		}
	}
	
	public static void main1(String[] args) {
		Class<?> c = Thread.class;
		
		Constructor<?>[] arr = c.getConstructors();
		for (Constructor<?> constructor : arr) {
			System.out.println( constructor.toString());
		}
	}
}
