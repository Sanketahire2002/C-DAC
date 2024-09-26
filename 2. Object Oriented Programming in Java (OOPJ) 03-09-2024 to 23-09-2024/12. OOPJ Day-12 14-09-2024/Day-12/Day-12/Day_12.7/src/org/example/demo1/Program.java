package org.example.demo1;

import java.util.Date;

class Box<N extends Number>{	//N is Bounded Type Parameter
	private N object;
	public N getObject() {
		return object;
	}
	public void setObject(N object) {
		this.object = object;
	}
}

public class Program {
	public static void main(String[] args) {
		//Box<Object> b1 = new Box<>( );	//Not OK
		
		Box<Number> b2 = new Box<>( );	//OK
		
		//Box<Boolean> b3 = new Box<>( );	//Not OK
		
		Box<Integer> b4 = new Box<>( );	//OK
		
		Box<Double> b5 = new Box<>( );	//OK
		
		//Box<String> b6 = new Box<>( );	//Not OK
		
		//Box<Date> b7 = new Box<>( );	//Not OK
	}
}
