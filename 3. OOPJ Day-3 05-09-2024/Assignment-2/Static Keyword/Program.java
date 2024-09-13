class Program
{
    int a;
    static int b, c;

    static
    {
        c = 10;
    }

    public static void main(String[] args)
    {
        Test t = new Test();
        System.out.println("a = "+t.a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);

        int d;
        d = 20;
        System.out.println("d = "+d);
    }
}