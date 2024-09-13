package org.example.demo3;

import java.util.Scanner;

class Test implements AutoCloseable{	//Resource Type
	private int number;
	private Scanner sc = new Scanner(System.in);
	public Test( ) {
		this.number = 0;
	}
	public void acceptRecord( ) {
		System.out.print("Number	:	");
		this.number = sc.nextInt();
	}
	public void printRecord( ) {
		System.out.println("Number	:	"+this.number);
	}
	@Override
	public void close() throws Exception {
		this.sc.close();
	}
}

public class Program {
	public static void main(String[] args) {
		try( Test t = new Test();
			Scanner sc = new Scanner(System.in);){
			t.acceptRecord();
			t.printRecord();
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
