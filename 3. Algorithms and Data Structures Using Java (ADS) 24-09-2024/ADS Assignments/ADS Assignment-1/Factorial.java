import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
