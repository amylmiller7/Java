// Lynda.com Java 8 Essential Training exercise on JAR files

/*
 * Creates JAR file. Allows any operating system with Java Runtime to run application.
 * To run in IDE: At bottom of IDE window, click Terminal. cd to location of JAR file.
 * Type java -jar {name of jar file}.
 * To run outside IDE: In terminal window, cd to location of JAR file. Type java -jar {name of jar file}.
 */
package exercises;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Main {

    // Creates an immutable variable/constant.
    public static final String FLOWER_FEED =
            "http://services.hanselandpetal.com/feeds/flowers.xml";

    // Adds throws to method signature in case compiler finds checked exception in finally block.
    public static void main(String[] args) throws IOException {

        // Variables declared outside try block are available for finally.
        InputStream stream = null;
        BufferedInputStream buf = null;

        try {
            // Creates instance of URL class named url with constructor method and passes constant.
            URL url = new URL(FLOWER_FEED);

            // Sets stream variable to openStream method on instance of URL class.
            stream = url.openStream();
            // Sets buf variable to constructor method and passes stream variable.
            buf = new BufferedInputStream(stream);

            // Creates StringBuilder object to collect data from the request with constructor method.
            StringBuilder sb = new StringBuilder();

            while (true) {
                // read method returns single character from the stream.
                // If unsuccessful, returns -1.
                int data = buf.read();

                if (data == -1) {
                    break;
                } else {
                    // Interprets data from read method as single character and adds to StringBuilder object.
                    sb.append((char)data);
                }
            }
            // Prints content of file saved as StringBuilder object.
            System.out.println(sb);
        } catch (IOException e) {
            // Prints standard exception error message.
            e.printStackTrace();
        } finally {
            // Explicitly closes streams (unlike try with resources. See CopyFile project.)
            stream.close();
            buf.close();
        }
    }
}
