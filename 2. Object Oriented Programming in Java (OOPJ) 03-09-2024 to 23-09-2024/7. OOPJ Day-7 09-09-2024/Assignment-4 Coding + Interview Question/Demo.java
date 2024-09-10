public class Demo
{
    public static void main(String[] args)
    {
        //Program Demonstrating Widening Conversion from int to double, float, boolean, and String
        int i = 10;

        double d = i;
        float f = i;
        String s = Integer.toString(i);
        // boolean - Not Possible
       
        System.out.println("Number: " + i);
        System.out.println("Number: " + d);
        System.out.println("Number: " + f);
        System.out.println("Number: " + s);
        
    }
}