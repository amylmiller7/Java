// Lynda.com Java 8 Essential Training exercise on nested classes

/*
 * Defines classes nested within other classes. (Nested classes are only available to their parent classes.)
 * Takes user input for numbers and operations, performs exception handling, performs calculations, and output results.
 * Uses nested class, which logically groups classes, increases encapsulation, makes more readable/maintainable code.
 * Operation methods divided into separate MathHelper class.
 */
package exercises;

import exercises.utilities.MathHelper;

import java.math.BigDecimal;
import java.util.Scanner;

/*
 * Calculator class contains the following methods:
 * main method: creates variables for user input, exception handling for numeric values, and calls operation method.
 * operation method: checks operation type entered, calls method based on operation type, exception handling for input,
 * and outputs result of calculation.
 */
public class Calculator {

    public static void main(String[] args) {
        // Creates an object of the Calculator class with new constructor method.
        Calculator calc = new Calculator();
        // Calls calculate method on new instance of class.
        calc.calculate();
    }

    // Removes static so this method can be called in main method.
    // protected method accessible by class, package, and subclass in same package.
    protected void calculate() {

        // Creates object of InputHelper class with new constructor method.
        InputHelper helper = new InputHelper();
        // Declares variables and ses them to the getInput method on the InputHelper instance.
        String input1 = helper.getInput("Enter a value: ");
        String input2 = helper.getInput("Enter another value: ");
        String input3 = helper.getInput("Choose the operation type (+, -, *, or /): ");

        // Creates BigDecimal object for calculation results. Results in precise calculations.
        BigDecimal result;

        // Uses try catch for exception handling around user input of operation type.
        try {
            switch (input3) {
                case "+":
                    // Calls add method on MathHelper class and passes user input.
                    result = MathHelper.add(input1, input2);
                    break;
                case "-":
                    result = MathHelper.subtract(input1, input2);
                    break;
                case "*":
                    result = MathHelper.multiply(input1, input2);
                    break;
                case "/":
                    result = MathHelper.divide(input1, input2);
                    break;
                default:
                    System.out.println("You didn't choose a listed operation type!");
                    return;
            }
            System.out.println("The answer is " + result + ".");
        } catch (Exception e) {
            System.out.println("Number formatting exception: " + e.getLocalizedMessage());
        }
    }

    // Nested class.
    class InputHelper {
        // getInput is an instance method of the InputHelper class.
        private String getInput(String prompt) {
            System.out.println(prompt);
            // Creates an object of the Scanner class with new constructor method and passes system input.
            Scanner sc = new Scanner(System.in);
            // Returns user input
            return sc.nextLine();

        }
    }

}
