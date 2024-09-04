public class Pattern_2 
{
    public static void main(String[] args) 
    {
        int r = 6;
        
        for (int i = r; i >= 1; i--) 
        {           
            for (int j = i; j < r; j++) 
            {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (2 * i - 1); j++) 
            {
                if (j == 1 || j == (2 * i - 1) || i == r) 
                {
                    System.out.print("*");
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
