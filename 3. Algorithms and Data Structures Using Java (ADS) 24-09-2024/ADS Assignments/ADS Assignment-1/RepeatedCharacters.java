import java.util.Scanner;

public class RepeatedCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        findRepeatedCharacters(input);
    }

    public static void findRepeatedCharacters(String str) {
        System.out.print("Repeated characters: [");
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isRepeated = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }
            if (isRepeated) {
                System.out.print(currentChar);
                break;
            }
        }
        System.out.println("]");
    }
}
