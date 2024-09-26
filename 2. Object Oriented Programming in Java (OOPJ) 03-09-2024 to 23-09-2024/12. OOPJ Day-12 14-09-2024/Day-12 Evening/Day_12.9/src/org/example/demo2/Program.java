package org.example.demo2;

class Outer{
	public class Inner{
		
	}
}

public class Program {
	public static void main(String[] args) {
		Outer out = new Outer( );	//OK
		
		Outer.Inner in1 = out.new Inner();	//OK
		
		Outer.Inner in2 = new Outer( ).new Inner();	//OK
	}
}
