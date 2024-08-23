class SumNatural
{
    public static void main(String[] args) 
    {
        int sum = 0;

        for (int i = 1; i <= 50; i++) 
        {
            sum += i;
        }

        System.out.println("The sum of the first 50 natural numbers is: " + sum);
    }
}
