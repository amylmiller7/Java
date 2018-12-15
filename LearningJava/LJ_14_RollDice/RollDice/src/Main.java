// Project that builds on Lynda.com Learning Java exercise on rolling dice
// Creates Dice instance that uses the Dice class.

public class Main {
    public static void main(String[] args) {
        // Creates one dice instance.
        Dice dice = new Dice();

        // Calls roll method and prints result.
        System.out.println("You rolled " + dice.roll() + "!");
        System.out.println("Your first dice was " + dice.dice1 + " and your second dice was " + dice.dice2 + ".");
    }
}

