package org.example.demo11;
public class Program {	
	public static void main(String[] args) {
		Object o1 = null;
		
		Object o2 = new Object( );
		
		Object o3 = new Object( ) {
			private String message = "Good evening!!";
			@Override
			public String toString() {
				return message;
			}
		};
		
		String message = o3.toString();
		System.out.println( message );
		
	}
}
