import java.util.*;

public class GraphTraversalDFS {
    static class Edge {
        int src;
        int destination;

        public Edge(int s, int d) {
            this.src = s;
            this.destination = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        // Changing the value of the null value to an empty value.
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));


        graph[6].add(new Edge(6, 5));
    }

    public static void dfs(ArrayList<Edge> graph[],int curr, boolean vis[]){
        // 1. print the current node
        System.out.print(curr+" ");
        // 2. Mark the current node as true
        vis[curr] = true;
        // 3. Visit the neighbour
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.destination] == false){
                dfs(graph,e.destination,vis);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        /*
                1 --- 3
               /      | \
              0       |  5 -- 6
               \      | /
                2 --- 4
        */

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean vis[] = new boolean[V];
        dfs(graph, 0,vis);
        System.out.println();
    }
}
