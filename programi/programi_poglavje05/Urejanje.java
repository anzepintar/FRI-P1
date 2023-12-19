
/*
 * Urejanje tabele z algoritmom navadnega vstavljanja
 */

import java.util.Arrays;

public class Urejanje {

    public static void main(String[] args) {
        int[] t = {80, 50, 75, 30, 45, 60, 95, 20};
        System.out.println(Arrays.toString(t));
        uredi(t);
        System.out.println(Arrays.toString(t));
    }

    public static void uredi(int[] t) {
        for (int i = 1;  i < t.length;  i++) {
            // vstavimo element t[i] v podtabelo t[0..i-1]
            // (torej v že urejeni del tabele)
            int element = t[i];
            int j = i - 1;
            while (j >= 0 && t[j] > element) {
                t[j + 1] = t[j];
                j--;
            }
            t[j + 1] = element;
        }
    }
}
