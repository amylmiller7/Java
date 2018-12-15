// Lynda.com Learning Java exercise on random coin flip/debugging with print statements
// Creates Dog constructor, variables, and methods used by Dog instance in the Main class.

import java.util.Random;

public class Coin {

    public final static int HEADS = 0;
    public final static int TAILS = 1;

    // Keeps track of which side is face up.
    private int faceUp;

    // Constructor that calls the flip method.
    public Coin() {
        flip();
    }

    // Generates random number between 1 and 2. Stores as variable.
    public void flip() {
        Random rand = new Random();
        faceUp = rand.nextInt(2);
    }

    // Compares random number with int variable name and convert output to string.
    public String getFaceUp() {
        if (faceUp == HEADS) {
            return "HEADS";
        } else if (faceUp == TAILS) {
            return "TAILS";
        } else {
            return "INVALID";
        }
    }
}
