package OOP;

public class PolymorphismExample {
    public static void main(String[] args) {
        Vehicle2 car2 = new Car2();
        Vehicle2 bike = new Bike();
        Vehicle2 boat = new Boat();

        car2.go();
        bike.go();
        boat.go();
    }
}

class Boat extends Vehicle2 {
    @Override
    public void go() {
        System.out.println("Boat is running");
    }
}

class Bike extends Vehicle2 {
    @Override
    public void go() {
        System.out.println("Bike is running");
    }
}

class Car2 extends Vehicle2 {
    @Override
    public void go() {
        System.out.println("Car is running");
    }
}

abstract class Vehicle2 {
    abstract void go();
}
