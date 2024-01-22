import java.util.*;

public class ArticulationPoint {
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

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, int parent, int dt[], int low[], boolean vis[], int time,
            boolean ap[]) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neighbour = e.dest;

            // 1st condition
            if (parent == neighbour) {
                continue;

            }
            // 2nd condition
            else if (vis[neighbour]) {
                low[curr] = Math.min(low[curr], dt[neighbour]);
            }
            // 3rd condition
            else {
                dfs(graph, neighbour, curr, dt, low, vis, time, ap);
                low[curr] = Math.min(low[curr], low[neighbour]);
                // Articulation Condition
                if (dt[curr] <= low[neighbour] && parent != -1) {
                    ap[curr] = true;
                }
                children++;
            }
        }
        // for starting node
        if (parent == -1 && children > 1) {
            ap[curr] = true;
        }
    }

    // Time Complexity:- O(V+E)
    public static void getAP(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        boolean ap[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, low, vis, time, ap);
            }
        }

        for (int i = 0; i < V; i++) {
            if (ap[i]) {
                System.out.println("AP: " + i);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        getAP(graph, V);
    }
}