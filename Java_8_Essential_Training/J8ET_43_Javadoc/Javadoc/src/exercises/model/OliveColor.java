package exercises.model;

/**
 * Provides the colors of olives.
 */
public enum OliveColor {
    // Lists enums and passes strings and hex values used to translate enums.
    /**
     * Constant for the color purple.
     */
    PURPLE("Purple", 0x3E0854),
    /**
     * Constant for the color black.
     */
    BLACK("Black", 0x000000),
    /**
     * Constant for the color green.
     */
    GREEN("Green", 0x00FF00);

    String name;
    long color;

    // Creates constructor method that matches the name of the enum list and accepts translated enum.
    /**
     * Creates and initializes OliveColor with appropriate color name and color hex value.
     *
     * @param name  the color name
     * @param color the color hex value
     */
    OliveColor(String name, long color) {
        this.name = name;
        this.color = color;
    }

    /**
     * Converts the enum to a string.
     *
     * @return  the enum as a string
     */
    public String toString() {
        return name;
    }
}
