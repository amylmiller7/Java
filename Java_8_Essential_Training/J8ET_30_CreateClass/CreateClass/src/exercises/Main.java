// Lynda.com Java 8 Essential Training exercise on creating classes

/*
 * Takes user input for numbers and operations, performs exception handling, performs calculations, and output results.
 */
package exercises;

import exercises.utilities.MathHelper;
import java.util.Scanner;

/*
 * Main class contains the following methods:
 * main method: creates variables for user input, performs exception handling for numeric values, and calls operation method.
 * operation method: checks operation type entered, calls method based on operation type, performs exception handling for input,
 * and outputs result of calculation.
*/
public class Main {

    public static void main(String[] args) {
        String input1 = getInput("Enter a value: ");
        String input2 = getInput("Enter another value: ");

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

        String input3 = getInput("Choose the operation type (+, -, *, or /): ");

        // Calls operation method and passes all user input.
        operation(input1, input2, input3);

    }

    // Private methods only accessible by the class. Best practice.
    private static void operation(String input1, String input2, String input3) {

        // Uses switch statement to check operation type input and calls methods in MathHelper class based on the type.
        // Returns message if no listed operation type input.
        switch (input3) {
            case "+":
                System.out.println(input1 + " added to " + input2 + " is " + MathHelper.add(input1, input2) + ".");
                break;
            case "-":
                System.out.println(input1 + " subtracted from " + input2 + " is " + MathHelper.subtract(input1, input2) + ".");
                break;
            case "*":
                System.out.println(input1 + " multiplied by " + input2 + " is " + MathHelper.multiply(input1, input2) + ".");
                break;
            case "/":
                System.out.println(input1 + " divided by " + input2 + " is " + MathHelper.divide(input1, input2) + ".");
                break;
            default:
                System.out.println("You didn't choose a listed operation type!");
        }
    }

    // Outputs prompt in the console.
    private static String getInput(String prompt) {
        System.out.println(prompt);
        // Creates an object of the Scanner class with new constructor method and passes system input.
        Scanner sc = new Scanner(System.in);
        // Returns user input.
        return sc.nextLine();

    }
    /* imprecise calculations

    static double add(String input1, String input2) {
        double d1 = Double.parseDouble(input1);
        double d2 = Double.parseDouble(input2);
        double result = d1 + d2;
        return result;
    }

    static double subtract(String input1, String input2) {
        double d1 = Double.parseDouble(input1);
        double d2 = Double.parseDouble(input2);
        double result = d1 - d2;
        return result;
    }

    static double multiply(String input1, String input2) {
        double d1 = Double.parseDouble(input1);
        double d2 = Double.parseDouble(input2);
        double result = d1 * d2;
        return result;
    }

    static double divide(String input1, String input2) {
        double d1 = Double.parseDouble(input1);
        double d2 = Double.parseDouble(input2);
        double result = d1 / d2;
        return result;
    }*/
}


