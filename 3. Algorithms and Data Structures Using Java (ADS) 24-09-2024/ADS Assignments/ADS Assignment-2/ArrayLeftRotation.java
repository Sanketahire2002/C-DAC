import java.util.Arrays;

public class ArrayLeftRotation {

    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }

        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int d1 = 2;
        rotateLeft(arr1, d1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {10, 20, 30, 40};
        int d2 = 1;
        rotateLeft(arr2, d2);
        System.out.println(Arrays.toString(arr2));
    }
}
