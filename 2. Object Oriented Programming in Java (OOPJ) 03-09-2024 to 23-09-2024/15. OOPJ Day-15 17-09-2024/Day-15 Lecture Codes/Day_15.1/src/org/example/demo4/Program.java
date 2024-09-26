package org.example.demo4;

@FunctionalInterface
interface Printable { // Printable.class
	void print(); // Functional method / function descriptor
}

public class Program { // Program.class
	public static void main(String[] args) {
		Printable p = () -> System.out.println("Hello from lambda expresion");
		p.print();
	}
}
