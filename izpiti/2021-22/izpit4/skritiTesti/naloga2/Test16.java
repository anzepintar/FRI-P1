
public class Test16 {

    public static void main(String[] args) {
        int m = 25;

        int[][] p0 = {
            {6, 3, 17},
            {0, 4, 4},
            {23, 14, 2},
            {5, 20, 1},
            {4, 12, 1},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {13, 19, 7},
            {3, 24, 8},
            {21, 9, 3},
            {0, 11, 2},
            {11, 23, 1},
            {24, 1, 1},
            {20, 13, 1},
            {12, 7, 1},
            {2, 3, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {4, 12, 7},
            {21, 12, 2},
            {12, 23, 2},
            {16, 3, 3},
            {2, 20, 2},
            {23, 21, 2},
            {19, 10, 1},
            {0, 6, 1},
            {20, 9, 1},
            {15, 9, 1},
            {11, 18, 1},
            {1, 17, 1},
            {14, 8, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {8, 13, 8},
            {0, 10, 2},
            {24, 3, 1},
            {2, 10, 6},
            {19, 3, 2},
            {18, 14, 1},
            {22, 21, 1},
            {21, 1, 1},
            {16, 21, 2},
            {23, 20, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {11, 10, 11},
            {1, 11, 1},
            {4, 11, 7},
            {3, 13, 1},
            {22, 21, 3},
            {2, 6, 1},
            {0, 23, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
