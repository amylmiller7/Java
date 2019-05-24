// Project that builds on Lynda.com Java 8 Essential Training exercise on switch statements

/*
 * Requests user input, uses switch statements to compare input to conditions, and prints message based on that input.
 */
package exercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* method #1
        // Creates instance of Scanner classScanner object and passes input from user.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a month name: ");
        // Creates variable set to call nextLine method on the Scanner object.
        String input = sc.nextLine();

        // Uses switch statement checks month name input and calls method based on the type.
        switch (input) {
            case "Jan":
                System.out.println("You input the first month.");
                break;
            case "Feb":
                System.out.println("You input the second month.");
                break;
            case "Mar":
                System.out.println("You input the third month.");
                break;
            default:
                System.out.println("You chose another month!");
        }
        */

        // method #2
        // Creates an object of the Scanner class with new constructor method and passes system input.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = sc.nextLine();
        int monthNumber = Integer.parseInt(input);
        System.out.println("");

        switch (monthNumber) {
            case 1:
                System.out.println("This corresponds to January.");
                break;
            case 2:
                System.out.println("This corresponds to February.");
                break;
            case 3:
                System.out.println("This corresponds to March.");
                break;
            case 4:
                System.out.println("This corresponds to April.");
                break;
            case 5:
                System.out.println("This corresponds to May.");
                break;
            case 6:
                System.out.println("This corresponds to June.");
                break;
            case 7:
                System.out.println("This corresponds to July.");
                break;
            case 8:
                System.out.println("This corresponds to August.");
                break;
            case 9:
                System.out.println("This corresponds to September.");
                break;
            case 10:
                System.out.println("This corresponds to October.");
                break;
            case 11:
                System.out.println("This corresponds to November.");
                break;
            case 12:
                System.out.println("This corresponds to December.");
                break;
            default:
                System.out.println("This number doesn't correspond to any month!");
        }
    }
}
