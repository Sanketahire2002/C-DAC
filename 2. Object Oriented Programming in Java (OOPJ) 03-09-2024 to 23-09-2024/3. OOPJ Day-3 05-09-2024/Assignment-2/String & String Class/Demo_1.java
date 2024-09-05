class Demo_1
{
    public static void main(String[] args)
    {
        String s1 = new String("Sanket");
        String s2 = new String("Sanket");
        String s3 = "Sanket";
        String s4 = "Sanket";

        System.out.println("Hashcoce of s1 = "+s1.hashCode());
        System.out.println("Hashcoce of s2 = "+s2.hashCode());
        System.out.println("Hashcoce of s3 = "+s3.hashCode());
        System.out.println("Hashcoce of s4 = "+s4.hashCode());
        // Hashcode created by state of Object. So they are same for all objects of same data
        System.out.println("s1 == s2 ==> " + (s1 == s2));
        System.out.println("s1 == s3 ==> " + (s1 == s3));
        System.out.println("s1 == s4 ==> " + (s1 == s4));
        System.out.println("s2 == s3 ==> " + (s2 == s3));
        System.out.println("s2 == s4 ==> " + (s2 == s4));
        System.out.println("s3 == s4 ==> " + (s3 == s4));
        // Hashcode and References are different different
        System.out.println("s1 equals s2 ==> "+s1.equals(s2));
        System.out.println("s1 equals s3 ==> "+s1.equals(s3));
        System.out.println("s1 equals s4 ==> "+s1.equals(s4));
        System.out.println("s2 equals s3 ==> "+s2.equals(s3));
        System.out.println("s2 equals s4 ==> "+s2.equals(s4));
        System.out.println("s3 equals s4 ==> "+s3.equals(s4));
    }
}