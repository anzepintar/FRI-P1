
public class Test15 {

    public static void main(String[] args) {
        int m = 24;

        int[][] p0 = {
            {15, 6, 6},
            {0, 15, 7},
            {21, 2, 2},
            {7, 17, 5},
            {14, 6, 1},
            {12, 14, 2},
            {23, 11, 1},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {3, 18, 7},
            {18, 6, 5},
            {10, 6, 7},
            {1, 23, 2},
            {17, 15, 1},
            {23, 9, 1},
            {0, 18, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {9, 19, 13},
            {1, 13, 4},
            {8, 22, 1},
            {22, 21, 2},
            {7, 14, 1},
            {0, 11, 1},
            {6, 20, 1},
            {5, 10, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {0, 19, 5},
            {15, 7, 1},
            {11, 6, 4},
            {19, 15, 5},
            {16, 4, 2},
            {7, 4, 2},
            {5, 2, 1},
            {9, 20, 2},
            {18, 8, 1},
            {6, 9, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {6, 1, 2},
            {16, 5, 3},
            {13, 20, 1},
            {19, 23, 3},
            {2, 17, 2},
            {22, 2, 2},
            {4, 9, 1},
            {8, 17, 2},
            {1, 21, 1},
            {10, 21, 3},
            {5, 1, 1},
            {15, 8, 1},
            {0, 16, 1},
            {14, 21, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
