public class CompoundInterestCalculator {
    private float principal;
    private float interest;
    private int time;
    private int invest;

    // Constructor
    public CompoundInterestCalculator(float principal, float interest, int time, int invest) {
        this.principal = principal;
        this.interest = interest;
        this.time = time;
        this.invest = invest;
    }

    // Getter and Setter methods
    public float getPrincipal() {
        return principal;
    }

    public void setPrincipal(float principal) {
        this.principal = principal;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getInvest() {
        return invest;
    }

    public void setInvest(int invest) {
        this.invest = invest;
    }

    // Method to calculate compound interest
    public float calculate() {
        float futureValue = (float) (principal * Math.pow((1 + ((interest / 100) / time)), (invest * time)));
        return futureValue - principal;
    }

    // toString method to display details
    @Override
    public String toString() {
        return "Compound Interest Details:\n" +
               "Principal: Rs. " + principal + "\n" +
               "Interest Rate: " + interest + "%\n" +
               "Time: " + time + " years\n" +
               "Investment Period: " + invest + " years\n" +
               "Compound Interest: Rs. " + calculate();
    }
}
