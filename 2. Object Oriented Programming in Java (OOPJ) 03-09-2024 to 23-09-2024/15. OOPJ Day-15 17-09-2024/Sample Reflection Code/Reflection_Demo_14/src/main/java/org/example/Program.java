package org.example;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try( Scanner sc = new Scanner( System.in ) ){
            System.out.print("Enter size    :   ");
            int size = sc.nextInt();

            Object arr =  Array.newInstance(int.class, size);

            for( int index = 0; index < Array.getLength( arr ); ++ index ){
                System.out.print("Enter number  :   ");
                //Array.set( arr, index, sc.nextInt());
                Array.setInt(arr, index, sc.nextInt());
            }

            for( int index = 0; index < Array.getLength( arr ); ++ index ){
                //System.out.println( Array.get( arr, index ));
                System.out.println( Array.getInt( arr, index ));
            }
        }
    }
}