package org.example.demo2;

class A{
	int num1 = 10;
	public void showRecord( ) {
		System.out.println("Num1	:	"+this.num1);
	}
	public void printRecord( ) {
		System.out.println("Num1	:	"+this.num1);
	}
}
class B extends A{
	int num2 = 20;
	public void displayRecord( ) {
		//this.showRecord();	//OK
		super.showRecord();	//OK
		System.out.println("Num2	:	"+this.num2);
	}
	
	public void printRecord( ) {
		super.printRecord();
		System.out.println("Num2	:	"+this.num2);
	}
}
public class Program {
	public static void main(String[] args) {
		B b = new B();
		b.printRecord();
	}
	public static void main2(String[] args) {
		B b = new B( );
		//b.showRecord();		//10
		b.displayRecord();	//20
	}
	public static void main1(String[] args) {
		B b = new B( );
		b.showRecord();		//10
		b.displayRecord();	//20
	}
}
