class Vehicle {
    public void startEngine() {
        System.out.println("Vehicle engine is starting...");
    }

    public void stopEngine() {
        System.out.println("Vehicle engine is stopping...");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine is starting with a roar...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine is stopping with a smooth purr...");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine is starting with a vroom...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine is stopping with a gentle hum...");
    }
}

public class VehicleMainClass {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();

        myCar.startEngine();
        myCar.stopEngine();

        myMotorcycle.startEngine();
        myMotorcycle.stopEngine();
    }
}
