
public class Test05 {

    public static void main(String[] args) {
        int m = 14;

        int[][] p0 = {
            {5, 12, 2},
            {4, 13, 1},
            {9, 7, 4},
            {13, 13, 1},
            {7, 11, 1},
            {0, 11, 3},
            {8, 3, 1},
            {3, 13, 1},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {1, 5, 9},
            {10, 8, 2},
            {12, 9, 1},
            {0, 6, 1},
            {13, 8, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {6, 13, 6},
            {0, 4, 5},
            {12, 11, 1},
            {5, 8, 1},
            {13, 3, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {2, 6, 11},
            {0, 5, 2},
            {13, 2, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {3, 2, 6},
            {10, 13, 3},
            {9, 6, 1},
            {1, 13, 1},
            {13, 6, 1},
            {0, 9, 1},
            {2, 8, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
