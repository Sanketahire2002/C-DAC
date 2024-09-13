package org.example.demo8;

import java.util.Calendar;
import java.util.Scanner;

class Shape{
	protected float area;
	public Shape() {
	}
	public void calculateArea( ) {
		
	}
	public float getArea() {
		return this.area;
	}
}

class Rectangle extends Shape{
	private float length;
	private float breadth;
	
	public Rectangle() {
	}
	public void setLength(float length) {
		this.length = length;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	public void calculateArea( ) {
		this.area = this.length * this.breadth;
	}
}

class Circle extends Shape{
	private float radius;
	
	public Circle() {
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public void calculateArea( ) {
		this.area = (float) (Math.PI * Math.pow(radius, 2));
	}
}

class ShapeUtil{
	private Shape shape;	//null
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	private static Scanner sc = new Scanner(System.in);
	public void acceptRecord( ) {
		if( this.shape != null ) {
			if( shape instanceof Rectangle ) {
				Rectangle rect = (Rectangle) shape;	//Downcasting
				System.out.print("Length	:	");
				rect.setLength(sc.nextFloat());
				System.out.print("Breadth	:	");
				rect.setBreadth(sc.nextFloat());
			}else {
				Circle c = (Circle) shape;	//Downcasting
				System.out.print("Radius	:	");
				c.setRadius(sc.nextFloat());
			}
			this.shape.calculateArea();//Dynamic method dispatch
		}
	}
	
	public void printRecord( ) {
		if( this.shape != null ) {
			System.out.println("Area	:	"+shape.getArea());
		}
	}
	
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void releaseResource( ) {
		sc.close();
	}
}

class ShapeFactory{
	public static Shape getInstance( int choice ) {
		Shape shape = null;
		switch( choice ) {
		case 1:
			shape = new Rectangle();	//Upcasting
			break;
		case 2:
			shape = new Circle();	//Upcasting
			break;
		}
		return shape;
	}
}

public class Program {
	public static void main(String[] args) {
		Calendar.getInstance();
		int choice;
		ShapeUtil util = new ShapeUtil();
		while( ( choice = ShapeUtil.menuList( ) ) != 0 ) {
			Shape shape = ShapeFactory.getInstance(choice);
			if( shape != null ) {
				util.setShape(shape);
				util.acceptRecord();
				util.printRecord();
			}
		}
	}
}
