package org.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class Program {
   /* private static final Map< Class<?>, Function<Scanner, Object> > typeHandlers = new HashMap<>( );
    static{
        Function<Scanner, Object> booleanFunction = scanner -> scanner.nextBoolean();   //using lambda expresion
        typeHandlers.put( boolean.class, booleanFunction );

        Function<Scanner, Object> byteFunction = Scanner::nextByte; //using method reference
        typeHandlers.put( byte.class, byteFunction );

        typeHandlers.put( short.class, Scanner::nextShort );    //Shortcut for method reference
        typeHandlers.put( int.class, Scanner::nextInt );
        typeHandlers.put( float.class, Scanner::nextFloat );
        typeHandlers.put( double.class, Scanner::nextDouble );
        typeHandlers.put( long.class, Scanner::nextLong );
        typeHandlers.put( String.class, Scanner::nextLine );
    }

    private static Object getParameterValue(Class<?> parameterType, Scanner sc) {
        Function<Scanner, Object> handler = typeHandlers.get(parameterType);
        return handler.apply( sc );
    } */

    //or
    private static Object getParameterValue(Class<?> parameterType, Scanner sc) {
        if( parameterType == boolean.class )
            return sc.nextBoolean();
        else if( parameterType == int.class )
            return sc.nextInt();
        else if( parameterType == float.class )
            return sc.nextFloat();
        else if( parameterType == double.class)
            return sc.nextDouble();
        else if( parameterType == String.class )
            return sc.nextLine();
        return null;
    }

    private static Method findMethod(Class<?> c, String name) {
        Method[] methods = c.getDeclaredMethods();
        for( Method method : methods ){
            if( method.getName().equals( name ))
                return method;
        }
        return null;
    }
    public static void main(String[] args) {
        try( Scanner sc = new Scanner( System.in ) ){
            System.out.print("Enter F.Q. Class Name:    ");
            String className = sc.nextLine( );  //com.example.test.ArithmeticTest

            Class<?> c = Class.forName(className);
            Object reference = c.newInstance(); //Creates a new instance of the class represented by this Class object.

            System.out.print("Enter Method Name:    ");
            String methodName = sc.nextLine( ); //sum
            Method method = Program.findMethod( c, methodName );

            if( method != null ){
                Class<?>[] parameterTypes = method.getParameterTypes();
                Object[] parameters = new Object[parameterTypes.length ];

                for( int index = 0; index < parameterTypes.length; ++ index ) {
                    System.out.printf("Parameter%d(%s):    ", (index + 1), parameterTypes[index]);
                    parameters[index] = Program.getParameterValue(parameterTypes[index], sc);
                }

                Object result = method.invoke(reference, parameters);
                System.out.println("Result  :   "+result);
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}