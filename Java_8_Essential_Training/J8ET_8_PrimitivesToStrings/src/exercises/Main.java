// Lynda.com Java 8 Essential Training exercise on converting primitive values to strings

/*
 * Converts integers, booleans, long values with and without formatting to strings.
 */
package exercises;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        int intValue = 42;
        // Creates variable of String type, assigns it to Integer helper class, and passes int variable into built-in
        // method.
        String fromInt = Integer.toString(intValue);
        System.out.println("Converts integer to string: " + fromInt);

        boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println("Converts boolean to string: " + fromBool);

        long longValue1 = 10_000_000;
        String fromLong = Long.toString(longValue1);
        System.out.println("Converts long value to string: " +fromLong);

        long longValue2 = 10_000_000;
        // Creates variable of NumberFormat type and assigns it to built-in method getNumberInstance of that class.
        // Note: NumberFormat class can do more complex formatting than helper classes.
        NumberFormat formatter = NumberFormat.getNumberInstance();
        // Creates variable of String type, assigns it to formatter object (variable of NumberFormat type), and passes
        // long variable into built-in method.
        String formatted = formatter.format(longValue2);
        System.out.println("Converts long value to string with commas: " + formatted);


    }
}
