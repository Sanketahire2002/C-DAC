import java.util.Scanner;

public class RetailMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiscountCalculator discountCalculator = null;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Discount Calculator");
            System.out.println("2. View Final Price Details");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Purchase Amount: ");
                    double amt = sc.nextDouble();
                    System.out.print("Enter Discount: ");
                    double dis = sc.nextDouble();

                    discountCalculator = new DiscountCalculator(amt, dis);
                    System.out.println("Discount Calculator created successfully!");
                    break;
                case 2:
                    if (discountCalculator != null) {
                        System.out.println(discountCalculator.toString());
                    } else {
                        System.out.println("No calculator found. Please create one first.");
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
