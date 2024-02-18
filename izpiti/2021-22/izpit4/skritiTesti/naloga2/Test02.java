
public class Test02 {

    public static void main(String[] args) {
        int m = 11;

        int[][] p0 = {
            {2, 5, 6},
            {8, 3, 3},
            {1, 7, 1},
            {0, 9, 1},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {2, 7, 9},
            {0, 2, 1},
            {1, 5, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {5, 2, 1},
            {9, 9, 1},
            {0, 2, 1},
            {1, 1, 2},
            {6, 4, 2},
            {10, 1, 1},
            {3, 10, 1},
            {8, 9, 1},
            {4, 4, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {9, 9, 2},
            {1, 10, 1},
            {7, 1, 1},
            {0, 6, 1},
            {2, 8, 3},
            {5, 6, 2},
            {8, 4, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {0, 9, 5},
            {9, 2, 2},
            {6, 5, 3},
            {5, 8, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
