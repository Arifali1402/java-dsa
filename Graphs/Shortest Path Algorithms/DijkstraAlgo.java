import java.util.*;

class DijkstraAlgo {
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

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int distance;

        public Pair(int n, int d) {
            this.node = n;
            this.distance = d;
        }

        @Override
        public int compareTo(Pair p2) {
            // for ascending order
            return this.distance - p2.distance;

            // for descending order
            // return p2.dist - this.dist;
        }
    }

    // Time Complexity:- O(E + ElogV)
    public static void dijkstra(ArrayList<Edge> graph[], int src, int V) {
        // 1. Make a priority queue to store pairs
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        // 2. Create a distance array and initialize it with infinity
        int dist[] = new int[V];
        for (int i = 0; i < V; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        // 3. Create a visited array (Initialize with false)
        boolean vis[] = new boolean[V];

        // 4. Add the src node to the priority queue
        pq.add(new Pair(src, 0));

        // 5. Write the modified code of bfs
        // While the priority queue is not empty
        while (!pq.isEmpty()) {
            // Take out the current pair from the priority queue
            Pair curr = pq.remove();
            // if not visited, do all the operations
            if (!vis[curr.node]) {
                vis[curr.node] = true;
                // neighbours of the current node
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.destination;
                    // Relaxation
                    if (dist[u] + e.weight < dist[v]) {
                        dist[v] = dist[u] + e.weight;
                        // Add new pair in the Priority Queue where 'v' is the new node and 'dist[v]' is
                        // the new distance
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        dijkstra(graph, 0, V);
    }
}