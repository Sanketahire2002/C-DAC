public class DiscountCalculator {
    private double amt;
    private double dis;
    private double finalPrice;

    // Constructor
    public DiscountCalculator(double amt, double dis) {
        this.amt = amt;
        this.dis = dis;
        calculate();  // Automatically calculate final price upon initialization
    }

    // Getter and Setter methods
    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
        calculate();  // Recalculate final price if amount changes
    }

    public double getDis() {
        return dis;
    }

    public void setDis(double dis) {
        this.dis = dis;
        calculate();  // Recalculate final price if discount changes
    }

    // Method to calculate the final price after discount
    private void calculate() {
        this.finalPrice = amt - (amt * (dis / 100));
    }

    // Method to display the final price
    public double getFinalPrice() {
        return finalPrice;
    }

    // toString method to display details
    @Override
    public String toString() {
        return "Purchase Amount: Rs. " + amt + "\n" +
               "Discount: " + dis + "%\n" +
               "Final Price after Discount: Rs. " + finalPrice;
    }
}
