// Own project (guessing game) that compares user input with randomly generated number. Not an exercise for Lynda.com Learning Java course.

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Constructor for user input
        Scanner guess = new Scanner(System.in);
        System.out.println("You vs. The Randomizer\n\nLet's see if you can guess what The Randomizer will return.\nPick a number between 1 and 5. ");
        // Stores user input as variable.
        int userInput = guess.nextInt();

        // Generates random number between 1 and 5. Stores random number as variable.
        Random rand = new Random();
        int randomNumber = rand.nextInt(5) + 1;

        // Checks if user input and random number match and prints a message.
        if (userInput == randomNumber) {
            System.out.println("Oh my gosh! Your number matched the number generated by The Randomizer: " + randomNumber + ".");
        } else {
            System.out.println("Too bad. The Randomizer generated " + randomNumber + ".");
        }
    }

}
