

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
                    if((graph.weight[i][j] < smallest) && !(prev.contains(graph.labels[j]))){
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
        int n = 0;
    	PriorityQueue edges = new PriorityQueue;
        Graph MST = new Graph(graph.labels){
        
       	for(int i = 0, i < graph.labels.length, i++){
       		for (int j = 0, j < graph.labels.length, j++){
       			if(weight[i][j] != Integer.MAX_VALUE){
       				edges.add()
       			}
       		}
        }
    } 
     
    public static void FloydWarshall(Graph graph){
        for(int i=0; i<graph.labels.length;i++){
            graph.weight[i][i] = 0;
        }
        graph.PrintGraph();
        for(int k=0; k<graph.labels.length;k++){ 
            for(int i=0; i<graph.labels.length;i++){
                for(int j=0; j<graph.labels.length;j++){
                    if(graph.weight[i][j] > (graph.weight[i][k]+graph.weight[k][j])){
                        if((graph.weight[i][k] != Integer.MAX_VALUE) & (graph.weight[k][j] != Integer.MAX_VALUE)){
                            graph.weight[i][j] = (graph.weight[i][k]+graph.weight[k][j]);
                            graph.PrintGraph();
                        }
                    }
                }
            }
        }
    } 
}

