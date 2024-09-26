package org.example.demo3;
interface A{
	void f1( );
	//public abstract void f1( );
}

abstract class B implements A{	//Abstract class
	
}

class C implements A{	//Concrete class
	@Override
	public void f1() {
		System.out.println("C.F1");
	}
}

public class Program {
	public static void main(String[] args) {

	}
}
