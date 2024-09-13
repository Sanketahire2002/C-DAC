class Demo_3
{
    public static void main(String[] args)
    {
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1);

        String s1 = new String("Sanket");
        String s2 = "Sanket";
        StringBuffer sb2 = new StringBuffer(s1);
        StringBuffer sb3 = new StringBuffer(s2);        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(sb2);
        System.out.println(sb3);

        StringBuffer sb4 = new StringBuffer();
        System.out.println(sb4);
        System.out.println(sb4.length());
        System.out.println(sb4.capacity());

        StringBuffer sb5 = new StringBuffer(50);
        System.out.println(sb5);
        System.out.println(sb5.length());
        System.out.println(sb5.capacity());

        StringBuffer sb6 = new StringBuffer("Sanket");
        System.out.println(sb6);
        System.out.println(sb6.length());
        System.out.println(sb6.capacity());

        StringBuffer sb7 = new StringBuffer("Sanket Dagadu Ahire is a good boy.");
        System.out.println(sb7);
        System.out.println(sb7.length());
        System.out.println(sb7.capacity());

        StringBuffer sb8 = new StringBuffer();
        System.out.println(sb8.length());
        System.out.println(sb8.capacity());
        System.out.println(sb8);
        sb8.append("Sanket");
        System.out.println(sb8);
        System.out.println(sb8.length());
        System.out.println(sb8.capacity());
        sb8.append("Dagadu");
        System.out.println(sb8);
        System.out.println(sb8.length());
        System.out.println(sb8.capacity());
        sb8.append("Ahire");
        System.out.println(sb8);
        System.out.println(sb8.length());
        System.out.println(sb8.capacity());
        sb8.append(" is a good boy.");
        System.out.println(sb8);
        System.out.println(sb8.length());
        System.out.println(sb8.capacity());
        sb8.append("He is");
        System.out.println(sb8);
        System.out.println(sb8.length());
        System.out.println(sb8.capacity());
        sb8.append(" clever boy and a handsome boy. He is Computer Engineer.");
        System.out.println(sb8);
        System.out.println(sb8.length());
        System.out.println(sb8.capacity());
        sb8.append(" clever boy and a handsome boy. He is Computer Engineer. He is graduated in Computer Engineering. He had Bachelor's of Engineering degree.");
        System.out.println(sb8);
        System.out.println(sb8.length());
        System.out.println(sb8.capacity());
    }
}