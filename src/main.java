
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
        //input graph
        Path file1 = Paths.get("Input.csv");
        try (BufferedReader reader = Files.newBufferedReader(file1)) {
            //string for reading file
            String line = null;
            // read first line
            line = reader.readLine();
                //variables used in reading the file
            String[] temp = line.split(",");
                // pass temp and reader to graph
            Graph graph = new Graph(temp, reader);
            graph.PrintGraph();
                // prims algorithm
            Algorithms.Prim(graph, graph.labels[0], "");
            
            
            
            
            
        }   catch (IOException ex) {
            System.err.format("IOException: %s%n", ex);
        }
    }
}
