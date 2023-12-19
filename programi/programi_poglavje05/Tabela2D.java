
/*
 * Izpis elementov dvodimenzionalne tabele (pravilneje: tabele kazalcev na
 * tabele) z zanko po indeksih in zanko po elementih (for-each)
 */

public class Tabela2D {

    public static void main(String[] args) {
        int[][] t = {
            {1, 2, 3, 4},
            {-5, 6, -10, 0},
            {13, 2, 5, 8}
        };

        // i teče po indeksih vrstic
        for (int i = 0;  i < t.length;  i++) {

            // j teče po indeksih elementov i-te vrstice
            for (int j = 0;  j < t[i].length;  j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // for-each

        for (int[] vrstica: t) {
            for (int element: vrstica) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
