
/*
 * Dvojiško iskanje elementa v urejeni tabeli.
 */

public class DvojiskoIskanje {

    public static void main(String[] args) {
        int[] t = {10, 20, 30, 35, 40, 45, 50, 60, 65, 70};
        System.out.println(poisci(t, 35));
        System.out.println(poisci(t, 55));
    }

    // Vrne indeks elementa x v podani tabeli oziroma -1, če ga ni.
    public static int poisci(int[] t, int x) {
        int lm = 0;             // indeks prvega elementa v še ne izločenem delu tabele
        int dm = t.length - 1;  // indeks zadnjega elementa v še ne izločenem delu tabele

        while (lm <= dm) {
            int s = (lm + dm) / 2;   // indeks sredinskega elementa v še ne izločenem delu tabele
            if (t[s] == x) {
                // element smo našli, njegov indeks je s
                return s;
            }
            if (t[s] < x) {  // izločimo levo polovico tabele
                lm = s + 1;
            } else {         // izločimo desno polovico tabele
                dm = s - 1;
            }
        }
        // če pridemo do tod, vemo, da elementa ni v tabeli
        return -1;
    }
}
