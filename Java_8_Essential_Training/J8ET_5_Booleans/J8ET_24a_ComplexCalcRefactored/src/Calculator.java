// Project that builds on Lynda.com Java 8 Essential Training exercise challenge: Complex Calculator

/*
 * Creates a calculator that takes user input for numbers and operations, adds exception handling,
 * performs calculations, and outputs results.
 * Uses nested class for getInput method.
 * Refactored content: combined check of operation types and calculations in separate class.
 */
package exercises;

import utilities.MathHelper;
import java.util.Scanner;

/*
 * Calculator class contains the following methods:
 * main method: creates instance of Calculator class and calls calculate method.
 * calculate method: creates instance of InputHelper class, variables for user input, exception handling
 * for numeric values, and calls operation method in the MathHelper class.
 *
 * Nested InputHelper class contains the following methods:
 * getInput method: gets user input and outputs it.
*/
public class Calculator {

    public static void main(String[] args) {
        // Creates an object of the Calculator class with new constructor method.
        Calculator calc = new Calculator();
        // Calls calculate method on new instance of class.
        calc.calculate();
    }

    // Instance method requires an object of its class before it can be called.
    // Private methods only accessible by the class. Best practice.
    private void calculate() {

        // Creates object of InputHelper class with new constructor method.
        InputHelper helper = new InputHelper();
        String input1 = helper.getInput("Enter a value: ");
        String input2 = helper.getInput("Enter another value: ");

        // Uses try catch for exception handling around user input of numeric values.
        try {
            // Converts String input into double values.
            double d = Double.parseDouble(input1);
            double d1 = Double.parseDouble(input2);
        // If not numeric value, outputs customized error message and stops program.
        } catch (NumberFormatException e) {
            System.out.println("You did not enter a numeric value!");
            return;
        }

        String input3 = helper.getInput("Choose the operation type (+, -, *, or /): ");
        // Calls operation method on MathHelper class and passes all user input.
        MathHelper.operation(input1, input2, input3);
    }

    // Nested class.
    class InputHelper {
        // getInput is an instance method of the InputHelper class.
        private String getInput(String prompt) {
            System.out.println(prompt);
            // Creates an object of the Scanner class with new constructor method and passes system input.
            Scanner sc = new Scanner(System.in);
            // Returns user input.
            return sc.nextLine();
        }
    }
}


