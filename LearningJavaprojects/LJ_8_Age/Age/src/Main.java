// Project that builds on Lynda.com Learning Java exercise on control flow (if-else statements).
// Requests user input. Checks if input is decimal and converts to integer. Uses if-else statement to print different message based on input.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter an age: ");
        // Constructor for a Scanner instance
        Scanner in = new Scanner(System.in);
        // Grabs the input and saves it to variable. Uses double data type in case user inputs decimal.
        double age = in.nextDouble();

        // Checks if input is a whole number or not. Treats input as an integer.
        if (age == Math.floor(age)) {
            int ageInt = (int) age;
        }

        // Checks input and prints message based on input.
        if (age >= 0 && age <=5) {
            System.out.println("You're a young'un!");
        } else if (age >=6 && age <=11) {
            System.out.println("You're a kid!");
        } else if (age >=12 && age <=17) {
            System.out.println("You're a teenager!");
        } else if (age >=18 && age <=20) {
            System.out.println("You're an adult (but you still can't legally drink)!");
        } else if (age >=21) {
            System.out.println("You're an adult (and can legally drink)!");
        } else {
            System.out.println("Whoa. What you entered doesn't seem to be a valid age.");
        }

        System.out.println("Thanks for using this program!");
    }
}
