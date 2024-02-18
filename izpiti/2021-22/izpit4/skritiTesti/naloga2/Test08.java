
public class Test08 {

    public static void main(String[] args) {
        int m = 17;

        int[][] p0 = {
            {8, 4, 5},
            {14, 4, 3},
            {13, 2, 1},
            {0, 15, 8},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {5, 7, 1},
            {3, 6, 1},
            {1, 14, 1},
            {15, 15, 1},
            {12, 2, 1},
            {9, 8, 1},
            {0, 2, 1},
            {11, 11, 1},
            {10, 14, 1},
            {2, 9, 1},
            {13, 9, 1},
            {4, 11, 1},
            {8, 6, 1},
            {14, 7, 1},
            {16, 12, 1},
            {7, 7, 1},
            {6, 15, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {5, 2, 2},
            {1, 15, 3},
            {14, 6, 2},
            {11, 14, 3},
            {16, 5, 1},
            {8, 10, 2},
            {10, 1, 1},
            {4, 2, 1},
            {0, 4, 1},
            {7, 10, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {3, 3, 4},
            {0, 7, 2},
            {14, 5, 2},
            {10, 12, 3},
            {8, 8, 2},
            {2, 1, 1},
            {13, 6, 1},
            {7, 16, 1},
            {16, 3, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {0, 10, 4},
            {7, 1, 7},
            {14, 3, 3},
            {4, 1, 2},
            {6, 3, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
