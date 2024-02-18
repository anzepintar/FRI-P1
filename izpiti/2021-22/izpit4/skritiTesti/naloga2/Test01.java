
public class Test01 {

    public static void main(String[] args) {
        int m = 10;

        int[][] p0 = {
            {2, 4, 7},
            {0, 8, 1},
            {1, 4, 1},
            {9, 3, 1},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {3, 5, 4},
            {7, 9, 1},
            {1, 6, 2},
            {8, 8, 2},
            {0, 2, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {1, 8, 2},
            {4, 6, 4},
            {8, 6, 1},
            {3, 4, 1},
            {9, 3, 1},
            {0, 5, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {4, 8, 1},
            {0, 9, 4},
            {5, 6, 2},
            {7, 3, 2},
            {9, 6, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {0, 4, 9},
            {9, 4, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
