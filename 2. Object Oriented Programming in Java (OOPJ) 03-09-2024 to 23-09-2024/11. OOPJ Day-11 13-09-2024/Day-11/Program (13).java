package org.example.demo2;

public class Program {
	private static void showRecord() {
		try {
			for( int count = 1; count <= 10; ++ count ) {
				System.out.println("Count	:	"+count);
				Thread.sleep(250);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static void displayRecord() throws InterruptedException {
		for( int count = 1; count <= 10; ++ count ) {
			System.out.println("Count	:	"+count);
			Thread.sleep(250);
		}
	}
	public static void main(String[] args) {
		try {
			Program.displayRecord();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		Program.showRecord( );
	}
}
