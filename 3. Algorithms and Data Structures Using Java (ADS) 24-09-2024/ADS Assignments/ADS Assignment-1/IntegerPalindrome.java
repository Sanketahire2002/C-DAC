import java.util.Scanner;

public class IntegerPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        boolean isPalindrome = checkPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + isPalindrome);
    }

    public static boolean checkPalindrome(int number) {
        if (number < 0) {
            return false; 
        }
        
        int original = number;
        int reversed = 0;
        
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        
        return original == reversed;
    }
}
