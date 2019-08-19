// Lynda.com Java 8 Essential Training exercise on operators, Math class, Random class

/*
 * Illustrates:
 * Use of basic operators.
 * Use of Math class for rounding and absolutes.
 * Use of casting syntax to set value to appropriate data type for resulting values.
 * Generation of random number.
 */
package exercises;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = 42;

        int result1 = intValue1 + intValue2;
        System.out.println("Addition: " + result1);

        int result2 = intValue1 - intValue2;
        System.out.println("Subtraction: " + result2);

        int result3 = intValue1 * intValue2;
        System.out.println("Multiplication: " + result3);

        // Results could be fractional so set to wider data type with casting syntax (double).
        double result4 = (double) intValue1 / intValue2;
        System.out.println("Division: " + result4);

        // Results could be fractional so set to wider data type with casting syntax (double).
        double result5 = (double) intValue1 % intValue2;
        System.out.println("Remainder " + result5);

        double  doubleValue = -3.9999;
        // Creates variable of long type, assigns it to Math class, and passes double value into built-in method.
        long rounded = Math.round(doubleValue);
        System.out.println("Rounded: " + rounded);

        double absValue = Math.abs(doubleValue);
        System.out.println("Absolute: " + absValue);

        // Generates a random number.
        // Creates an object of the Random class with the new constructor method.
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        System.out.println("Random number: " + randomNumber);

    }
}
