package basic;

import java.util.Arrays;

public class ArraysManipulation {
    public static void main(String[] args) {
        System.out.println("---- Working with Arrays ----");

        String[] fruits = {"apple", "banana", "coconut"};


        // Perform CRUD Operations
        String f = "Orange";
        fruits = appendToArray(fruits, f);
        System.out.println(fruits[fruits.length - 1]);

        String[] modifiedArrays = removeItem(fruits);
        System.out.printf("Cleared array: %s", modifiedArrays[modifiedArrays.length -1]);

    }

    private  static <T> T[] appendToArray(T[] originalArray, T newItem) {
        T[] newArray = java.util.Arrays.copyOf(originalArray ,originalArray.length +1);
        newArray[originalArray.length] = newItem;
        return newArray;
    }

    private  static <T> T[] removeItem(T[] originalArray) {
        T[] newArray;
        newArray = Arrays.copyOfRange(originalArray, 0, originalArray.length-2);
        return newArray;
    }
}
