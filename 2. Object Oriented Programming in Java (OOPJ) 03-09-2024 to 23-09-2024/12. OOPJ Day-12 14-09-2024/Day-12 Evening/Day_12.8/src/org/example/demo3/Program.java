package org.example.demo3;

import java.util.ArrayList;
import java.util.Date;

public class Program {
	private static ArrayList<Object> getObjectList() {
		ArrayList<Object> list = new ArrayList<>();
		
		Object o1 = new String("DAC");	//Upcasting
		list.add(o1);
		
		Object o2 = new Date();	//Upcasting
		list.add(o2);
		
		Object o3 = new Integer(10);	//Upcasting
		list.add(o3);
		
		return list;
	}
	
	private static ArrayList<Number> getNumberList() {
		
		ArrayList<Number> list = new ArrayList<>();
		Number n1 = new Integer(10);	//Upcasting
		list.add(n1);
		
		Number n2 = new Float(11.1f);	//Upcasting
		list.add(n2);
		
		Number n3 = new Double(12.2d);	//Upcasting
		list.add(n3);
		
		return list;
	}	
	
	private static ArrayList<Integer> getIntegerList() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add( 10 );
		list.add( 20 );
		list.add( 30 );
		return list;
	}

	private static ArrayList<Double> getDoubleList() {
		ArrayList<Double> list = new ArrayList<>();
		list.add(10.1);
		list.add(20.2);
		list.add(30.3);
		return list;
	}
	
	private static ArrayList<String> getStringList() {
		ArrayList<String> list = new ArrayList<>();
		list.add("DAC");
		list.add("DMC");
		list.add("DESD");
		list.add("DBDA");
		return list;
	}
	
	private static void print(ArrayList<?> list) {	//? is called as wild card which represents unknown type
		for( Object element : list )
			System.out.println( element );
	}

	public static void main(String[] args) {
		ArrayList<Object> objectList = Program.getObjectList( );
		Program.print( objectList );
		
		ArrayList<Number> numberList = Program.getNumberList( );
		Program.print( numberList );
		
		ArrayList<Integer> integerList = Program.getIntegerList( );
		Program.print( integerList );
		
		ArrayList<Double> doubleList = Program.getDoubleList( );
		Program.print( doubleList );
		
		ArrayList<String> stringList = Program.getStringList( );
		Program.print( stringList );
	}
}
