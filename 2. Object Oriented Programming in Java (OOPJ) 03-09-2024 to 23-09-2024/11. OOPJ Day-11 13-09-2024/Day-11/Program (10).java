package org.example.demo1;

//public static void sleep(long millis)throws InterruptedException
public class Program {
	public static void main(String[] args) {
		try {
			for( int count = 1; count <= 10; ++ count ) {
				System.out.println("Count	:	"+count);
				Thread.sleep(250);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
