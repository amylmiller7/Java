// Project that builds on Lynda.com Java 8 Essential Training exercise challenge: Complex Calculator

/*
 * Creates a calculator that takes user input for numbers and operations, adds exception handling,
 * performs calculations, and outputs results.
 * Uses a single class for all methods and BigDecimal to return precise calculations.
 */
package exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
 * Main class contains the following methods:
 * main method: creates variables for user input, exception handling for numeric values, and calls operation method.
 * operation method: checks operation type entered, calls method based on operation type, exception handling for input,
 * and outputs result of calculation.
 * getInput method: gets user input and outputs it.
 * add method: uses BigDecimal class to convert input and add converted numbers.
 * subtract method: uses BigDecimal class to convert input and subtract converted numbers.
 * multiply method: uses BigDecimal class to convert input and multiply converted numbers.
 * divide method: uses BigDecimal class to convert input and divide converted numbers.
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
        // If not numeric value, outputs custom error message and stops program.
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

        // Uses switch statement to check operation type input and call method based on the type.
        // Returns message if no listed operation type input.
        switch (input3) {
            case "+":
                System.out.println("Value 1" + " added to " + "value 2" + " is " + add(input1, input2) + ".");
                break;
            case "-":
                System.out.println("Value 2 subtracted from value 1 is " + subtract(input1, input2) + ".");
                break;
            case "*":
                System.out.println("Value 1 multiplied by value 2 is " + multiply(input1, input2) + ".");
                break;
            case "/":
                System.out.println("Value 1 divided by value 2 is " + divide(input1, input2) + ".");
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
    /* Imprecise results.

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

    // Precise results. Uses BigDecimal.
    private static BigDecimal add(String input1, String input2){
        // Converts user input (String) to BigDecimal to perform precise calculations.
        BigDecimal convertedInput1 = new BigDecimal(input1);
        BigDecimal convertedInput2 = new BigDecimal(input2);
        // Adds values of BigDecimal objects by passing second object to add method on first object.
        BigDecimal result = convertedInput1.add(convertedInput2);
        return result;
    }

    private static BigDecimal subtract(String input1, String input2) {
        BigDecimal convertedInput1 = new BigDecimal(input1);
        BigDecimal convertedInput2 = new BigDecimal(input2);
        BigDecimal result = convertedInput1.subtract(convertedInput2);
        return result;
    }

    private static BigDecimal multiply(String input1, String input2) {
        BigDecimal convertedInput1 = new BigDecimal(input1);
        BigDecimal convertedInput2 = new BigDecimal(input2);
        BigDecimal result = convertedInput1.multiply(convertedInput2);
        return result;
    }

    private static BigDecimal divide(String input1, String input2) {
        BigDecimal convertedInput1 = new BigDecimal(input1);
        BigDecimal convertedInput2 = new BigDecimal(input2);
        // Rounding to the nearest hundredth.
        BigDecimal result = convertedInput1.divide(convertedInput2, 2, RoundingMode.HALF_UP);
        return result;
    }
}


