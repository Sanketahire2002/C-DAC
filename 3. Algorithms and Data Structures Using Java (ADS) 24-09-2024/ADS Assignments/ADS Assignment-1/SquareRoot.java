import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (x): ");
        int x = sc.nextInt();
        
        System.out.println("Square root of " + x + " is " + integerSqrt(x));
    }

    public static int integerSqrt(int x) {
        if (x < 0) {
            return -1; 
        }
        int result = 0;

        while (result * result <= x) {
            result++;
        }

        return result - 1;
    }
}
