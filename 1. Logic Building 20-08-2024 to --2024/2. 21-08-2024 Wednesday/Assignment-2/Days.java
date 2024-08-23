import java.util.Scanner;

class Days
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) to represent a day of the week: ");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                System.out.println("Weekday");
                break;
            case 2:
                System.out.println("Tuesday");
                System.out.println("Weekday");
                break;
            case 3:
                System.out.println("Wednesday");
                System.out.println("Weekday");
                break;
            case 4:
                System.out.println("Thursday");
                System.out.println("Weekday");
                break;
            case 5:
                System.out.println("Friday");
                System.out.println("Weekday");
                break;
            case 6:
                System.out.println("Saturday");
                System.out.println("Weekend");
                break;
            case 7:
                System.out.println("Sunday");
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                break;
        }
    }
}
