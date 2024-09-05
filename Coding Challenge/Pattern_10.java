public class Pattern_10
{
    public static void main(String[] args) 
    {
        int r = 7;

        for(int i = 1; i <= ((r+1)/2); i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print((i * j) + " ");
            }

            System.out.println();
        }

        for(int i = (((r+1)/2) + 1); i <= r; i++)
        {
            for(int j = 1; j <= (r-i+1); j++)
            {
                System.out.print((j * i) + " ");
            }

            System.out.println();
        }
    }
}