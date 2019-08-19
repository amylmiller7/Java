// Lynda.com Java 8 Essential Training exercise on comparing strings

/*
 * Compares strings various ways to show how compiler saves values to memory, how inaccurate equals operator can be,
 * and how to compare strings accurately with equals method.
 */

package exercises;

public class Main {

    public static void main(String[] args) {

        // #1 method: Compiler creates new object for str1. Sees that str2 matches str1.
        // Does not create object for str2 but references the str1 value. THEY MATCH!
        String str1 = "Hello";
        String str2 = "Hello";

        if (str1 == str2) {
            System.out.println(str1 + " and " + str2 + ": They match!");
        } else {
            System.out.println("They don't match!");
        }

        // #2 method: Compiler doesn't find match in table of existing strings.
        // Creates new object for str3. THEY DON'T MATCH!
        String str3 = "hello";
        if (str1 == str3) {
            System.out.println("They match!");
        } else {
            System.out.println(str1 + " and " + str3 + ": They don't match!");
        }

        // #3 method: Compiler creates separate objects for part1, part2, str4, and str5.
        // Compiler cannot know at runtime that str4 matches part1 and part2 so str4 created as new object.
        // THEY DON'T MATCH!
        String part1 = "Hello ";
        String part2 = "World";
        String str4 = part1 + part2;
        String str5 = "Hello World";
        if (str4 == str5) {
            System.out.println("They match!");
        } else {
            System.out.println("String " + part1 + "and string " + part2 + " concatenated together and compared to " +
                    "single string " + str5 + ": " + "They don't match.");
        }

        // #4 method: Accurate comparison of strings by passing string into built-in equals method. THEY MATCH!
        String part3 = "Hello ";
        String part4 = "World";
        String str6 = part3+ part4;
        String str7 = "Hello World";
        // Calls built-in equals method of String class.
        if (str6.equals(str7)) {
            System.out.println("String " + part3 + "and string " + part4 + " concatenated together. Pass single " +
                    "string " + str7 + " into equals method on concatenated string: They match!");
        } else {
            System.out.println("They don't match.");
        }
    }
}
