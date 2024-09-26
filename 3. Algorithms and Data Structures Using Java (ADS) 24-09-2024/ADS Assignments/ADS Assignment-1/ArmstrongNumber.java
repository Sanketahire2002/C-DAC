import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = 0;
        
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        temp = num;
        while (temp != 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp /= 10;
        }

        return sum == originalNum;
    }
}
