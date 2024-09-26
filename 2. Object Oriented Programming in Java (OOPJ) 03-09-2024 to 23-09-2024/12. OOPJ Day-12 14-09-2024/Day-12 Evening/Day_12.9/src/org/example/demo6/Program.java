package org.example.demo6;

import org.example.demo6.Outer.Inner;

//Top level class
class Outer{//Outer.class
	
	//Static nested class
	static class Inner{	//Outer$Inner.class
		
	}
}
public class Program {
	public static void main(String[] args) {
		Outer out = new Outer();
		
		Outer.Inner in1 = new Outer.Inner();
		
		Inner in2 = new Inner();
	}
}
