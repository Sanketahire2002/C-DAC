package org.example.demo10;

@FunctionalInterface
interface A{	//Single Abstract Method Interface / SAM Interface / Functional Interface
	void f1( );	//Single Abstract Method
}

@FunctionalInterface
interface B{	//Functional Interface
	void f1( );	//Functional method / method descriptor
	static void f2() {
		//TODO
	}
	default void f3() {
		//TODO
	}
}

@FunctionalInterface
interface C{	//Functional Interface
	int number = 10;
	
	void f1( );	//Functional method / method descriptor
	static void f2() {
		//TODO
	}
	static void f3() {
		//TODO
	}
	default void f4() {
		//TODO
	}
	default void f5() {
		//TODO
	}
}

/* @FunctionalInterface
interface D{	//Invalid '@FunctionalInterface' annotation; D is not a functional interface
	void f1( );	
	void f2( );	
} */


public class Program {
	public static void main(String[] args) {

	}
}
