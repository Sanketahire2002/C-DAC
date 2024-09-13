public class Example
{
    public static void main(String[] args)
    {
        // Program Demonstrating Narrowing Conversion from double to int
        double d2 = 11.75;
        // int i = d2; // incompatible types: possible lossy conversion from double to int
        int i = (int) d2;
        System.out.println("Number: " + d2);
        System.out.println("Number: " + i);
    }
}