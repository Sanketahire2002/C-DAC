import java.util.Scanner;

public class LeapYear 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a year: ");
        int y = sc.nextInt();

        if (y % 4 == 0) 
        {
            if (y % 100 == 0) 
            {
                if (y % 400 == 0) 
                {
                    System.out.println(y + " is a leap year.");
                } 
                else 
                {
                    System.out.println(y + " is not a leap year.");
                }
            } 
            else 
            {
                System.out.println(y + " is a leap year.");
            }
        } 
        else 
        {
            System.out.println(y + " is not a leap year.");
        }

        switch (y % 4) 
        {
            case 0:
                switch (y % 100) 
                {
                    case 0:
                        switch (y % 400) 
                        {
                            case 0:
                                System.out.println(y + " is a leap year.");
                                break;
                            default:
                                System.out.println(y + " is not a leap year.");
                        }
                        break;
                    default:
                        System.out.println(y + " is a leap year.");
                }
                break;
            default:
                System.out.println(y + " is not a leap year.");
        }

        sc.close();
    }
}
