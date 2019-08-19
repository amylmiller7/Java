// Project that builds on Lynda.com Java 8 Essential Training exercise on strings

/*
 * Illustrates different ways to create strings:
 * Uses shortcut, class constructor method, concatenation, string object from array of characters.
 * Prints array of characters from a string.
 * For creating strings, see also StringBuilder project.
 */

package exercises;

public class Main {

    public static void main(String[] args) {

        // Creates string object with shortcut.
        String s1 = "Hello!";
        System.out.println(s1);

        // Creates string object with class constructor method.
        String s2 = new String("Hello again");
        System.out.println(s2);

        // Creates string object by concatenating string objects together.
        String s3 = "Shirt size: ";
        String s4 = "M";
        String s5 = s3 + s4 + ", Qty: " + 4;
        System.out.println((s5));

        // Creates string object from array of characters.
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        // Creates an object of the String class with the new constructor method and passes a char array variable.
        String s6 = new String(chars);
        System.out.println(s6);

        // Creates array of characters from a string.
        // Creates variable of char type, assigns to instance of String class with built-in method.
        char[] chars2 = s6.toCharArray();
        // for each loop iterates over characters in array (type var : array).
        for (char c: chars2) {
            System.out.println(c);

        }
        // Accesses a specific item in the array.
        System.out.println(chars2[1]);
    }
}
