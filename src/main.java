
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * Author: James Eaton, Scott Kirkpatrick
 * Date: 4/6/2018
 * Ovwerview:
 */


public class main {
    
    
    
    
    public static void main(String[] args) {
        //path for input
        Path file1 = Paths.get("Input.csv");
        try (BufferedReader reader = Files.newBufferedReader(file1)) {
            //string for reading file
            String line = null;
            //loop to read file.
            while ((line = reader.readLine()) != null) {
                //variables used in reading the file
                String[] temp = line.split(",");
            }
            
        }   catch (IOException ex) {
            System.err.format("IOException: %s%n", ex);
        }
        
        
    }
}
