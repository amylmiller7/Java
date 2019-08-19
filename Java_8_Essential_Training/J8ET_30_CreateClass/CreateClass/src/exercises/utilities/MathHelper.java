package exercises.utilities;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * MathHelper class includes the following methods:
 * add method: uses BigDecimal class to convert input and add converted numbers.
 * subtract method: uses BigDecimal class to convert input and subtract converted numbers.
 * multiply method: uses BigDecimal class to convert input and multiply converted numbers.
 * divide method: uses BigDecimal class to convert input and divide converted numbers.
*/
public class MathHelper {
    // Precise results. Uses BigDecimal.
    // Changed from private to public so methods can be called from other classes/anywhere in application.
    // NOT SURE THIS IS BEST PRACTICE.
    public static BigDecimal add(String input1, String input2){
        // Converts user input (String) to BigDecimal to perform precise calculations.
        BigDecimal convertedInput1 = new BigDecimal(input1);
        BigDecimal convertedInput2 = new BigDecimal(input2);
        // Adds values of BigDecimal objects by passing second object to add method on first object.
        BigDecimal result = convertedInput1.add(convertedInput2);
        return result;
    }

    public static BigDecimal subtract(String input1, String input2) {
        BigDecimal convertedInput1 = new BigDecimal(input1);
        BigDecimal convertedInput2 = new BigDecimal(input2);
        BigDecimal result = convertedInput1.subtract(convertedInput2);
        return result;
    }

    public static BigDecimal multiply(String input1, String input2) {
        BigDecimal convertedInput1 = new BigDecimal(input1);
        BigDecimal convertedInput2 = new BigDecimal(input2);
        BigDecimal result = convertedInput1.multiply(convertedInput2);
        return result;
    }

    public static BigDecimal divide(String input1, String input2) {
        BigDecimal convertedInput1 = new BigDecimal(input1);
        BigDecimal convertedInput2 = new BigDecimal(input2);
        // Rounding to the nearest hundredth.
        BigDecimal result = convertedInput1.divide(convertedInput2, 2, RoundingMode.HALF_UP);
        return result;
    }
}
