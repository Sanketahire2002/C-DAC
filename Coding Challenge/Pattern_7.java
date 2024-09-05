public class Pattern_7
{
    public static void main(String[] args) 
    {
        int r = 5;

        for(int i = 1; i <= r; i++)
        {
            for(int j=1; j<= i; j++)
            {
                System.out.print(j);
            }

            for(int j = 1; j <= ((r * 2)-(2 * i - 1)); j++)
            {
                System.out.print(" ");
            }

            for(int j=i; j>= 1; j--)
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}