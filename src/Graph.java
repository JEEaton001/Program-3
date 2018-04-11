
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Author: James Eaton, Scott Kirkpatrick
 * Date: 4/9/2018
 * Ovwerview:
 */

public class Graph{
    public String[] labels;
    public int[][] weight;
    
    //Constructor for Graph with No edges
    Graph(String[] L){
    	for(int i = 0; i < labels.length; i++){
    		for (int j = 0; j < labels.length; j++){
    			weight[i][j] = Integer.MAX_VALUE;
    		}
    	}
    }
    
    //Constructor for Graph with weights from file
    Graph(String[] L, BufferedReader reader){
        labels = L;
        weight = new int[labels.length][labels.length];
        for(int i=0; i<labels.length;i++){
            try {
                String line = reader.readLine();
                String[] Connections = line.split(",");
                for(int j = 0; j<labels.length;j++){
                    if(Connections[j].equals("∞")){
                        weight[i][j] = Integer.MAX_VALUE;
                    }else if(Connections[j].equals("?")){
                        weight[i][j] = Integer.MAX_VALUE;
                    }else{
                        weight[i][j] = Integer.parseInt(Connections[j]);
                    }
                }
            } catch (IOException ex) {
            System.err.format("IOException: %s%n", ex);
            }
        }
    }
    
    public void PrintGraph(){
        System.out.print("  ");
        for(int i=0; i<labels.length;i++){
            System.out.print(labels[i] + ",");
        }
        System.out.println();
        for(int i=0; i<labels.length;i++){
            System.out.print(labels[i] + ",");
            for(int j = 0; j<labels.length;j++){
                if (weight[i][j] == Integer.MAX_VALUE){
                    System.out.print("∞,");
                }else{
                    System.out.print(weight[i][j] + ",");
                }
            }
            System.out.println();
        }
    }
    
}
