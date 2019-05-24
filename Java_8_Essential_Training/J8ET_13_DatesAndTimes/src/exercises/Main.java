// Project that builds on Lynda.com Java 8 Essential Training exercise on date/time formats

/*
 * Uses two APIs (original Java API and Java 8 API) to print various date-time formats with different classes.
 */
package exercises;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        // Original Java API
        System.out.println("Using original Java API: \n");
        // Outputs current date and time in date stamp format.
        // Creates an object of the Date class with the new constructor method.
        Date d = new Date();
        System.out.println("Date class constructor method with today's date: \n" + d);
        System.out.println("");

        // Outputs a specific date time in date stamp format.
        // Creates an object of the GregorianCalendar class with the new constructor method and passes arguments.
        // Month uses zero-based indexing so 1 = Feb.
        GregorianCalendar gc = new GregorianCalendar(2009, 1, 28);
        // Adds one day to the date of 2/28. Outputs March 1.
        gc.add(GregorianCalendar.DATE, 1);
        Date d2 = gc.getTime();
        System.out.println("GregorianCalendar class constructor method with specific date: \n" + d2);
        System.out.println("");

        // Outputs current date in full and long formats.
        DateFormat df_full = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat df_long = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("DateFormat class with today's date in full format: \n" + df_full.format(d));
        System.out.println("");
        System.out.println("DateFormat class with today's date in long format: \n" + df_long.format(d));
        System.out.println("");
        System.out.println("DateFormat class with date from GregorianCalendar object in full format: \n" +
                df_full.format(d2));
        System.out.println("");
        System.out.println("");


        // Java 8 API
        System.out.println("Using Java 8 API: \n");
        // Creates an instance of LocalDateTime class and calls now method on object.
        LocalDateTime ldt = LocalDateTime.now();
        // Prints date-time in ISO-8601 calendar system, e.g., yyyy-mm-ddThh:mm:ss.unix timestamp.
        System.out.println("LocalDateTime class with now method: \n" + ldt);
        System.out.println("");

        // Creates an instance of LocalDate class, calls of method on object, and passes arguments.
        LocalDate ld = LocalDate.of(2009, 1, 28);
        // Prints date in ISO-8601 calendar system, e.g., yyyy-mm-dd.
        System.out.println("LocalDate class with of method and specific date: \n" + ld);
        System.out.println("");

        // Formats with ofPattern method on the DataTimeFormatter class.
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm a");
        // Prints date and time based on a pattern.
        System.out.println("DateTimeFormatter class with ofPattern method and specific date: \n" + dtf.format(ldt));
    }
}
