package utilities;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * MathHelper class includes the following methods:
 * add method: uses BigDecimal class to convert input and add converted numbers.
 * subtract method: uses BigDecimal class to convert input and subtract converted numbers.
 * multiply method: uses BigDecimal class to convert input and multiply converted numbers.
 * divide method: uses BigDecimal class to convert input and divide converted numbers.
 * operation method: checks operation type entered, calls method based on operation type, performs exception
 * handling for input, and outputs result of calculation.
*/

public class MathHelper {
    // Precise results. Uses BigDecimal.
    private static BigDecimal add(String input1, String input2){
        // Converts user input (String) to BigDecimal to perform precise calculations.
        BigDecimal convertedInput1 = new BigDecimal(input1);
        BigDecimal convertedInput2 = new BigDecimal(input2);
        // Adds values of BigDecimal objects by passing second object to add method on first object.
        BigDecimal result = convertedInput1.add(convertedInput2);
        return result;
    }

    private static BigDecimal subtract(String input1, String input2) {
        BigDecimal convertedInput1 = new BigDecimal(input1);
        BigDecimal convertedInput2 = new BigDecimal(input2);
        BigDecimal result = convertedInput1.subtract(convertedInput2);
        return result;
    }

    private static BigDecimal multiply(String input1, String input2) {
        BigDecimal convertedInput1 = new BigDecimal(input1);
        BigDecimal convertedInput2 = new BigDecimal(input2);
        BigDecimal result = convertedInput1.multiply(convertedInput2);
        return result;
    }

    private static BigDecimal divide(String input1, String input2) {
        BigDecimal convertedInput1 = new BigDecimal(input1);
        BigDecimal convertedInput2 = new BigDecimal(input2);
        // Rounding to the nearest hundredth.
        BigDecimal result = convertedInput1.divide(convertedInput2, 2, RoundingMode.HALF_UP);
        return result;
    }

    public static void operation(String input1, String input2, String input3) {

        BigDecimal result;

        // Uses switch statement check operation type input and call method based on the type.
        // Returns message if no listed operation type input.
        switch (input3) {
            case "+":
                result = add(input1, input2);
                break;
            case "-":
                result = subtract(input1, input2);
                break;
            case "*":
                result = multiply(input1, input2);
                break;
            case "/":
                result = divide(input1, input2);
                break;
            default:
                System.out.println("You didn't choose a listed operation type!");
                return;
        }

        // Prints the result of operation method.
        System.out.println("The answer is " + result + ".");
    }
}
