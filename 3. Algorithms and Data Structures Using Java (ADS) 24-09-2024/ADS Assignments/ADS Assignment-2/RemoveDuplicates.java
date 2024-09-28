import java.util.Scanner;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int newLength = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[newLength - 1]) {
                arr[newLength] = arr[i];
                newLength++;
            }
        }
        return newLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = removeDuplicates(arr);
        System.out.println(result);
    }
}
