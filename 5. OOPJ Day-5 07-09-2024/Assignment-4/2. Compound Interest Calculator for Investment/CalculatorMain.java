import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CompoundInterestCalculator cic = null;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Compound Interest Calculator");
            System.out.println("2. View Compound Interest Details");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Please enter Principal Amount (in Rs.): ");
                    float principal = sc.nextFloat();
                    System.out.print("Please enter Interest rate: ");
                    float interest = sc.nextFloat();
                    System.out.print("Please enter Loan term (in years): ");
                    int time = sc.nextInt();
                    System.out.print("Please enter Investment period (in years): ");
                    int invest = sc.nextInt();

                    cic = new CompoundInterestCalculator(principal, interest, time, invest);
                    System.out.println("Compound Interest Calculator created successfully!");
                    break;
                case 2:
                    if (cic != null) {
                        System.out.println(cic.toString());
                    } else {
                        System.out.println("No calculator found. Please create a calculator first.");
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
