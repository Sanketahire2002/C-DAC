package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Complex {
    private int real;
    private int imag;

    private Complex(int real, int imag) {
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
}
public class Program {
    public static void main(String[] args) {
        Class<Complex> c = Complex.class;

        Complex complex = null;
        try {
            Constructor<Complex> constructor = c.getDeclaredConstructor(int.class, int.class);
            constructor.setAccessible( true );
            complex =  constructor.newInstance( 10, 20 );
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Real Number :   "+complex.getReal());   //10
        System.out.println("Imag Number :   "+complex.getImag());   //20

        complex.setReal( 50 );
        complex.setImag( 60 );

        System.out.println("Real Number :   "+complex.getReal());   //50
        System.out.println("Imag Number :   "+complex.getImag());   //60
    }
}