/**
 * Student Name: Igboasia Stanley
 * Matriculation Number: 25/17264
 * Programme: Computer Science
 * Course: COS 201 - Computer Programming I
 * Week 3 Assignment: Item Cost Calculator
 */

import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== COS 201 Item Cost Calculator ===");
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter unit price (NGN): ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity purchased: ");
        int quantity = scanner.nextInt();

        double totalCost = unitPrice * quantity;

        System.out.println("\n--- Purchase Summary ---");
        System.out.println("Item: " + itemName);
        System.out.println("Unit Price: NGN " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: NGN " + totalCost);

        scanner.close();
    }
          }
