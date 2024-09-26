package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Complex{
    private int real;
    private int imag;


    public int getReal() {
        return real;
    }

    private void setReal(int real) {
        this.real = real;
    }

    public int getImag() {
        return imag;
    }
    private void setImag(int imag) {
        this.imag = imag;
    }
}

public class Program {
    public static void main(String[] args) {
        Complex complex = new Complex();

        System.out.println( "Real Number    :   "+complex.getReal( ) );
        System.out.println( "Imag Number    :   "+complex.getImag( ) );

        Class<? extends Complex> c = complex.getClass();
        Method method = null;

        try {
            method = c.getDeclaredMethod( "setReal", int.class);
            method.setAccessible(true);
            method.invoke( complex, 10 );

            method = c.getDeclaredMethod( "setImag", int.class);
            method.setAccessible(true);
            method.invoke( complex, 20 );
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        System.out.println( "Real Number    :   "+complex.getReal( ) );
        System.out.println( "Imag Number    :   "+complex.getImag( ) );
    }
}