package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

//public Field[] getFields()throws SecurityException

//public Field getField(String name) throws NoSuchFieldException, SecurityException

//public Field[] getDeclaredFields() throws SecurityException

//public Field getDeclaredField(String name) throws NoSuchFieldException, SecurityException

class Test{
    private static int num1 = 10;

    protected int num2 = 20;
}
public class Program {
    public static void main(String[] args) {
        //Get the reference of java.lang.Class class instance associated with Test class
        //Class<Test> c = Test.class; //or

        Test t = new Test();
        //Get the reference of java.lang.Class class instance associated with Test class
        Class<?> c = t.getClass();

        try {
            Field field = c.getDeclaredField("num1");
            field.setAccessible( true );
            int num1 = (int) field.get( null ); //num1 is static fields hence argument is null
            System.out.println("Num1    :   "+num1);    //10

            field = c.getDeclaredField("num2");
            field.setAccessible( true );
            int num2 = (int) field.get( t ); //Get the value of num2 from t
            System.out.println("Num2    :   "+num2);    //20

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}