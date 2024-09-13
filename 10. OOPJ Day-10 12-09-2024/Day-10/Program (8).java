package org.example.demo7;

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
public class Program {
	public static void main(String[] args) {
		int choice;
		ShapeUtil util = new ShapeUtil();
		while( ( choice = ShapeUtil.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				util.setShape(new Rectangle());
				util.acceptRecord();
				util.printRecord();
				break;
			case 2:
				util.setShape(new Circle());
				util.acceptRecord();
				util.printRecord();
				break;
			}
		}
	}
}
