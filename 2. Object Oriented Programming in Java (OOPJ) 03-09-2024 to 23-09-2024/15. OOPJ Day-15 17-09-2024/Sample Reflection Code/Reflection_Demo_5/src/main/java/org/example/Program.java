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

        Field[] fields = c.getDeclaredFields();
        for( Field field : fields ){
            System.out.print( Modifier.toString( field.getModifiers()) +" ");
            System.out.print( field.getType().getSimpleName()+" ");
            System.out.print( field.getName() +"    :   ");

            try {
                field.setAccessible( true );
                System.out.println( field.get( t ));    //In case of static field, argument t will be ignored.
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}