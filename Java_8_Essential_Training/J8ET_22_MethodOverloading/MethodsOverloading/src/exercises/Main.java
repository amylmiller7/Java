// Project that builds on Lynda.com Java 8 Essential Training exercise on method overloading

/*
 * Illustrates method overloading. Allows the creation of more than one version of a method.
 * Overloaded method only differ in the number or data types of arguments.
 * Includes code for imprecise calculations that convert from string to double AND code for precise
 * calculations that use BigDecimal.
 */
package exercises;

import java.math.BigDecimal;
import java.util.Scanner;

/*
 * Main class includes:
 * Variables for user input and results of calculations.
 * getInput method, which prints user input.
 * Three different versions of addValues method.
 */
public class Main {

    /*
    // #1 method. Imprecise calculations.
    public static void main(String[] args) {
	    String s1 = getInput("Enter value 1: ");
        String s2 = getInput("Enter value 2: ");
        String s3 = getInput("Enter value 3: ");

        double result = addValues (s1, s2);
        System.out.println(s1 + " + " + s2 + " is " + result + ".");

        double result2 = addValues (s1, s2, s3);
        System.out.println(s1 + " + " + s2 + " + " + s3 + " is " + result2 + ".");

        double result3 = addValues (s1, s2, s3, s1, s2, s3);
        System.out.println("( " + s1 + " + " + s2 + " + " + s3 + " ) * 2 is " + result3 + ".");
    }

    // Prints user input.
    static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }


    // Method adds two arguments.
    static double addValues(String s1, String s2) {
        // Converts from user input (String) to number to perform calculations.
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 + d2;
        return result;
    }

    // Same method adds three arguments.
    static double addValues(String s1, String s2, String s3) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double d3 = Double.parseDouble(s3);
        double result = d1 + d2 + d3;
        return result;
    }

    // Same method adds any number of arguments.
    static double addValues(String ... values) {
        double result = 0;
        // for each loop iterates over each string value.
        // Note: Can return imprecise result.
        for (String value: values) {
            // Converts user input (String) to double by passing value variable into parseDouble method.
            double d = Double.parseDouble(value);
            result += d;
        }
        return result;
    }
    */

    // Precise calculations. Uses BigDecimal.
    public static void main(String[] args) {
        String s1 = getInput("Enter value 1: ");
        String s2 = getInput("Enter value 2: ");
        String s3 = getInput("Enter value 3: ");

        BigDecimal result = addValues (s1, s2);
        System.out.println(s1 + " + " + s2 + " is " + result + ".");

        BigDecimal result2 = addValues (s1, s2, s3);
        System.out.println(s1 + " + " + s2 + " + " + s3 + " is " + result2 + ".");

        BigDecimal result3 = addValues (s1, s2, s3, s1, s2, s3);
        System.out.println("( " + s1 + " + " + s2 + " + " + s3 + " ) * 2 is " + result3 + ".");
    }

    // Prints user input.
    static String getInput(String prompt) {
        System.out.print(prompt);
        // Creates an object of the Scanner class with new constructor method and passes system input.
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }


    // Method adds two arguments.
    static BigDecimal addValues(String s1, String s2) {
        // Converts user input (String) to BigDecimal to perform precise calculations.
        BigDecimal bd1 = new BigDecimal(s1);
        BigDecimal bd2 = new BigDecimal(s2);
        BigDecimal sum = bd1.add(bd2);
        return sum;
    }

    // Same method adds three arguments.
    static BigDecimal addValues(String s1, String s2, String s3) {
        BigDecimal bd1 = new BigDecimal(s1);
        BigDecimal bd2 = new BigDecimal(s2);
        BigDecimal bd3 = new BigDecimal(s3);
        BigDecimal sum = bd1.add(bd2).add(bd3);
        return sum;
    }

    // Same method adds any number of arguments.
    static BigDecimal addValues(String ... values) {
        // BigDecimal immutable. Creates new BigDecimal object as a counter set to 0.
        BigDecimal addBigDecimals = new BigDecimal(0);
        for (String value: values) {
            // Passes each String value to new BigDecimal class constructor method
            // and adds that value to existing BigDecimal object.
            addBigDecimals = addBigDecimals
                    .add(new BigDecimal(value));
        }
        return addBigDecimals;
    }


}
