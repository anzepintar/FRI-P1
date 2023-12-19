
/*
 * Metoda, ki na podlagi regularne neizrojene tabele <ocena> tipa int[][][]
 * (element (d, l, p) podaja oceno dijaka <d> v letniku <l> pri predmetu <p>)
 * zgradi tabelo tipa int[][], v kateri element (p, l) podaja število dijakov,
 * ki so predmet <p> v letniku <l> zaključili z oceno 5
 */

public class Petkarji {

    public static void main(String[] args) {
        int[][][] ocena = {
            {{5, 3, 5}, {2, 5, 3}, {4, 4, 5}, {5, 4, 5}},
            {{2, 4, 3}, {3, 5, 3}, {2, 2, 5}, {3, 5, 3}},
            {{4, 5, 2}, {5, 5, 5}, {4, 3, 5}, {5, 5, 5}},
            {{4, 3, 4}, {5, 3, 4}, {2, 5, 5}, {3, 5, 5}},
            {{3, 5, 5}, {5, 5, 4}, {3, 4, 5}, {4, 3, 5}},
        };

        int[][] petke = petkarji(ocena);
        for (int p = 0; p < petke.length; p++) {
            for (int l = 0; l < petke[p].length; l++) {
                System.out.printf("%3d", petke[p][l]);
            }
            System.out.println();
        }
    }

    //
    // Metoda, ki je opisana v komentarju v glavi datoteke
    //
    public static int[][] petkarji(int[][][] ocena) {
        int stDijakov = ocena.length;
        int stLetnikov = ocena[0].length;
        int stPredmetov = ocena[0][0].length;
        int[][] rezultat = new int[stPredmetov][stLetnikov];

        for (int p = 0; p < stPredmetov; p++) {
            for (int l = 0; l < stLetnikov; l++) {
                int stPetkarjev = 0;
                for (int d = 0; d < stDijakov; d++) {
                    if (ocena[d][l][p] == 5) {
                        stPetkarjev++;
                    }
                }
                rezultat[p][l] = stPetkarjev;
            }
        }
        return rezultat;
    }
}
