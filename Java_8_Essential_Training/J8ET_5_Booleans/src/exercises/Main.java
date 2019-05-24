// Lynda.com Java 8 Essential Training exercise on Booleans

/*
 * Reviews the use of class- and method-level variables with different operators.
 * Uses Boolean helper class to parse String as a boolean.
*/

package exercises;

public class Main {

    // Class-level variable. Defaults to false.
    static boolean bDef;

    public static void main(String[] args) {

        // Method-level variables.
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("The value of b1 is: " + b1);
        System.out.println("the value of b2 is: " + b2);
        System.out.println("The value of bDef is: " + bDef);

        // Outputs false.
        boolean b3 = !b1;
        System.out.println("The value of b3 is: " + b3);

        int i1 = 0;
        // Condition in parentheses. Outputs false.
        boolean b4 = (i1 != 0);
        System.out.println("The value of b4 is: " + b4);

        String sBoolean = "true";
        // Uses Boolean helper class with built-in method to parse String variable as boolean.
        // Creates variable of boolean type, assigns to Boolean helper class, and passes String variable into
        // build-in method.
        boolean parsed = Boolean.parseBoolean(sBoolean);
        System.out.println(parsed);
    }
}
