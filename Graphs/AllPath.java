import java.util.*;
public class AllPath {
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

    // Modified DFS
    // Time Complexity :- O(V^V)
    // Good for small-sized graph
    // src == curr in the first call
    public static void printAllPath(ArrayList<Edge> graph[], boolean vis[],int curr, String path, int tar){
        if(curr == tar){
            System.out.println(path);
            return;
        }

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            // If neighbour is not visited, then mark the function as true and call the function for the neighbour.
            if(vis[e.destination] == false){
                vis[e.destination] = true;
                printAllPath(graph, vis, e.destination, path+e.destination, tar);
                // Mark the  neighbour as unvisited (For backtracking)
                vis[e.destination] = false;
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

        int src = 0;
        int tar = 6;
        boolean vis[] = new boolean[V];
        vis[src] = true;
        printAllPath(graph, vis, src, ""+src, tar);
    }
}
