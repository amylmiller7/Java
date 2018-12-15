/*
Lynda.com Learning Java exercise on classes and methods
Creates Car constructor, variables, and methods used by Car instances in the Main class.
Imports everything from the abstract window toolkit.
*/

import java.awt.*;

public class Car {

    // Variables for car function
    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailLightsWorking;

    // Constructor that initializes Car instances
    public Car(double inputAverageMPG,
               String inputLicensePlate,
               Color inputPaintColor,
               boolean inputAreTailLightsWorking) {
        // Sets values of new car properties to the input values in the constructor.
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailLightsWorking = inputAreTailLightsWorking;
    }

    public void changePaintColor(Color newPaintColor) {
        this.paintColor = newPaintColor;
    }

    public double speedingUp(Double currentSpeed) {
        currentSpeed += 100;
        return currentSpeed;
    }

}
