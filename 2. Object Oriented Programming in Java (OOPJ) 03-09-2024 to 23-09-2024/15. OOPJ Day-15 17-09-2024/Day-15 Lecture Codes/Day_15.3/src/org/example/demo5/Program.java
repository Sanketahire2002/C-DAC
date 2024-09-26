package org.example.demo5;

import java.lang.reflect.Field;

class Complex{
	private int real;
	private int imag;
	
	public int getReal() {
		return real;
	}
	
	public int getImag() {
		return imag;
	}
}

public class Program {
	public static void main(String[] args) {
		Complex complex = new Complex();
		System.out.println("Real Number	:	"+complex.getReal());
		System.out.println("Imag Number	:	"+complex.getImag());
		
		Class<?> c = complex.getClass();
		Field field = null;
		try {
			field = c.getDeclaredField("real");
			field.setAccessible(true);
			field.setInt(complex, 10);
			
			field = c.getDeclaredField("imag");
			field.setAccessible(true);
			field.setInt(complex, 20);
			
			System.out.println("Real Number	:	"+complex.getReal());
			System.out.println("Imag Number	:	"+complex.getImag());
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
}
