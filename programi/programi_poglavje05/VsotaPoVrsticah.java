
/*
 * Tabela vsot posameznih vrstic dvodimenzionalne tabele
 */

import java.util.Arrays;

public class VsotaPoVrsticah {

    public static void main(String[] args) {
        int[][] t = {
            {2, 3, -1, -4, 0},
            {7, -2, -4, 3, 8},
            {-6, 9, -3, 5, -7},
            {3, -1, -7, 6, 4}
        };

        int[] vsota = vsotaPoVrsticah(t);
        System.out.println(Arrays.toString(vsota));
    }

    public static int[] vsotaPoVrsticah(int[][] t) {
        int[] rezultat = new int[t.length];

        for (int i = 0;  i < t.length;  i++) {
            // izračunamo vsoto tabele t[i] ...
            int vsota = 0;
            for (int j = 0;  j < t[i].length;  j++) {
                vsota += t[i][j];
            }
            // ... in jo shranimo v celico rezultat[i]
            rezultat[i] = vsota;
        }
        return rezultat;
    }
}
