package org.example.demo4;

class Outer{
	private int num1 = 10;
	private static int num2 = 20;
	public Outer() {
		//TODO
	}
	
	//Define non static nested class
	class Inner{
		private int num3 = 30;	//OK
		private static final int num4 = 40;	//OK
		public Inner() {
			// TODO 
		}
		public void printRecord( ) {
			System.out.println("Num1	:	"+num1);
			//System.out.println("Num1	:	"+Outer.this.num1);
			System.out.println("Num2	:	"+num2);
			//System.out.println("Num2	:	"+Outer.num2);
			System.out.println("Num3	:	"+this.num3);
			System.out.println("Num4	:	"+Inner.num4);
		}
	}
}
public class Program {
	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.printRecord();
	}
}
