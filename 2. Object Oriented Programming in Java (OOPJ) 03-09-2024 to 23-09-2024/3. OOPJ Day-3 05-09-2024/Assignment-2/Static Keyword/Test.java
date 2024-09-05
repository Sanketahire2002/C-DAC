// prepare algorithms gives space to static fields and execute static blocks and variables in the sequence same as in program
// we can take multiple static blocks

class Test
{
    static
    {
        System.out.println("Static Block - 3");
    }

    static int a = fun();

    public static void main(String args[])
    {
        System.out.println("Main Method");
    }

    static
    {
        System.out.println("Static Block");
    }

    static int b = fun();

    static int fun()
    {
        System.out.println("Static fun");
        return 0;
    }

    static
    {
        System.out.println("Static Block - 2");
    }
}