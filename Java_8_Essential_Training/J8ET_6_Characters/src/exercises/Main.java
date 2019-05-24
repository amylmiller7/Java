// Lynda.com Java 8 Essential Training exercise on characters

/*
 * Creates and prints char primitive type with numbers, unicode escape sequence, and strings.
 * Uses Character helper class to change case of character.
 */
package exercises;

public class Main {

    public static void main(String[] args) {

        // char primitive type uses single quotes.
        char c1 = '1';
        char c2 = '2';
        char c3 = '3';
        System.out.println("Char 1: " + c1);
        System.out.println("Char 2: " + c2);
        System.out.println("Char 3: " + c3);

        // Assigns a Unicode escape sequence.
        char dollarSign = '\u0024';
        System.out.println("Currency: " + dollarSign);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';
        // Uses Character helper class to change case.
        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));
    }
}
