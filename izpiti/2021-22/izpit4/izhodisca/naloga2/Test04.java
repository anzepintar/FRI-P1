
public class Test04 {

    public static void main(String[] args) {
        int m = 11;

        int[][] p0 = {
            {3, 9, 8},
            {0, 5, 3},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {5, 9, 4},
            {9, 7, 2},
            {1, 8, 4},
            {0, 5, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {1, 9, 5},
            {0, 3, 1},
            {7, 7, 1},
            {8, 6, 1},
            {9, 4, 1},
            {6, 3, 1},
            {10, 10, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {0, 5, 8},
            {8, 1, 3},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {6, 8, 1},
            {1, 8, 2},
            {0, 4, 1},
            {9, 7, 2},
            {4, 2, 1},
            {5, 4, 1},
            {8, 8, 1},
            {7, 9, 1},
            {3, 1, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
