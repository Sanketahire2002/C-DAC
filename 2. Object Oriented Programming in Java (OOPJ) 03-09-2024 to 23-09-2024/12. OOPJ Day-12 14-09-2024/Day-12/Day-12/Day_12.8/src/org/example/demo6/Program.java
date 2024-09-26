package org.example.demo6;

public class Program {
	public static void show( Object object ) {
		System.out.println( object );
	}
	
	public static <T> void display( T object ) {
		System.out.println( object );
	}
	
	public static <T extends Number> void print( T object ) {
		System.out.println( object );
	}
	
	public static void main(String[] args) {
		//Program.print( true );
		
		//Program.print( 'A' );
		
		Program.print( 125 );
		
		Program.print( 3.142 );
		
		//Program.print( "CDAC" );
		
		//Program.print( new Date() );
	}
}
