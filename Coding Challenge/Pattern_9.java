public class Pattern_9
{
    public static void main(String[] args) 
    {
        int r = 9;

        for(int i = 1; i <= r; i++)
        {
            for(int j = 1; j <= r-i; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }

            System.out.print(" * 8 + "+i+" = ");

            for(int j = r; j > r-i ; j--)
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}