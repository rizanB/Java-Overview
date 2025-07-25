package OOP;

public class ReflectionsExample {
    Class truck = Class.forName("OOP.Vehicle");

    Class car = Vehicle.class;

    public ReflectionsExample() throws ClassNotFoundException {
    }
}

class Vehicle {
    String type;
    int year;

    Vehicle(String type, int year) {
        this.type = type;
        this.year = year;
    }
}
