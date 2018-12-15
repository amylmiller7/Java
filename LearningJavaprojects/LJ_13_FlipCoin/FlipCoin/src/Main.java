//Lynda.com Learning Java exercise on random coin flip/debugging with print statements
//Creates coin instance that uses the Coin class.

public class Main {
    public static void main(String[] args) {
        // Creates coin instance.
        Coin c = new Coin();
        // Check that coin set to start out with heads.
        System.out.println("Initial: " + c.getFaceUp());

        // Flip coin 10 times.
        for(int i=0; i < 10; i++) {
            // Calls flip method, which randomly generates 1 or 2.
            c.flip();
            // Calls getFaceUp method, which returns HEADS or TAILS.
            System.out.println("After Flip: " + c.getFaceUp());
        }
    }
}
