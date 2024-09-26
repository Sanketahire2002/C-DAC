package org.example.main;

import java.util.Iterator;

class Node{
	int data;
	Node next = null;	//Instance field initializer
	public Node( int data ) {
		this.data = data;
	}
}
class LinkedList implements Iterable<Integer>{
	private Node head = null;
	private Node tail = null;
	
	public boolean empty( ) {
		return this.head == null;
	}
	
	public void addFirst( int element ) {
		Node newNode = new Node( element );
		if( this.empty())
			this.tail = newNode;
		else
			newNode.next = this.head;
		this.head = newNode;
	}
	
	public void addLast( int element ) {
		Node newNode = new Node( element );
		if( this.empty())
			this.head = newNode;
		else
			this.tail.next = newNode;
		this.tail = newNode;
	}

	@Override
	public Iterator<Integer> iterator() {
		Iterator<Integer> itr = new LinkedListIterator( this.head );	//Upcasting
		return itr;
	}
}

class LinkedListIterator implements Iterator<Integer>{
	private Node trav;
	
	public LinkedListIterator(Node head) {
		this.trav = head;
	}

	@Override
	public boolean hasNext() {
		return trav != null;
	}

	@Override
	public Integer next() {
		int data = trav.data;
		trav = trav.next;
		return Integer.valueOf(data);
	}
	
}
public class Program {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(20);
		list.addFirst(10);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		
		/* Integer element = null;
		Iterator<Integer> itr = list.iterator();
		while( itr.hasNext()) {
			element = itr.next();
			System.out.println( element );
		}*/
		
		for( Integer element : list )	//Can only iterate over an array or an instance of java.lang.Iterable
			System.out.println( element );
	}
}
