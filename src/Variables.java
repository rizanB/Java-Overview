import java.util.HashMap;
import java.util.Map;

public class Variables {
    public static void main(String[] args) {
        // There are two types of variables

        // PRIMITIVE - simple values stored directly on memory (Stack)
        // REFERENCE - memory address (stack) that points to --> Heap

        int year = 2025;
        System.out.print("The year is "+year+"\n");

        double gpa = 3.6;
        System.out.println("Your GPA is "+gpa);

        boolean isStudent = true;
        System.out.println(isStudent);


        //  Reference Variables
        String name = "Roshan";
        System.out.println(name);

        // This explains about the arrays
        String[] cars = {"Mercedes", "Volvo", "Lambo"};
        System.out.println(cars[0]);

    }
}
