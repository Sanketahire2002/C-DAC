class Demo_4
{
    public static void main(String[] args)
    {
        StringBuffer sb1 = new StringBuffer("Sanket");
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        sb1.append("DagaduAhire");
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        sb1.append("1234");
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        sb1.append("5");
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        sb1.append("5");
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        sb1.append("6");
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        sb1.append("78901234567890123456789");
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        sb1.append("78901234567890123456789012345678901234567890123456789");
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
    }
}