import java.util.Scanner;

public class MadLibs {
    public  static void main(String[] args) {
        System.out.println("---Welcome to the Mad Libs game---");
        Scanner scanner = new Scanner(System.in);

        String name;
        String home;
        int age;
        String feeling;

        System.out.println("What's your name?");
        name = scanner.nextLine();
        System.out.println("Your Location?");
        home = scanner.nextLine();
        System.out.println("How you feeling now?");
        feeling = scanner.nextLine();
        System.out.println("How old are you?");
        age = scanner.nextInt();

        System.out.print("Hello, "+name +"Since you're already "+ age +"years, and living at "+home +" That's a good feeling of being "+feeling);

        scanner.close();
    }
}
