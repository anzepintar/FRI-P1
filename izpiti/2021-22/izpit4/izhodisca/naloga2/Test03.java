
public class Test03 {

    public static void main(String[] args) {
        int m = 20;

        int[][] p = {{0, 7, 20}};
        System.out.println(Druga.najGlobina(m, p));

        int[][] q = {{0, 15, 10}, {10, 14, 10}};
        System.out.println(Druga.najGlobina(m, q));

        int[][] r = {{7, 10, 6}, {3, 9, 4}, {13, 11, 7}, {0, 8, 3}};
        System.out.println(Druga.najGlobina(m, r));
    }
}
