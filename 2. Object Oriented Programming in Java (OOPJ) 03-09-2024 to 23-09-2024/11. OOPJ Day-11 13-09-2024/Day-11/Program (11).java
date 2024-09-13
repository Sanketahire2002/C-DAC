package org.example.demo4;

class A extends Exception{	}
class B extends Exception{	}
class C extends Exception{	}
public class Program {
	private static void showRecord(int number) throws A, B, C {
		if( number == 0 )
			throw new A();
		if( number == 1 )
			throw new B();
		if( number == 2 )
			throw new C( );
		System.out.println("Number	:	"+number);
	}
	
	private static void displayRecord(int number) throws Exception {
		if( number == 0 )
			throw new A();
		if( number == 1 )
			throw new B();
		if( number == 2 )
			throw new C( );
		System.out.println("Number	:	"+number);
	}
	public static void main(String[] args) {
		try {
			int number = 10;
			Program.displayRecord( number );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		try {
			int number = 10;
			Program.showRecord( number );
		} catch (A | B | C e) {
			e.printStackTrace();
		}
	}
}
