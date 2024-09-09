public class LoanAmortizationCalculator {
    static String msg = "Welcome to Bank ....";
    static String msg_2 = "**** Sanket Ahire ****";

    private double principal;
    private double interest;
    private int time;

    // Constructor
    public LoanAmortizationCalculator(double principal, double interest, int time) {
        this.principal = principal;
        this.interest = interest;
        this.time = time;
    }

    // Getter and Setter methods
    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    // Method to calculate monthly payment
    public double calculateMonthlyPayment() {
        double monthlyInterestRate = interest / 12 / 100;
        int numberOfMonths = time * 12;

        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) 
                / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    // toString method to display loan details
    @Override
    public String toString() {
        return "Loan Details:\n" +
               "Principal: " + principal + "\n" +
               "Interest Rate: " + interest + "%\n" +
               "Time: " + time + " years\n" +
               "Monthly Payment: Rs. " + calculateMonthlyPayment();
    }
}
