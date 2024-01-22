import java.util.*;

public class CycleDetectionDisconnectedGraph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    // Time Complexity:-O(V+E)
    public static boolean isCycle(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]) {
        vis[curr] = true;
        rec[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // Cycle condition
            if (rec[e.dest]) {
                return true; // cycle exists
            } else if (!vis[e.dest]) {
                if (isCycle(graph, vis, e.dest, rec)) {
                    return true;
                }
            }
        }
        rec[curr] = false;
        return false; // no cycle detects
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        boolean vis[] = new boolean[V];
        boolean rec[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                boolean cycle = isCycle(graph, vis, i, rec);
                if(cycle){
                    System.out.println(cycle);
                    break; // only for one cycle
                }
            }
        }
    }
}
