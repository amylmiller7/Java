// Lynda.com Learning Java exercise on interfaces
// Creates Pet, Dog, and Cat instances. Dog and Cat instances use the Pet interface.

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        // Constructors for Dog and Cat instances.
        Dog d = new Dog();
        Cat c = new Cat();


        // Confirm that c and d are instanceof Pet so that they can call play method.
        if (c instanceof Pet){
            c.play();
        }
        if (d instanceof Pet){
            d.play();
        }

        // Create new implementation of Pet interface but do not set it. Use to determine if it is dog or cat randomly.
        Pet p;

        // Set Pet instance to dog or cat randomly.
        Random rand = new Random();
        int n = rand.nextInt(2);

        if (n == 0) {
            p = new Dog();
            System.out.println("Hey, there is a new dog!");
        } else {
            p = new Cat();
            System.out.println("Hey, there is a new cat!");
        }

        p.play();
    }
}
