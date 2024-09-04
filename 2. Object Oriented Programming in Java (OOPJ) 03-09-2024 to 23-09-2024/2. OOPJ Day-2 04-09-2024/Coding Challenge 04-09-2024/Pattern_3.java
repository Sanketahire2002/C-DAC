public class Pattern_3 
{
    public static void main(String[] args) 
    {
        int rows = 5;
        char ch = 'A';

        for (int i = 1; i <= rows; i++) 
        {
            for (int j = i; j < rows; j++) 
            {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (2 * i - 1); j++) 
            {
                System.out.print(ch);
                ch++;
            }
            if(ch != 'Z')
                System.out.println();
        }
        System.out.println(ch);
    }
}
