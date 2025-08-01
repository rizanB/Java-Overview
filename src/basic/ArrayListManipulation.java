package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayListManipulation {
    public static void main(String[] args) {
        System.out.println("---- Array List Manipulation ----");

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Mercedes");
        System.out.println(cars);
        cars.add("Lamborghini");

        cars.set(0, "Jaguar"); // replaces the item
        System.out.println(cars);

        cars.removeFirst(); // removing first item
        cars.remove(0); // removing at index
        cars.clear(); // clearing up all the items

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars); // sorts the item; this method is available in Collections util

        System.out.println("Sorted list: "+cars);

        // can be inferred to List although its ArrayList() itself
        List<String> fruits = cars;
        System.out.println(fruits);
        System.out.println("type of fruits: " + fruits.getClass().getSimpleName());
    }

}
