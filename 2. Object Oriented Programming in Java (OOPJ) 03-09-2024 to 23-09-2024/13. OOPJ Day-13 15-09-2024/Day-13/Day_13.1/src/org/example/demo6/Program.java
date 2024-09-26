package org.example.demo6;

import java.util.Scanner;

interface Collection{	//1996
	void acceptRecord( );
	void printRecord( );
	int[] getArray( );
	default void sort( ) {
		int[] arr = this.getArray();
		for( int i = 0 ;i < arr.length - 1; ++ i ) {
			for( int j = 0; j < arr.length - 1 - i; ++ j ) {
				if( arr[ j ] > arr[ j + 1 ] ) {
					int temp = arr[ j ];
					arr[ j ] = arr[ j + 1 ];
					arr[ j + 1 ] = temp;
				}
			}
		}
	}
}

class Array implements Collection{	//2000
	private int[] arr;
	
	public Array() {
		this( 5 );	//Constructor chaining
	}
	
	public Array( int size ) {
		this.arr = new int[ size ];
	}
	
	@Override
	public void acceptRecord() {
		try( Scanner sc = new Scanner(System.in)){
			for( int index = 0; index < this.arr.length; ++ index ) {
				System.out.print("Enter element	:	");
				this.arr[ index ] = sc.nextInt();
			}
		}
	}
	
	@Override
	public void printRecord() {
		for( int index = 0; index < this.arr.length; ++ index ) 
			System.out.print(this.arr[ index ]+"	");
		System.out.println();
	}
	
	@Override
	public int[] getArray() {
		return this.arr;
	}
	
	@Override
	public void sort() {
		for( int i = 0; i < arr.length - 1; ++ i ) {
			for( int  j = i + 1; j < arr.length; ++ j ) {
				if( arr[ i ] > arr[ j ] ) {
					int temp = arr[ i ];
					arr[ i ] = arr[ j ];
					arr[ j ] = temp;
				}
			}
		}
	}
}
public class Program {
	public static void main(String[] args) {
		Collection c = new Array();	//Upcasting
		c.acceptRecord();
		c.sort();
		c.printRecord();
	}
}
