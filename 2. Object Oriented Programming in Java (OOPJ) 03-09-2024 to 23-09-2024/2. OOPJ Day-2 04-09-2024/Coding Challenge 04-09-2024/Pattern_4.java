public class Pattern_4 
{
    public static void main(String[] args) 
    {
        int r = 6; 
        
        for (int i = 1; i <= r; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                if (j == 1 || j == i || i == r) 
                {
                    System.out.print(j);
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
