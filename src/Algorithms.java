
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Author: James Eaton, Scott Kirkpatrick
 * Date: 4/6/2018
 * Ovwerview:
 */


public class Algorithms {
    
    public static Graph MakeGraph(){
        
    }
    
    public static void Prim(){
        
    } 
    
    public static void Kruskal(){
        
    } 
     
    public static void FloydWarshall(){
        
    } 
}

class Graph{
    String[] labels;
    int[][] weight;
    
    Graph(String[] L, BufferedReader reader){
        labels = L;
        weight = new int[labels.length][labels.length];
        for(int i=0; i<labels.length;i++){
            String line = reader.readLine();
            String[] Connections = line.split(",");
            for(int j = 0; j<labels.length;j++){
                if(Connections[j].equals("∞")){
                    weight[i][j] = Integer.MAX_VALUE;
                }else{
                    weight[i][j] = Integer.parseInt(Connections[j]);
                }
            }   
        }
        
    }
    
}

class Node{
    String Label;
    Map<Node, Integer> connections = new HashMap<>();
    
    Node(String L){
        Label = L;
    }
    
    public void addConnections(BufferedReader reader){
        
    }
}