public class Pattern_9 {
    public static void main(String[] args) {
        int start = 5;

        for (int i = 0; i < start; i++) {
            for (int j = start; j > i; j--) {
                System.out.print(j);
                if (j > i + 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
