public class Tiles {
    public static int placeTiles(int n, int m) {
        // either place all the tiles horizontally or vertically (Only 2 ways are possible).
        if (n == m) {
            return 2;
        }
        // all the tiles can only be placed horizontally (Only 1 way is possible).
        if (n < m) {
            return 1;
        }

        // if tiles are vertically placed
        int vertPlacements = placeTiles(n - m, m);

        // if tiles are vertically placed
        int horPlacements = placeTiles(n - 1, m);

        // total numbers
        return vertPlacements + horPlacements;

    }

    public static void main(String[] args) {
        int n = 5, m = 4;
        System.out.println(placeTiles(n, m));
    }
}
