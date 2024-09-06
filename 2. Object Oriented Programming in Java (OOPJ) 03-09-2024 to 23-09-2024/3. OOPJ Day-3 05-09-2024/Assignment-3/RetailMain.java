public class RetailMain
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter Purchase Amount:");
        double amt = sc.nextDouble();
        System.out.print("Enter Discount:");
        double dis = sc.nextDouble();

        DiscountCalculator d = new DiscountCalculator();
        d.setValue(amt,dis);
        d.calculate();
        System.out.println(d.display());
    }
}

class DiscountCalculator
{
    double amt, dis, finalPrice;

    void setValue(double amt, double dis)
    {
        this.amt = amt;
        this.dis = dis;
    }

    void calculate()
    {
        this.finalPrice = amt - (amt * (dis / 100)); 
    }

    double display()
    {
        return finalPrice;
    }
}