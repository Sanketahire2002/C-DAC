package org.example.main;

import java.util.Iterator;
import java.util.LinkedList;

public class Program {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.addFirst(20);
		list.addFirst(10);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		
		Integer element = null;
		Iterator<Integer> itr = list.iterator();
		while( itr.hasNext()) {
			element = itr.next();
			System.out.println( element );
		}
	}
	public static void main1(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.addFirst(20);
		list.addFirst(10);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		
		for( Integer element : list )
			System.out.println( element );
	}
}
