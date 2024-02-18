
public class Test04 {

    public static void main(String[] args) {
        int m = 13;

        int[][] p0 = {
            {6, 2, 4},
            {2, 4, 4},
            {11, 1, 1},
            {12, 1, 1},
            {0, 4, 1},
            {1, 1, 1},
            {10, 7, 1},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {4, 3, 7},
            {2, 2, 2},
            {0, 11, 2},
            {12, 2, 1},
            {11, 3, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {3, 5, 8},
            {0, 8, 2},
            {2, 10, 1},
            {12, 4, 1},
            {11, 9, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {8, 12, 2},
            {1, 7, 1},
            {4, 1, 2},
            {3, 10, 1},
            {6, 6, 1},
            {10, 7, 1},
            {7, 3, 1},
            {0, 3, 1},
            {11, 8, 1},
            {2, 1, 1},
            {12, 3, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {4, 9, 1},
            {5, 6, 3},
            {1, 5, 1},
            {10, 9, 3},
            {3, 9, 1},
            {0, 12, 1},
            {2, 9, 1},
            {9, 4, 1},
            {8, 11, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
