package org.example.demo3;

interface Sample{
	String changeCase( String str );
}
public class Program {
	public static void main(String[] args) {
		//Sample s = ( String str )-> str.toLowerCase();
		Sample s = String::toLowerCase;
		
		String result = s.changeCase("SanDeep");
		System.out.println(result);
	}
}
