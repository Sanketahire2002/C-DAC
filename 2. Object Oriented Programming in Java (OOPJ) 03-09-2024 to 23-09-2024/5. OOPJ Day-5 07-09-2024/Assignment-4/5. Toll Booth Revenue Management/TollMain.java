import java.util.Scanner;

public class TollMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("No. of Cars Passed: ");
        int car = sc.nextInt();
        System.out.print("No. of Trucks Passed: ");
        int truck = sc.nextInt();
        System.out.print("No. of Motorcycles Passed: ");
        int motor = sc.nextInt();
        System.out.print("Toll for Car: ");
        int tollCar = sc.nextInt();
        System.out.print("Toll for Trucks: ");
        int tollTruck = sc.nextInt();
        System.out.print("Toll for Motorcycle: ");
        int tollMotor = sc.nextInt();

        // Using constructor and setter methods
        TollBoothRevenueManager tbrm = new TollBoothRevenueManager();
        tbrm.setCar(car);
        tbrm.setTruck(truck);
        tbrm.setMotor(motor);
        tbrm.setTollCar(tollCar);
        tbrm.setTollTruck(tollTruck);
        tbrm.setTollMotor(tollMotor);

        // Calculating and displaying revenue
        tbrm.calculateRevenue();
        tbrm.displayRevenue();

        // Display object details using toString method
        System.out.println(tbrm.toString());

        sc.close();
    }
}
