package OOP;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        // Attributes
        System.out.println(car.make);
        System.out.println(car.name);
        System.out.println(car.year);
        System.out.println(car.isRunning);

        // Methods
        car.startCar();
        car.stopCar();
        car.service();
    }
}
