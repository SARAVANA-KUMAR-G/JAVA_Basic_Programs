package basics; // My Package

import java.util.Scanner;

public class shopping_cart_program {
    public static void main(String[] args) {
        System.out.println("");

        // Shopping Cart Program

        String itemName;
        double price;
        int quantity;
        double total;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of an item: ");
        itemName = scanner.nextLine();

        System.out.print("Enter the Price of the item: ");
        price = scanner.nextDouble();

        System.out.print("How many do you want? : ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("");
        System.out.println("You ordered " + quantity + " " + itemName + " and the total is Rs." + total);

        System.out.println("");
        scanner.close();
    }
}
