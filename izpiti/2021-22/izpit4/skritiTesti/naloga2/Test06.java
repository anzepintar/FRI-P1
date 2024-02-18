
public class Test06 {

    public static void main(String[] args) {
        int m = 15;

        int[][] p0 = {
            {8, 7, 7},
            {6, 14, 2},
            {1, 9, 4},
            {0, 13, 1},
            {5, 10, 1},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {6, 9, 2},
            {10, 7, 1},
            {13, 10, 1},
            {1, 5, 4},
            {11, 10, 1},
            {5, 2, 1},
            {12, 2, 1},
            {8, 7, 1},
            {0, 8, 1},
            {9, 11, 1},
            {14, 4, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {2, 8, 5},
            {11, 7, 3},
            {9, 3, 2},
            {7, 9, 1},
            {8, 13, 1},
            {1, 6, 1},
            {0, 2, 1},
            {14, 5, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {5, 14, 2},
            {0, 2, 3},
            {9, 1, 3},
            {7, 7, 1},
            {12, 13, 1},
            {3, 1, 2},
            {8, 3, 1},
            {13, 1, 2},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {7, 4, 4},
            {2, 3, 1},
            {11, 4, 3},
            {3, 4, 1},
            {5, 7, 1},
            {14, 14, 1},
            {0, 12, 1},
            {1, 3, 1},
            {6, 6, 1},
            {4, 2, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
