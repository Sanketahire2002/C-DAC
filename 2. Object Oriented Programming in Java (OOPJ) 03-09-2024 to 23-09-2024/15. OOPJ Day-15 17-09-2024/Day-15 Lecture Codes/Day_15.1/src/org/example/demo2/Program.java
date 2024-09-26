package org.example.demo2;

@FunctionalInterface
interface Printable{	//Printable.class
	void print( );
}

public class Program {	//Program.class
	public static void main(String[] args) {

		class PrintableImpl implements Printable{	//Printable$PrintableImpl.class
			@Override
			public void print() {
				System.out.println("Hello from PrintableImpl");
			}
		}
		
		Printable p = new PrintableImpl();	//Upcasting
		p.print();//Dynamic method dispatch
	}
}
