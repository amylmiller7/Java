// Lynda.com Java 8 Essential Training exercise on StringBuilder

/*
 * Illustrates use of concatenation and StringBuilder class to create strings and mentions memory management with each.
 * Requests user input, adds input to StringBuilder object, and prints object.
 * For creating strings, see also Strings project.
 */
package exercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // #1 method: Bad memory management.
        // Creates three objects.
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2 + "!";
        System.out.println(str3);

        // #2 method: Good memory management.
        // Creates one object.
        // Creates an object of the Stringbuilder class with the new constructor method and passes a string.
        StringBuilder sb = new StringBuilder("Hello");
        // Adds items to single object.
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        // Passes StringBuilder object.
        System.out.println(sb);

        // #3 method: Good memory management. Less code than method 2.
        // Calls append method three times as one statement.
        StringBuilder sb1 = new StringBuilder("Hello")
            .append(", ")
            .append("Amy")
            .append("!");
        System.out.println(sb1);
        System.out.println(" ");

        // Creates an object of the Scanner class with new constructor method and passes system input.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String input = scanner.nextLine();
        System.out.println(" ");
        System.out.println("Hello, " + input);

        // Clears assignment of StringBuilder object by passing start and end index positions in delete method.
        sb.delete(0, sb.length());
        // for loop requests users input three times.
        for (int i = 0; i < 3; i++) {
            if (i ==0) {
                System.out.println("Type something.");
            } else if ( i == 1) {
                System.out.println("\nType something else.");
            } else if (i == 2) {
                System.out.println("\nType a third something.");
            }
            input = scanner.nextLine();
            // Adds user input to StringBuilder object.
            sb.append(input + "\n");
        }
        System.out.println(" ");
        // Prints user input.
        System.out.println("You typed: \n" + sb);
    }
}
