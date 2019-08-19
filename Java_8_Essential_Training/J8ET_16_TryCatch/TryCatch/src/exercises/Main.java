// Lynda.com Java 8 Essential Training exercise on try-catch block

/*
 * Illustrates how to use try-catch blocks for exception handling and use custom messages.
 */
package exercises;

public class Main {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
            // First tests length property. Unless it is length -1, throws ArrayIndexOutOfBoundsException.
            char lastChar = chars[chars.length];
            System.out.println(lastChar);
            // If first test of length property passes, tests argument. If value is longer than
            // length of welcome variable, throws StringOutOfBoundsException.
            String sub = welcome.substring(10);
            System.out.println("Substring: " + sub);


        //} catch (Exception e) {
        // Changed to subclass of Exception.
        } catch (ArrayIndexOutOfBoundsException e) {
            // Prints system error handling message.
            // e.printStackTrace();
            // Prints custom error handling message.
            System.out.println("Array index problem");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index problem");
        }
    }
}
