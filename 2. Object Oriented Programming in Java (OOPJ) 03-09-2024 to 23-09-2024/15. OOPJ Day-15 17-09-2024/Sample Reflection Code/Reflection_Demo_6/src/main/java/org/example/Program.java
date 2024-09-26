package org.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

//public Method[] getMethods() throws SecurityException

//public Method getMethod(String name, Class<?>... parameterTypes) throws NoSuchMethodException, SecurityException

//public Method[] getDeclaredMethods() throws SecurityException

//public Method getDeclaredMethod(String name, Class<?>... parameterTypes) throws NoSuchMethodException, SecurityException


public class Program {
    private static String getAnnotationList(Annotation[] annotations) {
        StringBuilder sb = new StringBuilder( );
        for( Annotation annotation : annotations ){
            sb.append("@");
            sb.append(annotation.annotationType().getSimpleName());
            sb.append(" ");
        }
        return sb.toString();
    }

    private static String getParameterList(Parameter[] parameters) {
        StringBuilder sb = new StringBuilder();
        for( Parameter parameter : parameters ) {
            Annotation[] annotations = parameter.getAnnotations();
            String annotationList = Program.getAnnotationList(annotations);
            if( !annotationList.isEmpty())
                sb.append( annotationList );
            sb.append(parameter.getType().getSimpleName());
            sb.append(" ");
            sb.append(parameter.getName());
            sb.append(", ");
        }
        if( !sb.isEmpty())
            sb.deleteCharAt( sb.length() - 2 );  //To remove last comma
        return sb.toString();
    }



    private static String getExceptionList(Class<?>[] exceptionTypes) {
        StringBuilder sb = new StringBuilder( );
        for( Class<?> c : exceptionTypes ){
            sb.append( c.getSimpleName() );
            sb.append(","); //To separate exception types;
        }
        if( !sb.isEmpty())
            sb.deleteCharAt( sb.length() - 1 );  //To remove last comma
        return sb.toString();
    }

    private static String getMethodList(Method[] methods) {
        StringBuilder sb = new StringBuilder();
        for ( Method method : methods ){
            //Read Annotation Information
            Annotation[] annotations = method.getAnnotations();
            String annotationList = Program.getAnnotationList( annotations );
            if( !annotationList.isEmpty())
                sb.append( annotationList );

            //Read modifier information
            String modifiers = Modifier.toString( method.getModifiers() );
            sb.append( modifiers );
            sb.append(" ");

            //Read return type information
            String returnType = method.getReturnType().getSimpleName();
            sb.append( returnType );
            sb.append(" ");

            //Read method name
            String methodName = method.getName();
            sb.append( methodName );
            sb.append("( ");

            //Read Parameter information
            Parameter[] parameters = method.getParameters();
            String parameterList = Program.getParameterList( parameters );
            if( !parameterList.isEmpty())
                sb.append( parameterList );

            sb.append(" )");

            //Read exception type information
            Class<?>[] exceptionTypes = method.getExceptionTypes();
            String exceptionList = Program.getExceptionList( exceptionTypes );
            if( !exceptionList.isEmpty() )
                sb.append(" throws ");
            sb.append( exceptionList );

            sb.append(";");
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        //Get the reference of java.lang.Class class instance associated with Test class
        Class<Thread> c = Thread.class;

        Method[] methods = c.getMethods();
        String methodList = Program.getMethodList( methods );

        System.out.println( methodList );
    }
}