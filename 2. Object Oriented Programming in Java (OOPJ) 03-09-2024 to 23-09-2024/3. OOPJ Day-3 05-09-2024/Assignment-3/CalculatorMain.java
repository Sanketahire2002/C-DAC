import java.util.Scanner;

public class CalculatorMain
{
    public static void main(String[] args)
    {
        CompoundInterestCalculator cic = new CompoundInterestCalculator();

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter Principal Amount (in Rs.): ");
        float principal = sc.nextFloat();
        System.out.print("Please enter Interest rate: ");
        float interest = sc.nextFloat();
        System.out.print("Please enter Loan tern (in year): ");
        int time = sc.nextInt();
        System.out.print("Please enter Investment (in year): ");
        int invest = sc.nextInt();

        cic.setValue(principal, interest, time, invest);
        System.out.println(cic.calculate());

        sc.close();
    }
}

class CompoundInterestCalculator
{
    float principal, interest;
    int time, invest;

    void setValue(float principal, float interest, int time, int invest)
    {
        this.principal = principal;
        this.interest = interest;
        this.time = time;
        this.invest = invest;
    }

    float calculate()
    {
        float futureValue = (float) (principal * Math.pow((1+((interest/100)/time)),(invest*time)));
        float total = futureValue - principal;
        return total;
    }
}