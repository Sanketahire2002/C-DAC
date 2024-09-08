import java.util.Scanner;

public class LoanMain {
    public static void main(String[] args) {
        System.out.println(LoanAmortizationCalculator.msg);
        System.out.println(LoanAmortizationCalculator.msg_2);

        Scanner sc = new Scanner(System.in);

        // Menu-driven program
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Loan");
            System.out.println("2. View Loan Details");
            System.out.println("3. Modify Loan Details");
            System.out.println("4. Calculate Monthly Payment");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Create Loan
                    System.out.print("Please enter Principal Amount (in Rs.): ");
                    double principal = sc.nextDouble();
                    System.out.print("Please enter Interest rate: ");
                    double interest = sc.nextDouble();
                    System.out.print("Please enter Loan term (in years): ");
                    int time = sc.nextInt();
                    LoanAmortizationCalculator loan = new LoanAmortizationCalculator(principal, interest, time);
                    System.out.println("Loan created successfully!");
                    break;
                case 2:
                    // View Loan Details
                    if (loan != null) {
                        System.out.println(loan.toString());
                    } else {
                        System.out.println("No loan found. Please create a loan first.");
                    }
                    break;
                case 3:
                    // Modify Loan Details
                    if (loan != null) {
                        System.out.print("Enter new Principal Amount (in Rs.): ");
                        principal = sc.nextDouble();
                        loan.setPrincipal(principal);

                        System.out.print("Enter new Interest rate: ");
                        interest = sc.nextDouble();
                        loan.setInterest(interest);

                        System.out.print("Enter new Loan term (in years): ");
                        time = sc.nextInt();
                        loan.setTime(time);

                        System.out.println("Loan details updated successfully!");
                    } else {
                        System.out.println("No loan found. Please create a loan first.");
                    }
                    break;
                case 4:
                    // Calculate Monthly Payment
                    if (loan != null) {
                        System.out.println("Monthly Payment: Rs. " + loan.calculateMonthlyPayment());
                    } else {
                        System.out.println("No loan found. Please create a loan first.");
                    }
                    break;
                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
