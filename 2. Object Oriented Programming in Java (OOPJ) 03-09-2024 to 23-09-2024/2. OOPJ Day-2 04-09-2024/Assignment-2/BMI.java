import java.util.Scanner;

public class BMI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height (in meters): ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI: " + bmi);

        if (bmi < 18.5)
            System.out.println("You are underweight.");
        else if (bmi >= 18.5 && bmi < 24.9)
            System.out.println("You have a normal weight.");
        else if (bmi >= 25 && bmi < 29.9)
            System.out.println("You are overweight.");
        else
            System.out.println("You are obese.");

        sc.close();
    }
}
