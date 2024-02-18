
public class Test12 {

    public static void main(String[] args) {
        int m = 21;

        int[][] p0 = {
            {7, 13, 4},
            {16, 10, 1},
            {5, 18, 1},
            {19, 10, 2},
            {11, 14, 2},
            {1, 8, 1},
            {3, 15, 2},
            {2, 5, 1},
            {17, 19, 1},
            {13, 1, 2},
            {15, 4, 1},
            {0, 15, 1},
            {18, 5, 1},
            {6, 18, 1},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {7, 6, 14},
            {2, 15, 3},
            {1, 10, 1},
            {5, 10, 2},
            {0, 15, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {5, 2, 8},
            {2, 10, 1},
            {13, 3, 5},
            {3, 3, 2},
            {18, 20, 2},
            {0, 7, 1},
            {1, 3, 1},
            {20, 14, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {0, 16, 5},
            {15, 18, 5},
            {7, 18, 5},
            {12, 13, 2},
            {5, 18, 2},
            {20, 18, 1},
            {14, 3, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {15, 3, 3},
            {0, 4, 5},
            {5, 18, 7},
            {18, 14, 2},
            {13, 8, 2},
            {12, 4, 1},
            {20, 17, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
