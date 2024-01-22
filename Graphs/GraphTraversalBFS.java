import java.util.*;

public class GraphTraversalBFS {
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

    // Time Complexity- O(V+E)
    public static void bfs(ArrayList<Edge> graph[],int V){
        Queue<Integer> queue = new LinkedList<>();
        boolean vis[] = new boolean[V];

        // By Convention, we take the starting node as Node-0

        queue.add(0);
        while(!queue.isEmpty()){
            int curr = queue.remove();
            if(vis[curr] == false){
                // 1. print the node
                System.out.print(curr+" ");
                // 2. Mark the node as visited i.e true
                vis[curr] = true;
                // add all the neighbours in the Queue
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    queue.add(e.destination);
                }
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
        bfs(graph, V);
        System.out.println();
    }
}
