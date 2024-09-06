public class TollMain
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("No. of Car Passed: ");
        int car = sc.nextInt();
        System.out.print("No. of Trucks Passed: ");
        int truck = sc.nextInt();
        System.out.print("No. of Motorcycle Passed: ");
        int motor = sc.nextInt();
        System.out.print("Toll for Car: ");
        int toll_car = sc.nextInt();
        System.out.print("Toll for Trucks: ");
        int toll_truck = sc.nextInt();
        System.out.print("Toll for Motorcycle: ");
        int toll_motor = sc.nextInt();

        TollBoothRevenueManager tbr = new TollBoothRevenueManager();
        tbr.setValues(car,truck,motor);
        tbr.setToll(toll_car,toll_truck,toll_motor);
        tbr.calculate();
        tbr.display();

        sc.close();
    }
}

class TollBoothRevenueManager
{
    int car, truck, motor, toll_car, toll_truck, toll_motor, rate_car, rate_truck, rate_motor;

    TollBoothRevenueManager()
    {
        System.out.println("***********************************");
        System.out.println("********** Welcome .... ***********");
        System.out.println("********** Sanket Ahire ***********");
        System.out.println("***********************************");
    }

    void setValues(int car, int truck, int motor)
    {
        this.car = car;
        this.truck = truck;
        this.motor = motor;
        this.toll_car = toll_car;
        this.toll_truck = toll_truck;
        this.toll_motor = toll_motor;
    }

    void setToll(int toll_car, int toll_truck, int toll_motor)
    {
        this.toll_car = toll_car;
        this.toll_truck = toll_truck;
        this.toll_motor = toll_motor;
    }

    void calculate()
    {
        this.rate_car = car * toll_car;
        this.rate_truck = truck * toll_truck;
        this.rate_motor = motor * toll_motor;
    }

    void display()
    {
        System.out.println("***********************************");
        System.out.println("********** Total Revenue **********");

        System.out.printf("Car : %-20d\n",rate_car);
        System.out.printf("Truck : %-20d\n",rate_truck);
        System.out.printf("Motorcycle : %-20d\n",rate_motor);

        System.out.println("***********************************");
        System.out.println("***********************************");
    }
}