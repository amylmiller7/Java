// Lynda.com Java 8 Essential Training exercise that uses Apache Commons

/*
 * Copies file in Java project and uses exception handling.
 * Compare to CopyFile and NewIO projects.
 */

package exercises;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        //  Creates instances of File objects
        File sourceFile = new File("files/loremipsum.txt");
        File targetFile = new File("files/target.txt");

        try {
            FileUtils.copyFile(sourceFile, targetFile);
            System.out.println("File copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
