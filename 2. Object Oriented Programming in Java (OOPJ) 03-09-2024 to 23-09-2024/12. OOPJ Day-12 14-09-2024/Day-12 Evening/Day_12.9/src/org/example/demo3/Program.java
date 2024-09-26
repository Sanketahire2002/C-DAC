package org.example.demo3;

class Outer{
	private int num1 = 10;
	private static int num2 = 20;
	public Outer() {
		//TODO
	}
	
	//Define non static nested class
	class Inner{
		private int num3 = 30;	//OK
		//private static int  num4 = 40;	//Not OK
		private static final int num4 = 30;	//OK
	}
	
	public void printRecord( ) {
		System.out.println("Num1	:	"+this.num1);
		System.out.println("Num2	:	"+Outer.num2);
		
		Inner in = new Inner();
		
		System.out.println("Num3	:	"+in.num3);
		System.out.println("Num4	:	"+Inner.num4);
	}
}

public class Program {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.printRecord();
	}
}
