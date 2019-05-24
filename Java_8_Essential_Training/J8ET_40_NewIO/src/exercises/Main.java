// Lynda.com Java 8 Essential Training exercise on copying file with I/) libraries

/*
 * Copies file in Java project and uses exception handling.
 * Uses Java 7 I/O libraries, which simplifies code. Compare to CopyFile and ApacheCommons projects.
 */
package exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

    public static void main(String[] args) {

        // Creates two instance of Path class and passes source and target files into get method.
        Path sourceFile = Paths.get("files", "source.txt");
        Path targetFile = Paths.get("files", "target.txt");

        // Writes to new file and checks for exceptions.
        try {
            // Passes instances of Path class, Path class names, constant on enum StandardCopyOption into copy method
            // on Files class.
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
