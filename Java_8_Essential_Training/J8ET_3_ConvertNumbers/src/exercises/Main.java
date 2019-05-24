// Lynda.com Java 8 Essential Training exercise on converting numbers

/*
 * Creates integer variable and converts integer to different primitive data types to illustrate the result of
 * widening or narrowing the data type.
 */
package exercises;

public class Main {

    public static void main(String[] args) {

        // Both variables copied and saved in memory. intValue2 is a copy of, not a reference to, the original value 56.
        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("First integer is " + intValue1 + ".");
        System.out.println("Second integer is " + intValue2 + ".");

        // Converts int to long (widening the type), resulting in no loss of data. Prints 56.
        // Widening the type: going from type (int) that uses smaller amount of memory to one that uses
        // larger amount of memory (long).
        long longValue1 = intValue1;
        System.out.println("Converts integer " + intValue1 + " to long value: " + longValue1);

        // Converts int to short (narrowing the type), but does not result in data loss. Prints 56.
        short shortValue1 = (short) intValue1;
        System.out.println("Converts integer " + intValue1 + " to short value: " + shortValue1);

        // Converts int to byte (narrowing the type), resulting in loss of data. Prints 0.
        int intValue3 = 1024;
        byte byteValue2 = (byte) intValue3;
        System.out.println("Converts integer " + intValue3 + " to byte value: " + byteValue2);

        // Converts int to double (narrowing the type), resulting in loss of data. Prints 3.
        double doubleValue = 3.9999d;
        int intValue4 = (int) doubleValue;
        System.out.println("Converts double " + doubleValue + " to integer: " + intValue4);
    }
}
