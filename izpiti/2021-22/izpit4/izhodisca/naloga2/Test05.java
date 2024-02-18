
public class Test05 {

    public static void main(String[] args) {
        int m = 15;

        int[][] p0 = {
            {11, 11, 2},
            {8, 8, 1},
            {13, 8, 2},
            {5, 1, 3},
            {9, 8, 1},
            {1, 4, 1},
            {3, 8, 2},
            {2, 8, 1},
            {0, 7, 1},
            {10, 9, 1},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {2, 9, 9},
            {14, 1, 1},
            {11, 10, 2},
            {0, 14, 2},
            {13, 6, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {2, 2, 10},
            {0, 1, 2},
            {12, 8, 1},
            {13, 4, 1},
            {14, 4, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {6, 7, 1},
            {5, 14, 1},
            {14, 3, 1},
            {12, 1, 1},
            {0, 9, 1},
            {4, 5, 1},
            {1, 5, 1},
            {8, 9, 1},
            {13, 7, 1},
            {11, 9, 1},
            {3, 2, 1},
            {2, 4, 1},
            {7, 11, 1},
            {10, 5, 1},
            {9, 2, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {7, 9, 3},
            {12, 5, 1},
            {14, 13, 1},
            {3, 7, 3},
            {13, 14, 1},
            {0, 12, 3},
            {11, 12, 1},
            {10, 6, 1},
            {6, 13, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
