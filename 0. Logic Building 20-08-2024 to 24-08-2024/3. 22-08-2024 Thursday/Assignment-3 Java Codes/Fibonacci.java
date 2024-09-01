public class Fibonacci
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;

        while (a <= 21) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
