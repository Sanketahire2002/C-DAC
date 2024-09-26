package org.example.demo1;

interface Sample{
	//Nested Type
	//Fields
	//Abstract method
	//Default method
	//Static interface method
}

interface Printable{	//ISI
	//int number;	//Not OK: The blank final field number may not have been initialized
	int number = 10;	//OK
	//public static final int number = 10;	//OK
	
	//public Printable( ){	}	//Interfaces cannot have constructors
	
	//void print( ) {	}	//Abstract methods do not specify a body
	void print( );	//OK
	//public abstract void print( );	//OK
}

//Service Provider
class PrintableImpl implements Printable{
	@Override
	public void print() {
		System.out.println("Number	:	"+Printable.number);
	}
}

public class Program {
	//Service Consumer
	public static void main(String[] args) {
		PrintableImpl p1 = new PrintableImpl();
		p1.print();
		
		Printable p2 = new PrintableImpl();	//Upcasting
		p2.print();
	}
	public static void main1(String[] args) {
		Printable p = null;	//OK
		
		//p = new Printable( );	//Cannot instantiate the type Printable
	}
}
