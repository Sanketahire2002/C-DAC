public class BMITracker {
    private float weight;
    private float height;
    private float BMI;

    // Constructor
    public BMITracker(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    // Getter and Setter methods
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // Method to calculate BMI
    public void calculate() {
        this.BMI = this.weight / (this.height * this.height);
    }

    // Method to display the BMI result
    public String getResult() {
        if (BMI < 18.5) {
            return "Underweight";
        } else if (BMI >= 18.5 && BMI < 24.9) {
            return "Normal weight";
        } else if (BMI >= 25 && BMI < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // toString method to display BMI details
    @Override
    public String toString() {
        return "BMI Details:\n" +
               "Weight: " + weight + " kg\n" +
               "Height: " + height + " meters\n" +
               "BMI: " + BMI + "\n" +
               "Category: " + getResult();
    }
}
