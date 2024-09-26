package org.example.demo1;

@FunctionalInterface
interface Printable{
	void print( String str );
}


public class Program {
	public static void showRecord( String str ) {
		System.out.println( str );
	}
	
	public void displayRecord( String str ) {
		System.out.println( str );
	}
	
	public static void main(String[] args) {
		Program reference = new Program();
		Printable p = reference::displayRecord;	//Method reference using non static method
		p.print("Hello DAC");
	}
	
	public static void main2(String[] args) {
		//Printable p = //Lambda Expression
		//Printable p = //Method Reference
		Printable p = Program::showRecord;	//Method reference using static method
		p.print("Hello");
	}
	
	public static void main1(String[] args) {
		Printable p = str -> System.out.println( str );
		p.print("Hello");
	}
}
