// Project that builds on Lynda.com Java 8 Essential Training exercise on parsing strings

/*
 * Illustrates different ways to manipulate strings.
 * Prints string, length of string, position of substring, and substring at specified position.
 * Shows impact of white space on string length and output.
 * Requests user input and searches for that input in the string.
 */
package exercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Prints string length.
        String s1 = "Welcome to California!";
        System.out.println("\"" + s1 + "\"");
        System.out.println("Length of string: " + s1.length());

        // Prints where substring appears in string.
        String substring = "California";
        int position = s1.indexOf(substring);
        System.out.println("Starting position of substring " + substring + ": " + position);

        // Confirms position of substring.
        String sub = s1.substring(11);
        System.out.println("Confirm substring starting at position 11: " + sub);
        System.out.println(" ");

        String s2 = "Welcome!     ";
        // Prints string length including white space.
        int len1 = s2.length();
        System.out.println("\"" + s2 + "\"");
        System.out.println("Length of string including extra white space: " + len1);
        // Removes white space from string. Prints string length NOT including white space.
        String s3 = s2.trim();
        System.out.println("Length of string NOT including extra white space: " + s3.length());
        System.out.println(" ");

        // Creates an object of the Scanner class with new constructor method and passes system input.
        Scanner scanner = new Scanner(System.in);
        System.out.println("What substring do you want to search for?");
        String input = scanner.nextLine();
        // Checks if user input appears in string and prints message.
        if (s1.contains(input)) {
            System.out.println("I found " + input + "!");
        } else {
            System.out.println("Nope. I didn't find " + input + ".");
        }
    }
}
