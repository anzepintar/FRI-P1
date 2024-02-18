
/*
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static int potZoge(int strelec, boolean[][] igralci, int smer) {
        int h = igralci.length;
        int w = igralci[0].length;
        int sx = strelec;
        int sy = h / 2 + 1;

        int razdalja = 10000;

        if (smer == 1) {
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (igralci[i][j]) {
                        int potIgralca = Math.abs(i - sy);
                        int potDoPrestreza = Math.abs(j - sx);
                        if (potIgralca < potDoPrestreza)
                            razdalja = Math.min(potDoPrestreza, razdalja);

                    }
                }
            }
        }
        if (smer == -1) {
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (igralci[i][j]) {
                        int potIgralca = Math.abs(i - sy);
                        int potDoPrestreza = Math.abs(j - sx);
                        if (potIgralca < potDoPrestreza)
                            razdalja = Math.min(potDoPrestreza, razdalja) + 1;

                    }
                }
            }
        }


        if (razdalja == 10000) {
            razdalja = Math.abs(w - sx);
        }

        /*
        while (true) {
            // premik žoge
            if (smer == 1) {
                sx++;
            } else {
                sx--;
            }
            razdalja++;
            if (igralci[sy][sx] || sx == 0 || sx == w - 1)
                break;
            // premik nogometašev

            for (int j = 0; j < w; j++) {
                for (int i = sy - 1; i > 0; i--) {
                    if (igralci[i][j]) {
                        igralci[i + 1][j] = true;
                    }
                }
                for (int i = sy + 1; i < h; i++) {
                    if (igralci[i][j]) {
                        igralci[i - 1][j] = true;
                    }
                }
            }

            if (igralci[sy][sx])
                break;
        }*/

        return razdalja;
    }

    public static void main(String[] args) {
    }
}
