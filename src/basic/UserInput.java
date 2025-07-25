import java.lang.foreign.SymbolLookup;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you age: ");
        int age = scanner.nextInt();
        if(age >= 18) {
            System.out.println("You're eligible to vote.");
        } else {
            System.out.println("You're under 18, so can't vote!");
        }

        scanner.close();
    }
}
