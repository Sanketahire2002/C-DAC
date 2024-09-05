class Demo_5
{
    public static void main(String[] args)
    {
        StringBuffer sb1 = new StringBuffer("Sanket");
        System.out.println(sb1);

        // Method - 1 ==> To add String at the last of previous String using append() method
        System.out.println("*** Method - 1 ***");
        sb1.append("Dagadu Ahire");
        System.out.println(sb1);  

        // Method - 2 ==> To add String in between previous String at given index using insert() method
        System.out.println("*** Method - 2 ***");
        sb1.insert(2, "XXXXX");
        System.out.println(sb1);   
        // sb1.insert(19, "XXXXX");    // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 19   

        // Method - 3 ==>   To reverse String using reverse() method
        System.out.println("*** Method - 3 ***");
        sb1.reverse();
        System.out.println(sb1);

        // Method - 4 ==>   To delete string between given index using delete() method
        System.out.println("*** Method - 4 ***");
        StringBuffer sb2 = new StringBuffer("Sanket Dagadu Ahire");
        System.out.println(sb2);
        sb2.delete(2,4);
        System.out.println(sb2);

        // Method - 5 ==> To delete character at index using deleteCharAt() method
        System.out.println("*** Method - 5 ***");
        StringBuffer sb3 = new StringBuffer("Sanket Dagadu Ahire");
        System.out.println(sb3);
        sb3.deleteCharAt(2);
        System.out.println(sb3);

        // Method - 6 ==>   To free unused memory using trimToSize() method
        System.out.println("*** Method - 6 ***");
        StringBuffer sb4 = new StringBuffer();
        System.out.println(sb4.capacity());
        sb4.append("Sanket");
        System.out.println(sb4.capacity());
        sb4.trimToSize();
        System.out.println(sb4.capacity());
        sb4.append("Dagadu");
        System.out.println(sb4);
        System.out.println(sb4.capacity());
        sb4.trimToSize();
        System.out.println(sb4.capacity());

        StringBuffer sb5 = new StringBuffer("Sanket");
        System.out.println(sb5);
        System.out.println(sb5.capacity());
        sb5.trimToSize();
        System.out.println(sb5.capacity());

        StringBuffer sb6 = new StringBuffer();
        System.out.println(sb6);
        System.out.println(sb6.capacity());
        sb6.trimToSize();
        System.out.println(sb6.capacity());

        // Method - 7 ==>   To increase size of String using ensureCapacity() method
        System.out.println("*** Method - 7 ***");
        StringBuffer sb7 = new StringBuffer();
        System.out.println(sb7.capacity());
        sb7.ensureCapacity(30);
        System.out.println(sb7.capacity());

        StringBuffer sb8 = new StringBuffer();
        System.out.println(sb8.capacity());
        sb8.ensureCapacity(50);
        System.out.println(sb8.capacity());

        StringBuffer sb9 = new StringBuffer();
        System.out.println(sb9.capacity());
        sb9.ensureCapacity(5);
        System.out.println(sb9.capacity());

        // Method - 8 ==>   To reset length and capacity String using setLength() method
        System.out.println("*** Method - 8 ***");
        StringBuffer sb10 = new StringBuffer("Sanket Ahire");
        System.out.println(sb10);
        System.out.println(sb10.length());
        System.out.println(sb10.capacity());
        sb10.setLength(3);
        System.out.println(sb10);
        System.out.println(sb10.length());
        System.out.println(sb10.capacity());

        StringBuffer sb11 = new StringBuffer("Sanket Ahire"); 
        System.out.println(sb11);
        System.out.println(sb11.length());
        System.out.println(sb11.capacity());
        sb11.setLength(30);
        System.out.println(sb11);
        System.out.println(sb11.length());
        System.out.println(sb11.capacity());

        // Method - 9 ==>
        System.out.println("*** Method - 9 ***");
        // Method - 10 ==>
        System.out.println("*** Method - 10 ***");
        // Method - 11 ==>
        System.out.println("*** Method - 11 ***");
        // Method - 12 ==>
        System.out.println("*** Method - 12 ***");
    }
}