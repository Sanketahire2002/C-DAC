package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

//public Field[] getFields()throws SecurityException

//public Field getField(String name) throws NoSuchFieldException, SecurityException

//public Field[] getDeclaredFields() throws SecurityException

//public Field getDeclaredField(String name) throws NoSuchFieldException, SecurityException

public class Program {
    public static void main(String[] args) {
        //Get the reference of java.lang.Class class instance associated with Thread
        Class<Thread> c = Thread.class;

        //Get all the public fields of the class
        Field[] fields = c.getFields();

        //Traverse field array to get field information
        for ( Field field : fields ){
            String modifier = Modifier.toString( field.getModifiers() );  //Get modifiers of the field
            String typeName = field.getType().getName();  //Get the data type of field;
            String fieldName = field.getName(); //Get the name of public field
            System.out.println( modifier+" "+typeName+" "+fieldName);
        }
    }
}