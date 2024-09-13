class Vehicle {
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }
}

class Car extends Vehicle {
    private String model;

    public Car(String make, int year, String model) {
        super(make, year);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void displayDetails() {
        System.out.println("Make: " + getMake());
        System.out.println("Year: " + getYear());
        System.out.println("Model: " + getModel());
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, "Camry");
        myCar.displayDetails();
    }
}
