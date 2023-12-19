
/*
 * Iskanje elementa v poljubni (lahko tudi neurejeni) tabeli.
 */

public class Iskanje {

    public static void main(String[] args) {
        int[] t = {10, 20, 30, 35, 40, 45, 50, 60, 65, 70};
        System.out.println(poisci(t, 35));
        System.out.println(poisci(t, 55));
    }

    // Vrne indeks elementa x v podani tabeli oziroma -1, če ga ni.
    public static int poisci(int[] t, int x) {
        for (int i = 0;  i < t.length;  i++) {
            if (t[i] == x) {
                return i;
            }
        }
        // če pridemo do te točke, vemo, da iskanega elementa ni v 
        // tabeli, zato vrnemo -1.
        return -1;
    }
}
