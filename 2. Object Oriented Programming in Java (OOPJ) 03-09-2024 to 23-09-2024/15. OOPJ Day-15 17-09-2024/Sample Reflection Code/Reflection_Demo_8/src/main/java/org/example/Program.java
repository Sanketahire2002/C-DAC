package org.example;

import java.lang.reflect.Field;

class Task extends  Thread{
    public int index;
    private int[] arr;
}
public class Program {
    public static void main(String[] args) {
        Class<Task> c = Task.class;

        Field[] arr1 = c.getFields();
        for( Field field : arr1 )
            System.out.println( field );

        /*
            public int org.example.Task.index
            public static final int java.lang.Thread.MIN_PRIORITY
            public static final int java.lang.Thread.NORM_PRIORITY
            public static final int java.lang.Thread.MAX_PRIORITY
         */
        System.out.println("***********************************");

        Field[] arr2 = c.getDeclaredFields();
        for( Field field : arr2 )
            System.out.println( field );
        /*
            public int org.example.Task.index
            private int[] org.example.Task.arr
         */
    }
}