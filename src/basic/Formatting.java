public class Formatting {
    public static void main(String[] args) {
        System.out.println("---Using printf() to format strings");

        int age = 10;
        char result = 'A';
        double weight = 72.2;

        System.out.printf("Hello I'm %d years old. I got %S in my result. I'm %.1f KG", age, result, weight);
    }
}
