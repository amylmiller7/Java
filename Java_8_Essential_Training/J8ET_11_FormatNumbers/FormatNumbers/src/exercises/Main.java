// Project that builds on Lynda.com Java 8 Essential Training exercise on formatting numbers

/*
 * Changes how number output based on local associated with number:
 * Outputs number in local format.
 * Outputs number as currency in local format and with local currency symbol.
 * Rounds number to integer and outputs number in local format.
 */
package exercises;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String lang = "da";
        String country = "DK";
        String countryExp = "Denmark";
        System.out.println("Formatting number for " + countryExp + ".");

        // Creates an object of the Locale class with the new constructor method and passes variables.
        Locale locale = new Locale(lang, country);

        double doubleValue = 1_234_567.89;

        // Creates variable of NumberFormat type, assigns it to built-in method getNumberInstance of that class,
        // and passes locale object.
        NumberFormat numF = NumberFormat.getNumberInstance(locale);
        // Prints variable in number format based on locale.
        System.out.println("Number: " + numF.format(doubleValue));

        NumberFormat curF = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency: " + curF.format(doubleValue));

        NumberFormat intF = NumberFormat.getIntegerInstance(locale);
        System.out.println("Integer: " + intF.format(doubleValue));
    }
}
