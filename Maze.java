// Advanced Recursion 2
public class Maze {
    public static int countPaths(int i, int j, int n, int m) {

        if (i == n || j == m) {
            return 0; // we are at the boundary , we are about to exit the cell.
        }
        if (i == (n - 1) && j == (m - 1)) {
            return 1; // only one path --> stay at that path
        }
        // move downwards
        int downPaths = countPaths(i + 1, j, n, m);
        // move to the right
        int rightPaths = countPaths(i, j + 1, n, m);
        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int n = 3, m = 7;
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);
    }
}
