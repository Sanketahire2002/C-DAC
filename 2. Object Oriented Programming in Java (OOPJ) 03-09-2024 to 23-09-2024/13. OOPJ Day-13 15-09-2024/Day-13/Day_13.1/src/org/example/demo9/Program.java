package org.example.demo9;

import java.util.Scanner;

interface Collection{	
	void acceptRecord( );
	void printRecord( );
	int[] getArray( );
	
	static void swap( int[] arr ) {
		int temp = arr[ 0 ];
		arr[ 0 ] = arr[ 1 ];
		arr[ 1 ] = temp;
	}
	
	default void sort( ) {
		int[] arr = this.getArray();
		for( int i = 0 ;i < arr.length - 1; ++ i ) {
			for( int j = 0; j < arr.length - 1 - i; ++ j ) {
				if( arr[ j ] > arr[ j + 1 ] ) {
					
					int[] temp = new int[]{ arr[ j ] , arr[ j + 1 ]};
					
					Collection.swap(temp);
					
					arr[ j ]= temp[ 0 ]; 
					arr[ j + 1 ] = temp[ 1];
				}
			}
		}
	}
}

class Array implements Collection{	
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
					int[] temp = new int[]{ arr[ i ] , arr[ j ]};
					Collection.swap(temp);
					arr[ i ]= temp[ 0 ]; 
					arr[ j ] = temp[ 1];
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
