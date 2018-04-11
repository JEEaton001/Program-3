
import static java.lang.Integer.signum;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;



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
    
    public static void Kruskal(Graph graph){
        int n = 0;
    	PriorityQueue<edge> edges = new PriorityQueue();
        Set vertices[] = new HashSet[graph.labels.length];
        
       	for(int i = 0; i < graph.labels.length; i++){
            for (int j = 0; j < graph.labels.length; j++){
                if(graph.weight[i][j] != Integer.MAX_VALUE){
                    edges.add(new edge(graph.weight[i][j], i, j));
                }
            }
        }
       	for(int i=0; i < graph.labels.length; i++){
            vertices[i] = new HashSet();
            vertices[i].add(i);
       	}
       	while(n < graph.labels.length-1){
            edge e = edges.poll();
            int i = 0, j = 0;
            boolean found = false;
            do{
                if(vertices[i].contains(e.from)){
                    found = true;
                }else{
                    i++;
                }
            }while(found != true);
            if(!vertices[i].contains(e.to)){
                found = false;
                do{
                    if(vertices[j].contains(e.to)){
                        found = true;
                    }else{
                        j++;
                    }
                }while(found != true);
                vertices[i].addAll(vertices[j]);
                vertices[j].clear();
                n++;
                System.out.print(graph.labels[e.from]+graph.labels[e.to]+" ");
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

class edge implements Comparable<edge>{
    int weight;
    int from;
    int to;

    edge(int w, int f, int t){
            weight = w;
            from = f;
            to = t;
    }
    
    public int compareTo(edge o){
            return signum(weight-o.weight);
    }    
}
