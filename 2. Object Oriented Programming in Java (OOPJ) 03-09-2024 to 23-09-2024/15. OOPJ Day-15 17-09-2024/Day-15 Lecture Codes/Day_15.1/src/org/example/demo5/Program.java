package org.example.demo5;

@FunctionalInterface
interface Printable { // Printable.class
	void print( String str ); // Functional method / function descriptor
}

public class Program { // Program.class
	public static void main(String[] args) {
		Printable p = str -> System.out.println(str);
		p.print("Hello L.E.");	//"Hello L.E."
	}
	
	public static void main2(String[] args) {
		Printable p = ( str )->System.out.println(str);
		p.print("Hello L.E.");	//"Hello L.E."
	}
	
	public static void main1(String[] args) {
		Printable p = (String s )->System.out.println(s);
		p.print("Hello L.E.");	//"Hello L.E."
	}
}
