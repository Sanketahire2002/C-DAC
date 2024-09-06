import java.util.Scanner;

public class LoanMain
{
    public static void main(String[] args)
    {
        System.out.println(LoanAmortizationCalculator.msg);
        System.out.println(LoanAmortizationCalculator.msg_2);
        LoanAmortizationCalculator l = new LoanAmortizationCalculator();

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter Principal Amount (in Rs.): ");
        double principal = sc.nextDouble();
        System.out.print("Please enter Interest rate: ");
        double interest = sc.nextDouble();
        System.out.print("Please enter Loan tern (in year): ");
        int time = sc.nextInt();

        l.setValue(principal, interest, time);
        l.getValue();
        System.out.println(l.calculate());

        sc.close();
    }
}

class LoanAmortizationCalculator
{
    static String msg = "Welcome to Bank ....";
    static String msg_2 = "**** Sanket Ahire ****";

    double principal, interest;
    int time;

    void setValue(double principal, double interest, int time)
    {
        this.principal = principal;
        this.interest = interest;
        this.time = time;
    }

    void getValue()
    {
        System.out.println("******************************");
        System.out.println("Principal: "+principal);
        System.out.println("Interest: "+interest);
        System.out.println("Time: "+time);
        System.out.println("******************************");
    }

    double calculate()
    {
        double monthlyInterestRate = interest / 12 / 100;
        int numberOfMonths = time * 12;

        double monthlyPayment =  principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths))  / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);

        return monthlyPayment;
    }
}