import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        char result = findFirstNonRepeatedCharacter(input);
        if (result != '\0') {
            System.out.println("First non-repeated character: '" + result + "'");
        } else {
            System.out.println("No non-repeated character found.");
        }
    }

    public static char findFirstNonRepeatedCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isRepeated = false;
            
            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                return currentChar;
            }
        }
        return '\0';
    }
}
