package org.example.main;

import java.util.Arrays;

public class Program {
	private static int[] getArray() {
		//int[] arr = { 50, 10, 30, 20, 40 };	//OK	
		int[] arr = new int[ ] { 50, 10, 30, 20, 40 };
		return arr;
	}
	
	private static void printRecord(int[] arr) {
		System.out.println( Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] arr = Program.getArray( );
		
		Program.printRecord( arr );	//[50, 10, 30, 20, 40]
		
		Arrays.sort(arr);	//Dual-Pivot Quicksort 
		
		Program.printRecord( arr );	//[10, 20, 30, 40, 50]
	}
}
