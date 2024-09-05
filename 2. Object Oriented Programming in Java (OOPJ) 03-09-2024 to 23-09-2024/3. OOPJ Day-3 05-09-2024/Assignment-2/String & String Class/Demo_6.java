class Demo_6
{
    public static void main(String[] args)
    {
        String s1 = "Sanket";
        StringBuffer sb1 = new StringBuffer(s1);
        System.out.println(s1);
        System.out.println(sb1);

        StringBuilder sbl2 = new StringBuilder("Sanket");
        StringBuffer sbb = new StringBuffer(sbl2);
        System.out.println(sbl2);
        System.out.println(sbb);

        StringBuffer sb2 = new StringBuffer("Ahire");
        String s2 = new String(sb2);
        System.out.println(s2);
        System.out.println(sb2);

        StringBuilder sbl1 = new StringBuilder("Sanket Ahire");
        String s3 = new String(sbl1);
        System.out.println(sbl1);
        System.out.println(s3);

        String s4 = new String("Ahire");
        StringBuilder sblc1 = new StringBuilder(s4);
        System.out.println(s4);
        System.out.println(sblc1);

        StringBuffer sbbc = new StringBuffer("Sanket");
        StringBuilder sblc2 = new StringBuilder(sbbc);
        System.out.println(sbbc);
        System.out.println(sblc2);
    }
}