import java.util.*;

public class KosarajuAlgo {
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
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void topSort(ArrayList<Edge> graph[], int curr, boolean[] vis, Stack<Integer> stack) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSort(graph, e.dest, vis, stack);
            }
        }
        stack.push(curr);
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        vis[curr] = true;
        System.out.print(curr + " ");
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void kosaAlgo(ArrayList<Edge> graph[], int V) {
        // 1st step O(V+E)
        Stack<Integer> stack = new Stack<>();
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topSort(graph, i, vis, stack);
            }
        }

        // 2nd step O(V+E)
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for (int i = 0; i < transpose.length; i++) {
            // Reusing the visited array as false
            vis[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }
        // Iterate each vertex
        for (int i = 0; i < V; i++) {
            // Find the neighbours of each vertex
            for (int j = 0; j < graph[i].size(); i++) {
                Edge e = graph[i].get(j);
                // In graph : e.src -> e.dest
                // In transpose graph : e.dest -> e.src
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // 3rd step O(V+E)
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (!vis[curr]) {
                dfs(transpose, curr, vis);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kosaAlgo(graph, V);
    }
}