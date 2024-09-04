import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        System.out.print("Enter the number corresponding to your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                double circleArea = 3.1415 * radius * radius;
                System.out.println("The area of the circle is: " + circleArea);
                break;
            case 2:
                System.out.print("Enter the side length of the square: ");
                double side = sc.nextDouble();
                double squareArea = side * side;
                System.out.println("The area of the square is: " + squareArea);
                break;
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = sc.nextDouble();
                double rectangleArea = length * width;
                System.out.println("The area of the rectangle is: " + rectangleArea);
                break;
            case 4:
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("The area of the triangle is: " + triangleArea);
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                break;
        }

        sc.close();
    }
}
