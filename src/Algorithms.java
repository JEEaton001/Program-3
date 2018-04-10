

/*
 * Author: James Eaton, Scott Kirkpatrick
 * Date: 4/6/2018
 * Ovwerview:
 */


public class Algorithms {
    
    public static void Prim(Graph graph, String start, String prev){
        
        for(int i=0; i<graph.labels.length;i++){
            if(graph.labels[i].equals(start)){
                int smallest = Integer.MAX_VALUE;
                for(int j=0; j<graph.labels.length;j++){
                    if((graph.weight[i][j] < smallest) & !(prev.contains(graph.labels[j]))){
                        smallest = graph.weight[i][j];
                        System.out.print(start + graph.labels[j] + " ");
                        prev = prev.concat(start);
                        Prim(graph, graph.labels[j],prev);
                    }
                }
            }
        }
    } 
    
    public static Graph Kruskal(Graph graph){
        
        return null;
    } 
     
    public static Graph FloydWarshall(Graph graph){
        
        return null;
    } 
}

