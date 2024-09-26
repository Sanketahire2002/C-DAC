package org.example;

import java.lang.reflect.Field;

class Complex{
    private int real;
    private int imag;

    public int getReal() {
        return real;
    }

    public int getImag() {
        return imag;
    }
}

public class Program {
    public static void main(String[] args) {
        Complex complex = new Complex( );

        System.out.println("Real Number :   "+complex.getReal());   //0
        System.out.println("Imag Number :   "+complex.getImag());   //0

        Class<? extends Complex> c = complex.getClass();

        try {
            Field field = c.getDeclaredField("real");
            field.setAccessible( true );
            field.setInt( complex, 10 );

            field = c.getDeclaredField("imag");
            field.setAccessible( true );
            field.setInt( complex, 20 );

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Real Number :   "+complex.getReal());   //10
        System.out.println("Imag Number :   "+complex.getImag());   //20
    }
}