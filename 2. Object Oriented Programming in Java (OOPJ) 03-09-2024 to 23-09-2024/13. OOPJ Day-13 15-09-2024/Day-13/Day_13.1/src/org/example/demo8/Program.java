package org.example.demo8;

interface Test{
	default void f1( ) {
	}
	
	default void f2( ) {
	}
	
	default void f3( ) {
	}
}

class A implements Test{ 
	@Override
	public void f1() {
		System.out.println("A.f1");
	}
}

class B implements Test{
	@Override
	public void f2() {
		System.out.println("B.f2");
	}
}

class C implements Test{
	@Override
	public void f3() {
		System.out.println("C.f3");
	}
}
public class Program {
	public static void main(String[] args) {
		Test t1 = new A();	//Upcasting
		t1.f1();
		
		Test t2 = new B();	//Upcasting
		t2.f2();
		
		Test t3 = new C();	//Upcasting
		t3.f3();
	}
}
