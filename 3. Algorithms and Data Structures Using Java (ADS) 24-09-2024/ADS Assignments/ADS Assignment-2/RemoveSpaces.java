import java.util.Scanner;

public class RemoveSpaces {
    public static String removeSpaces(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeSpaces(str));
    }
}
