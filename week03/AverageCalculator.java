/**
 * Student Name: Igboasia Stanley
 * Matriculation Number: 25/17264
 * Programme: Computer Science
 * Course: COS 201 - Computer Programming I
 * Week 3 Assignment: Average Calculator
 */

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== COS 201 Average Calculator ===");
        System.out.print("How many numbers do you want to calculate the average for? ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a valid count greater than 0.");
        } else {
            double sum = 0;
            for (int i = 1; i <= count; i++) {
                System.out.print("Enter number " + i + ": ");
                double number = scanner.nextDouble();
                sum += number;
            }

            double average = sum / count;
            System.out.println("\nTotal Sum: " + sum);
            System.out.println("Calculated Average: " + average);
        }

        scanner.close();
    }
          }
