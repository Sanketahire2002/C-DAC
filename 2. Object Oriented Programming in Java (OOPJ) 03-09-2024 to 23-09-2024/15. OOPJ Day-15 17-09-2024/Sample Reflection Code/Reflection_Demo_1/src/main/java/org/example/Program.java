package org.example;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Class<Thread> c = Thread.class;

        //Get the package name of class Thread
        System.out.println("Package Name: "+ c.getPackage().getName()); //java.lang

        //Get the simple name of the class represented by this Class object
        System.out.println("Class Name: "+ c.getSimpleName());  //Thread

        //Get the F.Q.Name of the class represented by this Class object
        System.out.println("F.Q.Class Name: "+ c.getName());    //java.lang.Thread

        //Get the modifiers used on class
        System.out.println("Modifiers: "+ Modifier.toString( c.getClass().getModifiers() ) );  //public final

        //Read the name of super class represented by this Class object
        System.out.println("Super class :   "+c.getSuperclass().getName()); //java.lang.Object

        //Read the name of interfaces represented by this Class object
        System.out.println("Super Interface(s) :   "+ Arrays.toString( c.getInterfaces())); //[interface java.lang.Runnable]

        //Read the name of annotations represented by this Class object
        System.out.println("Annotations:    "+Arrays.toString(c.getAnnotations())); //[]
    }
}