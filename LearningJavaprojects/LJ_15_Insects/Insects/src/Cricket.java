// Lynda.com Learning Java exercise on inheritance
// Created Cricket class that inherits from Insect class.

public class Cricket extends Insect {
    // Variable for Cricket class
    double length;

    // Constructor that initializes Cricket instances.
    public Cricket(int age, double length) {
        // Variables inherited from Insect class.
        super(age, 6);
        // Variable unique to Cricket class.
        this.length = length;
    }

    // Class inherited from Insect class but output overwritten.
    public void says() {
        System.out.println("CHIRP");

    }

    // Method unique to Cricket class.
    public void jump() {
        System.out.println("A cricket jumped!");
    }

}
