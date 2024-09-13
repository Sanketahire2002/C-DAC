// Predefine methods in String class

class Demo_2
{
    public static void main(String[] args)
    {
        String s1 = new String("Sanket");
        String s2 = new String("Ahire");
        String s3 = null;
        
        // Method - 1 ==> To print String
        System.out.println("*** Method - 1 ***");
        System.out.println(s1);
        System.out.println(s1.toString());

        // Method - 2 ==> To get String length by using length() method
        System.out.println("*** Method - 2 ***");
        System.out.println(s1.length());

        // Method - 3 ==> To concat two Strings by + operator and by concat() method
        System.out.println("*** Method - 3 ***");
        // by + operator
        System.out.println(s1+" Dagadu "+s2);
        s3 = s1 + "Dagadu" + s2;
        System.out.println(s3);

        // by concat() method
        System.out.println(s1.concat(s2));
        System.out.println(s1);
        System.out.println(s2);
        s3 = s1.concat(s2);
        System.out.println(s3);



        // Method - 4 ==> To get character on the index by charAt() method
        System.out.println("*** Method - 4 ***");
        System.out.println(s1.charAt(1));
        // System.out.println(s1.charAt(6)); Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 6

        // Method - 5 ==> To get index of character or substring by indexOf() method
        System.out.println("*** Method - 5 ***");
        System.out.println(s1);
        System.out.println(s1.indexOf('S'));
        System.out.println(s1.indexOf('n'));
        System.out.println(s1.indexOf('t'));
        System.out.println(s1.indexOf('s'));    // Case sensitive
        System.out.println(s1.indexOf("N"));    // Case sensitive   // " " also allowed because it is valid for String also
        System.out.println(s3);
        System.out.println(s3.indexOf('e'));    // returns index of only first occuring character
        System.out.println(s3.indexOf("nke"));  // substring
        System.out.println(s3.indexOf("Sanket"));
        System.out.println(s3.indexOf("ankxyz"));
        System.out.println(s3.indexOf('e',5));      // char and Offset
        System.out.println(s3.indexOf('e',5));      // char and Offset
        String s4 = "abcdefabcdef";
        System.out.println(s4);
        System.out.println(s4.indexOf("cde",115));      // char and Offset
        System.out.println(s4.indexOf("cde"));

        // Method - 6 ==> To get index of character or substring from last by lastIndexOf() method
        System.out.println("*** Method - 6 ***");
        System.out.println(s1);
        System.out.println(s1.lastIndexOf('S'));    // *
        System.out.println(s1.lastIndexOf('t'));    // *

        // Method - 7 ==> To check content in Object with Case sensitive i.e. Strings by equals() method
        System.out.println("*** Method - 7 ***");
        s3 = "Sanket";
        s4 = "sanket";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));  // Case Sensitive

        // Method - 8 ==> To check content in Object without Case sensitive i.e. Strings by equals() method
        System.out.println("*** Method - 8 ***");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));  // NOT Case Sensitive

        // Method - 9 ==>   Lowercase to Uppercase by toUpperCase() method
        System.out.println("*** Method - 9 ***");
        s3 = "SANket";
        System.out.println(s3);
        System.out.println(s3.toUpperCase());

        // Method - 10 ==>   Uppercase to Lowercase by toLowerCase() method
        System.out.println("*** Method - 10 ***");
        s3 = "SANket";
        System.out.println(s3);
        System.out.println(s3.toLowerCase());

        // Method - 11 ==>  Lexigographically comparison with Case Sensitive by comareTo() method 
        System.out.println("*** Method - 11 ***");
        s3 = "Sanx";
        s4 = "Sanket";
        String s5 = "San";
        String s6 = "sanket";
        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s1.compareTo(s3));   // Lexigographically comparison
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo(s5));   // *
        System.out.println(s1.compareTo(s6));   // Case Sensitive

        // Method - 12 ==>  Lexigographically comparison without Case Sensitive by comareToIgnoreCase() method 
        System.out.println("*** Method - 12 ***");
        System.out.println(s1.compareToIgnoreCase(s6));   // NOT Case Sensitive

        // Method - 13 ==>  To check Is String empty or not empty by isEmpty() method
        System.out.println("*** Method - 13 ***");
        s3 = "";
        String s7 = new String();
        s4 = null;
        System.out.println(s3.isEmpty());
        System.out.println(s3.isEmpty());
        System.out.println(s2.isEmpty());
        // System.out.println(s4.isEmpty());    It is null NOT Empty?. So ==> Exception in thread "main" java.lang.NullPointerException

        // Method - 14 ==>  To check Is String starts with given String? by startsWith() method
        System.out.println("*** Method - 14 ***");
        System.out.println(s1);
        System.out.println(s1.startsWith("San"));
        System.out.println(s1.startsWith("Sanx"));
        System.out.println(s1.startsWith("Ahi"));
        System.out.println(s1.startsWith("san"));   // Case sensitive
        System.out.println(s1.startsWith("S"));
        // System.out.println(s1.startsWith('S'));  // Only allowed for " " because formal parameter's type is String. So ==> error: incompatible types: char cannot be converted to String

        // Method - 15 ==>  To check Is String ends with given String? by endsWith() method
        System.out.println("*** Method - 15 ***");
        System.out.println(s1);
        System.out.println(s1.endsWith("ket"));
        System.out.println(s1.endsWith("Ket")); // Case sensitive
        System.out.println(s1.endsWith("xet"));
        System.out.println(s1.endsWith("t"));
        // System.out.println(s1.endsWith('t'));    // Only allowed for " " because formal parameter's type is String. So ==> error: incompatible types: char cannot be converted to String

        // Method - 16 ==> To remove white spaces at Starting and Ending of String by trim() method
        System.out.println("*** Method - 16 ***");
        s3 = "   Mah   aras   htra   ";
        System.out.println(s3);
        System.out.println(s3.length());
        s4 = s3.trim();
        System.out.println(s4);
        System.out.println(s4.length());

        // Method - 17 ==> To take substring from given index by using substring() method
        System.out.println("*** Method - 17 ***");
        System.out.println(s1);
        System.out.println(s1.substring(2));
        // System.out.println(s1.substring(12));   // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -6

        // Method - 18 ==>  To take substring between given index by using substring() method
        System.out.println("*** Method - 18 ***");
        System.out.println(s1);
        System.out.println(s1.substring(2,4));

        // Method - 19 ==> To replace old character by new using replace() method
        System.out.println("*** Method - 19 ***");
        System.out.println(s1);
        s3 = s1.replace('a','X');
        System.out.println(s3);
        s3 = s1.replace('g','X');
        System.out.println(s3);
        s3 = s1.replace('s','X');
        System.out.println(s3);     // Case Sensitive

        // Method - 20 ==>  To replace old string by new using replace() method
        System.out.println("*** Method - 20 ***");
        System.out.println(s1);
        s3 = s1.replace("an","XYZ");
        System.out.println(s3);
        s3 = s1.replace("abx","XYZ");
        System.out.println(s3);
        s3 = s1.replace("san","XYZ");
        System.out.println(s3);     // Case Sensitive

        // Method - 21 ==>  
        System.out.println("*** Method - 21 ***");

        // Method - 22 ==> 
        System.out.println("*** Method - 22 ***");
    }
}