package org.example.demo4;

interface Test{
	void f1( );
	void f2( );
	void f3( );
}

abstract class TestImpl implements Test{
	@Override public void f1() {	}
	@Override public void f2() {	}
	@Override public void f3() {	}
}

class A extends TestImpl{
	@Override
	public void f1() {
		System.out.println("A.f1");
	}
}
class B extends TestImpl{
	@Override
	public void f2() {
		System.out.println("B.f2");
	}
}
class C extends TestImpl{
	@Override
	public void f3() {
		System.out.println("C.f3");
	}
}
public class Program {
	public static void main(String[] args) {
		Test t1 = new A( );
		t1.f1();
		
		Test t2 = new B();
		t2.f2();
		
		Test t3 = new C();
		t3.f3();
	}
}
