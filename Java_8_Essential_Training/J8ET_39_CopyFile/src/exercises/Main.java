// Lynda.com Java 8 Essential Training exercise on copying file

/*
 * Copies file in Java project and uses exception handling.
 * Compare to NewIO and ApacheCommons projects.
 */
package exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

        // Variables point to existing and target files.
        String sourceFile = "files/source.txt";
        String targetFile = "files/target.txt";

        // Writes to new file and checks for exceptions.
        try (
                // try-with-resources statement: resource = object that must be closed after program finished with it.
                // Declares three objects and instantiates by calling constructor methods.
                FileReader fReader = new FileReader(sourceFile);
                BufferedReader bReader = new BufferedReader(fReader);
                FileWriter writer = new FileWriter(targetFile)

        ) {
            // Loops through each line in file. Writes each line found to target file.
            while (true) {
                String line = bReader.readLine();
                if (line == null) {
                    break;
                } else {
                    writer.write(line + "\n");
                }
            }
            System.out.println("File copied!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
