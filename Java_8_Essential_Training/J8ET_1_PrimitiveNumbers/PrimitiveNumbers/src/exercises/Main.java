// Project that builds on Lynda.com Java 8 Essential Training exercise on primitive numbers

/*
 * Prints different primitive types.
 * Illustrates outcome of incrementation to byte value when check made for value and when max value has been met.
 * Uses a helper class and constant/static field to return info about primitive type.
 */
package exercises;

public class Main {

    public static void main(String[] args) {

        byte b = 1;
        short sh = 1;
        int i = 1;
        long l = 1L;

        float f = 1f;
        double d = 1d;

        System.out.println("Byte: " + b);
        System.out.println("Short: " + sh);
        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println(" ");

        // Calls built-in check method of MaxValues class.
        MaxValues.check();
    }
}
