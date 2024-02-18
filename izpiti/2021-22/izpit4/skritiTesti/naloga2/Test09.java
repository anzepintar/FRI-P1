
public class Test09 {

    public static void main(String[] args) {
        int m = 18;

        int[][] p0 = {
            {0, 5, 11},
            {15, 11, 3},
            {11, 7, 2},
            {13, 17, 2},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {10, 11, 1},
            {3, 13, 2},
            {12, 3, 2},
            {9, 14, 1},
            {0, 4, 2},
            {6, 2, 1},
            {7, 12, 1},
            {8, 15, 1},
            {15, 2, 1},
            {14, 15, 1},
            {17, 3, 1},
            {5, 1, 1},
            {16, 2, 1},
            {11, 14, 1},
            {2, 13, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {2, 5, 12},
            {15, 2, 1},
            {0, 9, 1},
            {17, 13, 1},
            {1, 6, 1},
            {16, 3, 1},
            {14, 17, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {10, 2, 1},
            {0, 17, 1},
            {3, 9, 2},
            {13, 10, 2},
            {15, 13, 1},
            {8, 13, 2},
            {1, 10, 2},
            {16, 12, 2},
            {7, 16, 1},
            {11, 9, 2},
            {5, 2, 1},
            {6, 11, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {3, 13, 11},
            {16, 17, 1},
            {0, 12, 3},
            {17, 12, 1},
            {15, 4, 1},
            {14, 6, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
