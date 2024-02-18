
public class Test07 {

    public static void main(String[] args) {
        int m = 20;

        int[][] p = new int[0][3];
        System.out.println(Druga.najGlobina(m, p));

        int[][] q = {{0, 2, 9}, {10, 3, 10}};
        System.out.println(Druga.najGlobina(m, q));

        int[][] r = {
            {0, 1, 14},
            {2, 3, 14},
            {4, 5, 14},
            {6, 7, 14},
            {4, 9, 14},
            {2, 11, 14},
            {0, 13, 14},
            {2, 15, 14},
            {4, 17, 14},
            {6, 19, 14},
        };
        System.out.println(Druga.najGlobina(m, r));
    }
}
