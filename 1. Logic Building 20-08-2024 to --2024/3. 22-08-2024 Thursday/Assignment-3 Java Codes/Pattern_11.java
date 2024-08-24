public class Pattern_11 {
    public static void main(String[] args) {
        int maxStars = 9;
        int mid = maxStars / 2;

        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = maxStars - 2 * i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = maxStars - 2 * i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
