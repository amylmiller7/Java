/*
Lynda.com Learning Java exercise on classes and methods
Creates Dog constructor, variables, and methods used by Dog instances in the Main class.
*/

import java.util.Random;

public class Dog {
    // Variables for Dog class
    String breed;
    String name;
    int age;
    private int soundSelection = 0;

    // Constructor that initializes Dog instances
    public Dog(String inputBreed,
               String inputName,
               int inputAge) {
        // Sets values of new dog properties to input values in the constructor.
        this.breed = inputBreed;
        this.name = inputName;
        this.age = inputAge;
    }

    public int getDogYears() {
        return this.age * 7;
    }

    // Returns random item in array.
    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    // Calls getRandom method and prints sound.
    public void speak() {
        String sound[] = {"\nBark!", "\nWhine", "\nGrowl"};
        String selection = getRandom(sound);
        System.out.println(selection);
    }

}
