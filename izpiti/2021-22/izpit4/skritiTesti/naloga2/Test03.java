
public class Test03 {

    public static void main(String[] args) {
        int m = 12;

        int[][] p0 = {
            {3, 10, 2},
            {7, 7, 1},
            {0, 11, 3},
            {8, 3, 1},
            {6, 10, 1},
            {11, 4, 1},
            {9, 5, 2},
            {5, 10, 1},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {3, 1, 6},
            {2, 10, 1},
            {1, 9, 1},
            {9, 4, 1},
            {10, 1, 1},
            {0, 9, 1},
            {11, 8, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {8, 8, 2},
            {3, 6, 2},
            {10, 9, 1},
            {2, 11, 1},
            {0, 3, 2},
            {5, 3, 3},
            {11, 10, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {8, 4, 2},
            {1, 6, 3},
            {6, 8, 1},
            {7, 1, 1},
            {0, 8, 1},
            {10, 3, 2},
            {4, 6, 1},
            {5, 8, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {3, 9, 4},
            {0, 4, 3},
            {9, 11, 2},
            {7, 8, 1},
            {8, 11, 1},
            {11, 10, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
