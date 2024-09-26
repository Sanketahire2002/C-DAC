package org.example.demo7;

interface A{
	default void f1( ) {
		System.out.println("A.f1");
	}
	default void f3( ) {
		System.out.println("A.f3");
	}
}
interface B{
	default void f2( ) {
		System.out.println("B.f2");
	}
	default void f3( ) {
		System.out.println("B.f3");
	}
}
class C implements A, B{
	@Override
	public void f3() {
		//A.super.f3();
		//B.super.f3();
		System.out.println("C.f3");
	}
}
public class Program {
	public static void main(String[] args) {
		A a = new C( );	//Upcasting
		a.f1();
		a.f3();
		
		B b = new C( );	//Upcasing
		b.f2();
		b.f3();
	}
}
