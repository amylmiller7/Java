// Own project that requests user input, gets current year, confirms input with if-else statements, and prints message based on input. Not an exercise for Lynda.com Learning Java course.

import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the year you were born in YYYY format: ");
        // Constructor for a Scanner instance
        Scanner in = new Scanner(System.in);
        // Grabs the input and saves it to variable.
        int year = in.nextInt();

        // Gets current year and sets to variable.
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);

        // Checks input and prints message based on input.
        if (year >= 1997  && year < currentYear) {
            System.out.println("You're a Post-Millennial!");
        } else if (year >= 1981 && year <= 1996) {
            System.out.println("You're a Millennial! You've changed the world...for good or bad.");
        } else if (year >= 1965 && year <= 1980) {
            System.out.println("You're from Generation X! You're the ignored generation, sandiwched between the Boomers and their offspring the Millennials.");
        } else if (year >= 1946 && year <= 1964) {
            System.out.println("You're a Baby Boomer, the Me Generation!");
        } else if (year >= 1928 && year <= 1945) {
            System.out.println("You're from the Silent Generation!");
        } else if (year >= 1900 && year <=1927) {
            System.out.println("You're from the Greatest Generation!");
        } else {
            System.out.println("Whoa. Are you sure that you entered the correct year?");
        }

    }
}
