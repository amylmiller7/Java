// Project that builds on Lynda.com Java 8 Essential Training exercise challenge: Simple Calculator

/*
 * Creates a calculator that takes user input for numbers, adds numbers, and prints result.
 * Uses a single class for all methods and BigDecimal to return accurate mathematical results.
 */
package exercises;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        // #1 method: Interprets user input as double data type.
        // See also http://pages.cs.wisc.edu/~hasti/cs368/JavaTutorial/NOTES/JavaIO_Scanner.html
        // Imprecise result

        // Creates an object of the Scanner class with new constructor method and passes system input.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value: ");
        // Creates variable of double type, assigned to nextDouble method on scanner object.
        double input1 = scanner.nextDouble();
        System.out.println("Enter another value: ");
        double input2 = scanner.nextDouble();

        // Creates variable of double type, assigned to the sum of the two numbers the user input.
        double sum = input1 + input2;
        System.out.println("The sum of the values you entered: " + sum);
        */


        /* #2 method: Converts user input from string to double.
        // Imprecise result

        // Creates an object of the Scanner class with new constructor method and passes system input.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a numeric value: ");
        // Creates variable of String class, assigned to nextLine method on scanner object.
        String input1 = scanner.nextLine();
        // Uses Double class to parse string into double.
        // Creates variable of the double type, assigned to Double class, and passes user input into parseDouble method.
        double double1 = Double.parseDouble(input1);

        System.out.println("Enter another numeric value: ");
        String input2 = scanner.nextLine();
        double double2 = Double.parseDouble(input2);

        // Creates variable of double type, assigned to the sum of the two numbers the user input.
        double sum = double1 + double2;
        System.out.println("The sum of the values you entered: " + sum);
        */

        // #3 method: Wraps user input (string) with BigDecimal class.
        // Precise result
        // TO DO: Need to add error handling around user input to ensure it is a numeric value.
        // Creates an object of the Scanner class with new constructor method and passes system input.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a numeric value: ");
        String input1 = scanner.nextLine();
        // Creates an object of the BigDecimal class with the new constructor method and passes a string variable.
        BigDecimal convertedValue1 = new BigDecimal(input1);

        System.out.println("Enter another numeric value: ");
        String input2 = scanner.nextLine();
        BigDecimal convertedValue2 = new BigDecimal(input2);

        // Creates variable of BigDecimal type, assigns it to instance of BigDecimal class, and passes instance of
        // BigDecimal class into built-in method, which adds values of instances together.
        BigDecimal sum = convertedValue1.add(convertedValue2);
        System.out.println("The sum of the values you entered is " + sum.toString() + ".");

    }
}
