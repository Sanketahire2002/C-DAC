package org.example.demo1;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add( 10 );	//list.add( Integer.valueOf(10) );
		list.add( 20 );	//list.add( Integer.valueOf(20) );
		list.add( 30 );	//list.add( Integer.valueOf(30) );
		
		for( Integer element : list )
			System.out.println(element);
	}
}
