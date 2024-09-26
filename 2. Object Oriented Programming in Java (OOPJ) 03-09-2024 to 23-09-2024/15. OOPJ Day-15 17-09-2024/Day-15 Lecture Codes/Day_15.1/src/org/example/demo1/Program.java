package org.example.demo1;

@FunctionalInterface
interface Printable{	//Printable.class
	void print( );
}

class PrintableImpl implements Printable{	//PrintableImpl.class
	@Override
	public void print() {
		System.out.println("Hello from PrintableImpl");
	}
}

public class Program {	//Program.class
	public static void main(String[] args) {
		Printable p = new PrintableImpl();	//Upcasting
		p.print();//Dynamic method dispatch
	}
}
