package org.example;

import java.lang.reflect.Method;
class Test{
    public void f1( ){
        System.out.println("Test.f1");
    }
    public void f2( ){
        System.out.println("Test.f2");
    }
    private void f3( ){
        System.out.println("Test.f3");
    }
    private void f4( ){
        System.out.println("Test.f4");
    }
}
public class Program {
    public static void main(String[] args) {
        Class<Test> c = Test.class;

        Method[] arr1 = c.getMethods();
        for( Method method : arr1 )
            System.out.println( method );
        /*
            public void org.example.Test.f1()
            public void org.example.Test.f2()
            public boolean java.lang.Object.equals(java.lang.Object)
            public java.lang.String java.lang.Object.toString()
            public native int java.lang.Object.hashCode()
            public final native java.lang.Class java.lang.Object.getClass()
            public final native void java.lang.Object.notify()
            public final native void java.lang.Object.notifyAll()
            public final void java.lang.Object.wait(long) throws java.lang.InterruptedException
            public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
            public final void java.lang.Object.wait() throws java.lang.InterruptedException
         */

        System.out.println("*********************");

        Method[] arr2 = c.getDeclaredMethods();
        for( Method method : arr2 )
            System.out.println( method );

        /*
            public void org.example.Test.f1()
            public void org.example.Test.f2()
            private void org.example.Test.f3()
            private void org.example.Test.f4()
        */
    }
}