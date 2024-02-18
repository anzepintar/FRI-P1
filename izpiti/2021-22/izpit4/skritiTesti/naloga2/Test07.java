
public class Test07 {

    public static void main(String[] args) {
        int m = 16;

        int[][] p0 = {
            {8, 14, 4},
            {4, 9, 2},
            {14, 10, 1},
            {13, 3, 1},
            {1, 11, 1},
            {6, 2, 1},
            {2, 12, 2},
            {7, 13, 1},
            {12, 9, 1},
            {0, 12, 1},
            {15, 1, 1},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {9, 15, 2},
            {5, 5, 4},
            {11, 6, 3},
            {14, 12, 2},
            {1, 1, 1},
            {2, 14, 1},
            {4, 10, 1},
            {0, 3, 1},
            {3, 11, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {11, 5, 1},
            {5, 2, 5},
            {10, 2, 1},
            {12, 5, 3},
            {1, 1, 2},
            {4, 5, 1},
            {3, 8, 1},
            {0, 5, 1},
            {15, 3, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {7, 3, 8},
            {1, 1, 6},
            {0, 2, 1},
            {15, 14, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {10, 15, 1},
            {2, 8, 1},
            {7, 9, 1},
            {14, 7, 1},
            {15, 1, 1},
            {6, 7, 1},
            {11, 2, 1},
            {12, 10, 1},
            {9, 8, 1},
            {1, 15, 1},
            {3, 7, 1},
            {8, 8, 1},
            {13, 3, 1},
            {5, 15, 1},
            {4, 11, 1},
            {0, 9, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
