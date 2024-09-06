public class BMIMain
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Weight (in kg): ");
        float weight = sc.nextFloat();
        System.out.print("Enter Height (in meters): ");
        float height = sc.nextFloat();

        BMITracker bmi = new BMITracker();
        bmi.setValue(weight, height);
        bmi.calculate();
        bmi.result();
    }
}

class BMITracker
{
    float weight, height, BMI;
    int category;

    void setValue(float weight, float height)
    {
        this.weight = weight;
        this.height = height;
    }

    void calculate()
    {
        this.BMI = this.weight / (this.height * this.height);
    }

    void result()
    {
        System.out.println("BMI: "+BMI);
        System.out.print("Result: ");
        if(BMI < 18.5)
            System.out.println("Underweight");
        else if(BMI >= 18.5 && BMI < 24.9)
            System.out.println("Normal weight");
        else if(BMI <= 25 && BMI < 29.9)
            System.out.println("Overweight");
        else 
            System.out.println("Obese");
    }
}