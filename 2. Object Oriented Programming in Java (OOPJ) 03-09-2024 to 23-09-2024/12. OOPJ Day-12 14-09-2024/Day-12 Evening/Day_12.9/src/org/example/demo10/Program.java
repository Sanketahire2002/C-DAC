package org.example.demo10;
public class Program {	
	public static void main(String[] args) {
		//Method Local Inner Class
		class Complex{	
			private int real;
			private int imag;
			
			public Complex() {
				this( 0, 0 );
			}
			public Complex( int real, int imag) {
				this.real = real;
				this.imag = imag;
			}
			public int getReal() {
				return real;
			}
			public void setReal(int real) {
				this.real = real;
			}
			public int getImag() {
				return imag;
			}
			public void setImag(int imag) {
				this.imag = imag;
			}
			@Override
			public String toString() {
				return "Complex [real=" + real + ", imag=" + imag + "]";
			}
		}
		
		Complex c1 = new Complex();
		c1.setReal( 10 );
		c1.setImag( 20 );
		System.out.println("Real Number	:	"+c1.getReal());
		System.out.println("Imag Number	:	"+c1.getImag());
	}
}
