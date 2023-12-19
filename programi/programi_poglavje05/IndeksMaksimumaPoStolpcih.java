
/*
 * Tabela indeksov maksimumov v posameznih stolpcih pravokotne
 * dvodimenzionalne tabele. (Zavedajmo se, da stolpci v resnici ne obstajajo
 * -- gre zgolj za miselni konstrukt!)
 */

import java.util.Arrays;

public class IndeksMaksimumaPoStolpcih {

    public static void main(String[] args) {
        int[][] t = {
            {2, 3, -1, -4, 0},
            {7, -2, -4, 3, 8},
            {-6, 9, -3, 5, -7},
            {3, -1, -7, 6, 4}
        };

        int[] imax = imaxPoStolpcih(t);
        System.out.println(Arrays.toString(imax));
    }

    public static int[] imaxPoStolpcih(int[][] t) {
        // predpostavka: tabela ima vsaj eno vrstico, poleg tega
        // pa so vse vrstice enako dolge
        int stStolpcev = t[0].length;
        int[] rezultat = new int[stStolpcev];

        for (int j = 0;  j < stStolpcev;  j++) {
            // poiščemo indeks maksimuma v stolpcu z indeksom j ...
            int imax = 0;
            for (int i = 1;  i < t.length;  i++) {
                if (t[i][j] > t[imax][j]) {
                    imax = i;
                }
            }
            // ... in ga shranimo v celico rezultat[j]
            rezultat[j] = imax;
        }

        return rezultat;
    }
}
