import java.util.Scanner;

class Discount
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total purchase amount: ");
        double totalAmount = scanner.nextDouble();

        System.out.print("Do you have a membership card? (yes/no): ");
        String hasMembership = scanner.next().toLowerCase();

        double discount;

        if (totalAmount >= 1000) {
            discount = 20;
        } else if (totalAmount >= 500) {
            discount = 10;
        } else {
            discount = 5;
        }

        if (hasMembership.equals("yes")) {
            discount += 5;
        }

        double discountAmount = (discount / 100) * totalAmount;
        double finalAmount = totalAmount - discountAmount;

        System.out.println("Discount applied: " + discount + "%");
        System.out.println("Discount amount: Rs. " + discountAmount);
        System.out.println("Final amount after discount: Rs. " + finalAmount);
    }
}
