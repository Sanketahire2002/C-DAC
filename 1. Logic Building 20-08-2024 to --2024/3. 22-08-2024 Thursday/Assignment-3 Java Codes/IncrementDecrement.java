public class IncrementDecrement 
{
    public static void main(String[] args) 
    {
        int a = 5;
        int b = 10;

        int result = ++a + b--;  
        
        System.out.println("Result: " + result);
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}
