// Lynda.com Learning Java exercise on classes and methods
// Creates Car instances that use the Car class.

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Creates two car instances.
        Car myCar = new Car(25.5, "1BC32D", Color.BLUE, true);

        Car amyCar = new Car(13.9, "3D20BN", Color.BLACK, false);

        // Prints properties and output from paintColor method.
        System.out.println("My Car's License Plate: " + myCar.licensePlate);
        System.out.println("Amy's Car's License Plate: " + amyCar.licensePlate);
        System.out.println(myCar.paintColor);

        // Calls the changePaintColor method and prints new color.
        myCar.changePaintColor(Color.RED);
        System.out.println(myCar.paintColor);

        // Modifies speed, calls the speedingUp method, and prints new speed.
        double myCarSpeed = 50;
        myCarSpeed = myCar.speedingUp(myCarSpeed);
        System.out.println(myCarSpeed);
    }
}
