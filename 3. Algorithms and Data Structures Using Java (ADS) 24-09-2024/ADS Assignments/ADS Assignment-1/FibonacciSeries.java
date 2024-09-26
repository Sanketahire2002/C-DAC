import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        System.out.println("First " + n + " numbers in Fibonacci series:");
        for (int num : fibonacci(n)) {
            System.out.print(num + " ");
        }
    }

    public static int[] fibonacci(int n) {
        int[] fibSeries = new int[n];
        if (n >= 1) {
            fibSeries[0] = 0;
        }
        if (n >= 2) {
            fibSeries[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
        }
        return fibSeries;
    }
}
