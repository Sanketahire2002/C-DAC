class Demo
{
    public static void main(String[] args)
    {
        String s1 = new String();
        String s2 = new String("Sanket");
        String s3 = new String(s2);
        char[] crr = {'S','A','N','K','E','T'};
        String s4 = new String(crr);
        String s5 = new String(crr, 1, 4);
        byte[] brr = {60,61,62,63,64,65,66,67,68,69,70,71,72};
        String s6 = new String(brr);
        String s7 = new String(brr, 2, 11);
        StringBuffer sb = new StringBuffer("Sanket"); 
        String s8 = new String(sb);    
        StringBuilder sbb = new StringBuilder("Sanket");
        String s9 = new String(sbb);

        // String Literals
        String s10 = "Sanket";
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        // System.out.println(s8);
        System.out.println(s9);
        // String Literals
        System.out.println(s10);

        // NOT allowed things
        // String s11 = new String(null);   error: reference to String is ambiguous
        String s12 = null;  // Allowed
        // String s13 =  new String(s12);  Exception in thread "main" java.lang.NullPointerException
        // String s14 = new String(crr, 1, 44);    Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 45
    }
}