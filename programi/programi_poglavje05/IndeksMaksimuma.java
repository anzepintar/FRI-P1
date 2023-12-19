
/*
 * Indeks največjega elementa v tabeli
 */

public class IndeksMaksimuma {

    public static void main(String[] args) {
        //int[] prodaja = {10, 30, 50, 20, 40};
        int[] t = {-10, -5, -15, -3, -20, -8};
        System.out.println(indeksMaksimuma(t));
    }

    public static int indeksMaksimuma(int[] t) {
        // doslej največji element
        int najElement = t[0];

        // indeks doslej največjega elementa
        int najIndeks = 0;

        for (int i = 0;  i < t.length;  i++) {
            if (t[i] > najElement) {
                // imam nov rekord (in rekorderja)
                najElement = t[i];
                najIndeks = i;
            }
        }
        return najIndeks;
    }
}
