public class Pattern_8
{
    public static void main(String[] args) 
    {
        int r = 6;

        for(int i = 0; i < 6; i++)
        {
            for(int j = r-i; j < r; j++)
            {
                System.out.print(j);
            }

            System.out.print(0);

            for(int j = r-1; j >= r-i; j--)
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}