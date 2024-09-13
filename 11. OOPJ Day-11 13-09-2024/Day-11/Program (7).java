package oeg.example.main;

import java.util.Scanner;

import org.example.collection.Stack;
import org.example.exception.StackOverflowException;
import org.example.exception.StackUnderflowException;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		Stack stack = new Stack( );
		while( ( choice = Program.menuList( ) ) != 0 ) {
			try {
				switch( choice ) {
				case 1:
					System.out.print("Enter element	:	");
					stack.push(sc.nextInt());
					break;
				case 2:
					int element = stack.peek();
					System.out.println("Popped element is	:	"+element);
					stack.pop();
					break;
				}
			} catch (StackOverflowException | StackUnderflowException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
