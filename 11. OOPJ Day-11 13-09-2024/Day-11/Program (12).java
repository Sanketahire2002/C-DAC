package org.example.demo3;

public class Program {
	private static int convertStringToInteger(String str)throws NumberFormatException {
		return Integer.parseInt( str );
	}
	public static void main(String[] args) {
		String str = "123";
		int number = Program.convertStringToInteger( str );
		System.out.println("Number	:	"+number);
	}
}
