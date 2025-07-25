package basic;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("---- Method Overloading Example ----");

        System.out.println(add(2,3));
        System.out.println(add(1,2,3));

    }

    static double add(int a, int b) {
        return a + b;
    }

    static double add(int a, int b, int c) {
        return a + b + c;
    }
}
