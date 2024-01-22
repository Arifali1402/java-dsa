import java.util.*;

public class BellmanFordAlgo {
    static class Edge {
        int src;
        int destination;
        int weight;;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.destination = d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    // Time Complexity:- O(V.E)
    public static void bellmanFord(ArrayList<Edge> graph[], int src, int V) {
        // Initialize the dist[] array
        int dist[] = new int[V];
        for (int i = 0; i < V; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        // Outer loop that runs 'V-1' times
        // Time complexity:- O(V)
        for (int k = 0; k < V - 1; k++) {
            // Inner loop for counting edges
            // Time Complexity:- O(E)
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    int u = e.src;
                    int v = e.destination;
                    // Relaxation plus an additional condition
                    // When the result exceeds the maximum value an int can hold, it wraps around to
                    // the minimum value representable by an int due to the way integer overflow is
                    // handled in Java. This is known as integer wrapping or overflow behavior.
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + e.weight < dist[v]) {
                        dist[v] = dist[u] + e.weight;
                    }
                }
            }
        }
        // Iterate thw loop one more time for detecting the 'Negative weight Cycle' in
        // the Graph
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                int u = e.src;
                int v = e.destination;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + e.weight < dist[v]) {
                    System.out.println("Negative weight Cycle Exists...");
                }
            }
        }
        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bellmanFord(graph, 0, V);
    }
}
