import java.util.Scanner;

public class Student
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the score for Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter the score for Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter the score for Subject 3: ");
        int subject3 = scanner.nextInt();

        int failCount = 0;

        switch (subject1) {
            default:
                if (subject1 <= 40) {
                    failCount++;
                }
                break;
        }

        switch (subject2) {
            default:
                if (subject2 <= 40) {
                    failCount++;
                }
                break;
        }

        switch (subject3) {
            default:
                if (subject3 <= 40) {
                    failCount++;
                }
                break;
        }

        if (failCount == 0) 
        {
            System.out.println("The student has passed in all subjects.");
        }
        else 
        {
            System.out.println("The student has failed in " + failCount + " subject(s).");
        }
    }
}
