package exercises;

public class MaxValues {

    public static void check() {
        byte b = 127;
        System.out.println("Byte value range: -128 to 127");
        System.out.println("Byte variable value: " + b);

        // Only increments if variable less than constant in the Byte helper class.
        if (b < Byte.MAX_VALUE) {
            b++;
        }
        System.out.println("Byte value NOT incremented (because byte value already equals max value): " + b);

        // Because byte value is already set to max value, incrementing restarts at beginning of value range: -128.
        b++;
        System.out.println("Byte value incremented (after max value reached): " + b);
    }
}
