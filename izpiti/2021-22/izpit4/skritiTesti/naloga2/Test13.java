
public class Test13 {

    public static void main(String[] args) {
        int m = 22;

        int[][] p0 = {
            {8, 1, 4},
            {3, 10, 3},
            {13, 20, 9},
            {2, 9, 1},
            {12, 20, 1},
            {1, 4, 1},
            {7, 12, 1},
            {0, 19, 1},
            {6, 7, 1},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {2, 10, 6},
            {17, 15, 2},
            {11, 15, 1},
            {12, 5, 1},
            {8, 14, 2},
            {16, 6, 1},
            {19, 19, 2},
            {13, 7, 2},
            {15, 6, 1},
            {0, 6, 2},
            {10, 13, 1},
            {21, 14, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {5, 18, 1},
            {7, 8, 4},
            {19, 6, 2},
            {11, 5, 8},
            {1, 1, 2},
            {3, 1, 2},
            {0, 5, 1},
            {21, 1, 1},
            {6, 8, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {3, 15, 17},
            {1, 4, 1},
            {20, 15, 2},
            {2, 14, 1},
            {0, 5, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {6, 13, 7},
            {14, 20, 3},
            {18, 21, 2},
            {20, 21, 1},
            {2, 1, 3},
            {0, 12, 1},
            {17, 7, 1},
            {13, 2, 1},
            {21, 2, 1},
            {5, 7, 1},
            {1, 20, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
