
public class Test19 {

    public static void main(String[] args) {
        int m = 28;

        int[][] p0 = {
            {11, 12, 14},
            {4, 10, 3},
            {1, 21, 2},
            {9, 1, 1},
            {3, 12, 1},
            {8, 1, 1},
            {7, 12, 1},
            {0, 15, 1},
            {26, 11, 1},
            {27, 4, 1},
            {10, 26, 1},
            {25, 9, 1},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {3, 25, 7},
            {24, 4, 4},
            {12, 19, 6},
            {1, 9, 2},
            {21, 21, 1},
            {22, 2, 1},
            {10, 20, 1},
            {11, 19, 1},
            {18, 10, 3},
            {23, 11, 1},
            {0, 27, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {21, 11, 6},
            {8, 9, 12},
            {0, 1, 8},
            {27, 3, 1},
            {20, 2, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {3, 19, 9},
            {14, 12, 8},
            {22, 20, 3},
            {1, 5, 1},
            {13, 18, 1},
            {25, 7, 3},
            {2, 2, 1},
            {12, 12, 1},
            {0, 23, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {14, 3, 10},
            {3, 19, 9},
            {26, 4, 1},
            {13, 14, 1},
            {0, 25, 3},
            {25, 23, 1},
            {27, 24, 1},
            {12, 16, 1},
            {24, 4, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
