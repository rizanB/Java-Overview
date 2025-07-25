package basic;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("---Compound Interest Calculator---");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principle amount: ");
        double principle = scanner.nextDouble();
        System.out.println("Enter the years: ");
        double years = scanner.nextDouble();
        System.out.println("Enter the rate: ");
        double rate = scanner.nextDouble();

        double interest = principle * (1 + Math.pow((rate/years), (years * rate)) );
        System.out.printf("Your interest is: %.2f", interest);

        scanner.close();
    }
}
