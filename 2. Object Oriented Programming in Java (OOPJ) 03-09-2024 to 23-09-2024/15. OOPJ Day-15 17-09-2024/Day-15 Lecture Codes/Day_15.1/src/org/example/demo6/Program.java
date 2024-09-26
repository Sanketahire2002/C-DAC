package org.example.demo6;

@FunctionalInterface
interface IMath{
	double sum( float num1, double num2 );	//Functional method
}

public class Program { // Program.class
	public static void main(String[] args) {
		IMath math = ( num1,  num2 ) ->  num1 + num2;
		
		double result = math.sum(10.1f, 20.2d);
		
		System.out.println("Result	:	"+result);
		
	}
	
	public static void main4(String[] args) {
		IMath math = ( float num1, double num2 ) ->  num1 + num2;
		
		double result = math.sum(10.1f, 20.2d);
		System.out.println("Result	:	"+result);
		
	}
	
	public static void main3(String[] args) {
		IMath math = ( float num1, double num2 ) -> {
			return num1 + num2;
		};
		
		double result = math.sum(10.1f, 20.2d);
		System.out.println("Result	:	"+result);
		
	}
	
	public static void main2(String[] args) {
		IMath math = ( float num1, double num2 ) -> {
			double result = num1 + num2;
			return result;
		};
		
		double result = math.sum(10.1f, 20.2d);
		System.out.println("Result	:	"+result);
		
	}
	
	public static void main1(String[] args) {
		IMath math = ( float num1, double num2 ) -> {
			double result = 0;
			result = num1 + num2;
			return result;
		};
		
		double result = math.sum(10.1f, 20.2d);
		System.out.println("Result	:	"+result);
		
	}
}
