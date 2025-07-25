package basic;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy? :");
        String itemName = scanner.nextLine();

        System.out.print("What is the price for each? :");
        double price = scanner.nextDouble();

        System.out.print("How many would you like? :");
        int qty = scanner.nextInt();

        double total = price * qty;
        System.out.println("You have bought "+qty +itemName+ "/s" );
        System.out.println("Your total is $"+total);

        scanner.close();
    }
}
