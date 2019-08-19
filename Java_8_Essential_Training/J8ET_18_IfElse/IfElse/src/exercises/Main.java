// Project that builds on Lynda.com Java 8 Essential Training exercise on if else statements

/*
 * Requests user input, uses if else statements to compare input to conditions, and prints message based on which condition is met.
 */
package exercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Creates an object of the Scanner class with new constructor method and passes system input.
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the current month? (Enter number).");
        int monthNumber = scanner.nextInt();
        System.out.println("");

        // int monthNumber = 8;

        if (monthNumber >= 1 && monthNumber <= 3) {
            System.out.println("You're in Q1.");
        } else if (monthNumber >= 4 && monthNumber <= 6) {
            System.out.println("You're in Q2.");
        } else if (monthNumber >= 7 && monthNumber <=9) {
            System.out.println("You're in Q3.");
        } else if (monthNumber >= 10 && monthNumber <= 12) {
            System.out.println("You're in Q4.");
        } else {
            System.out.println("That month doesn't exist!");
        }
    }
}
