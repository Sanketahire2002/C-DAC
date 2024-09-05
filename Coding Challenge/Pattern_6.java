public class Pattern_6 
{
    public static void main(String[] args) 
    {
        int r = 6;

        for (int i = 1; i <= r; i++) 
        {
            for (int j = i; j < r; j++) 
            {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j);
            }
            
            for (int j = i - 1; j >= 1; j--) 
            {
                System.out.print(j);
            }            
            System.out.println();
        }

        for(int i = r-1; i >= 1; i--)
        {
            for(int j = r; j > i; j--)
            {
                System.out.print(" ");
            }
            
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }

            for(int j = i-1; j >=1 ;j--)
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}