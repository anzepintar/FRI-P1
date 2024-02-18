
public class Test11 {

    public static void main(String[] args) {
        int m = 20;

        int[][] p0 = {
            {0, 8, 9},
            {12, 8, 7},
            {10, 14, 1},
            {9, 19, 1},
            {19, 9, 1},
            {11, 11, 1},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {6, 17, 1},
            {1, 5, 3},
            {17, 2, 1},
            {8, 14, 4},
            {13, 14, 3},
            {5, 11, 1},
            {18, 7, 1},
            {4, 10, 1},
            {12, 16, 1},
            {19, 5, 1},
            {7, 18, 1},
            {16, 9, 1},
            {0, 17, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {0, 4, 17},
            {18, 17, 2},
            {17, 5, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {1, 17, 4},
            {14, 12, 4},
            {6, 4, 4},
            {12, 6, 2},
            {10, 3, 1},
            {18, 12, 2},
            {0, 12, 1},
            {5, 1, 1},
            {11, 4, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {10, 14, 1},
            {2, 3, 2},
            {7, 12, 2},
            {15, 14, 2},
            {18, 3, 1},
            {12, 15, 2},
            {4, 9, 1},
            {11, 4, 1},
            {19, 3, 1},
            {14, 19, 1},
            {9, 5, 1},
            {6, 19, 1},
            {0, 16, 2},
            {17, 16, 1},
            {5, 4, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
