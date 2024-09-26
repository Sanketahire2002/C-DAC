package org.example;


import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class Program {
    private static String getExceptionList(Class<?>[] exceptionTypes) {
        StringBuilder sb = new StringBuilder( );
        for ( Class<?> c : exceptionTypes ){
            sb.append( c.getName() );
            sb.append(", ");
        }
        if( !sb.isEmpty())
            sb.deleteCharAt(sb.length() - 2 );
        return sb.toString();
    }

    private static String getParameterList(Parameter[] parameters) {
        StringBuilder sb = new StringBuilder( );
        for( Parameter parameter : parameters ){
            sb.append( parameter.getType().getName());
            sb.append( " " );
            sb.append( parameter.getName() );
            sb.append( ", " );
        }
        if( !sb.isEmpty())
            sb.deleteCharAt( sb.length() -2 );
        return sb.toString();
    }

    private static String getConstructorList(Constructor<?>[] constructors) {
        StringBuilder sb = new StringBuilder();
        for( Constructor<?> constructor : constructors){
            sb.append( constructor.getModifiers());
            sb.append(" ");
            sb.append( constructor.getName());
            sb.append("( ");

            Parameter[] parameters = constructor.getParameters();
            String parameterList = Program.getParameterList( parameters );
            sb.append( parameterList );
            sb.append(") ");

            Class<?>[] exceptionTypes = constructor.getExceptionTypes();
            String exceptionList = Program.getExceptionList(exceptionTypes);
            if( !exceptionList.isEmpty() ) {
                sb.append("throws ");
                sb.append(exceptionList);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Class<Thread> c = Thread.class;

        Constructor<?>[] constructors = c.getConstructors();
        String constructorList = Program.getConstructorList( constructors );

        System.out.println( constructorList );
    }
}