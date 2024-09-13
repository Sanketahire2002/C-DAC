package org.example.main;

class Base{
	public void print( ) {
	}
}
class Derived extends Base{
	@Override
	public void print() throws InterruptedException {
		for( int count = 1; count <= 10; ++ count ) {
			System.out.println("Count	:	"+count);
			Thread.sleep(250);
		}
	}
}
public class Program {
	public static void main(String[] args) {
		Base base = new Derived( );	//Upcasting
		
		base.print();	//Dynamic Method Dispatch
	}
}
