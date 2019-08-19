// Lynda.com Java 8 Essential Training exercise on currency

/*
 * Illustrates imprecision of adding doubles or floats and how to use BigDecimal class for precise calculations.
 */
package exercises;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        double value = .012;

        // Imprecise result
        double pSum = value + value + value;
        System.out.println("Sum of primitives: " + pSum);

        // Precise result
        // Converts double to string.
        // Creates variable of the String type, assigns it to the Double helper class, and passes the double variable
        // into built-in method.
        String strValue = Double.toString(value);
        System.out.println("Value converted to string: " + strValue);

        // Creates an object of the BigDecimal class with the new constructor method and passes a string variable.
        BigDecimal bigValue = new BigDecimal(strValue);

        // Creates variable of BigDecimal type, assigns it to instance of BigDecimal class, and passes instance of
        // BigDecimal class into built-in method, which adds values of instances together.
        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        System.out.println(bSum.toString());

    }
}
