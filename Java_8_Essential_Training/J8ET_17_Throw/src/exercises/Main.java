// Project that builds on Lynda.com Java 8 Essential Training exercise on throw methods

/*
 * Illustrates how to use throw method for exception handling. Stops execution of code
 * when throw occurs. Uses try-catch block with custom messages.
 */
package exercises;

public class Main {

    public static void main(String[] args) {

        String welcome = "Welcome!!!!";
        // Converts string to sequence of individual characters.
        char[] chars = welcome.toCharArray();

        try {
            // If character array less than 10 items, calls throw method and passes in exception object.
            // Throw method stops rest of program from executing.
            if (chars.length < 10) {
                // Instantiates Exception object with new keyword and Exception class constructor method.
                throw new Exception("My custom message");
            }

            // Creates variable of char type and assigns it to last character in chars array.
            char lastChar = chars[chars.length -1 ];
            System.out.println("The last character in \'" + welcome + "\' is " + lastChar);
            // Creates variable for the String type, assigns it to built-in substring method on variable welcome,
            // and passes argument.
            int indexPos = 5;
            String sub = welcome.substring(indexPos);
            System.out.println("The character(s) starting at position " + indexPos + " are \'" + sub + "\'.");

        //} catch (Exception e) {
        // Changed to subclass of Exception.
        } catch (ArrayIndexOutOfBoundsException e) {
            // Prints system error handling message.
            // e.printStackTrace();
            // Prints custom error handling message.
            System.out.println("Array index problem");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index problem");
        } catch (Exception e) {
            //e.printStackTrace();
            // Prints message in the throw statement.
            System.out.println(e.getMessage());
        }
    }
}
