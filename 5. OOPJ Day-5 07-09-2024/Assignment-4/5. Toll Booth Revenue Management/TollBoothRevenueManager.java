public class TollBoothRevenueManager {
    private int car, truck, motor;
    private int tollCar, tollTruck, tollMotor;
    private int revenueCar, revenueTruck, revenueMotor;

    // Constructor
    public TollBoothRevenueManager() {
        System.out.println("***********************************");
        System.out.println("********** Welcome .... ***********");
        System.out.println("********** Sanket Ahire ***********");
        System.out.println("***********************************");
    }

    // Getter and Setter methods
    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }

    public int getTruck() {
        return truck;
    }

    public void setTruck(int truck) {
        this.truck = truck;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getTollCar() {
        return tollCar;
    }

    public void setTollCar(int tollCar) {
        this.tollCar = tollCar;
    }

    public int getTollTruck() {
        return tollTruck;
    }

    public void setTollTruck(int tollTruck) {
        this.tollTruck = tollTruck;
    }

    public int getTollMotor() {
        return tollMotor;
    }

    public void setTollMotor(int tollMotor) {
        this.tollMotor = tollMotor;
    }

    // Method to calculate the revenue
    public void calculateRevenue() {
        this.revenueCar = car * tollCar;
        this.revenueTruck = truck * tollTruck;
        this.revenueMotor = motor * tollMotor;
    }

    // Method to display the total revenue
    public void displayRevenue() {
        System.out.println("***********************************");
        System.out.println("********** Total Revenue **********");
        System.out.printf("Car : Rs. %-20d\n", revenueCar);
        System.out.printf("Truck : Rs. %-20d\n", revenueTruck);
        System.out.printf("Motorcycle : Rs. %-20d\n", revenueMotor);
        System.out.println("***********************************");
        System.out.println("***********************************");
    }

    // toString method
    @Override
    public String toString() {
        return "TollBoothRevenueManager {" +
               "Car Pass Count=" + car +
               ", Truck Pass Count=" + truck +
               ", Motorcycle Pass Count=" + motor +
               ", Toll for Car= Rs. " + tollCar +
               ", Toll for Truck= Rs. " + tollTruck +
               ", Toll for Motorcycle= Rs. " + tollMotor +
               ", Revenue from Cars= Rs. " + revenueCar +
               ", Revenue from Trucks=
