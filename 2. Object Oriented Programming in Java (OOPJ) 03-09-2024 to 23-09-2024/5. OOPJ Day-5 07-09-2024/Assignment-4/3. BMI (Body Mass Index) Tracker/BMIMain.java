import java.util.Scanner;

public class BMIMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BMITracker bmi = null;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create BMI Tracker");
            System.out.println("2. View BMI Details");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Weight (in kg): ");
                    float weight = sc.nextFloat();
                    System.out.print("Enter Height (in meters): ");
                    float height = sc.nextFloat();

                    bmi = new BMITracker(weight, height);
                    bmi.calculate();
                    System.out.println("BMI Tracker created successfully!");
                    break;
                case 2:
                    if (bmi != null) {
                        System.out.println(bmi.toString());
                    } else {
                        System.out.println("No BMI tracker found. Please create one first.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
