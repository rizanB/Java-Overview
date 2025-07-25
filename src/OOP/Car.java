package OOP;

public class Car {
    String make = "Ford";
    String name = "Mustang";
    int year = 2025;
    boolean isRunning = false;

    void startCar() {
        System.out.println("You started car.");
    }

    void stopCar() {
        System.out.println("You turned off the engine.");
    }

    void service() {
        System.out.println("Car is driven down for servicing.");
    }
}
