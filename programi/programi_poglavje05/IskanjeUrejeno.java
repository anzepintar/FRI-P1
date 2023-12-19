
/*
 * Naivno (linearno) iskanje elementa v urejeni tabeli.
 */

public class IskanjeUrejeno {

    public static void main(String[] args) {
        int[] t = {10, 20, 30, 35, 40, 45, 50, 60, 65, 70};
        System.out.println(poisci(t, 35));
        System.out.println(poisci(t, 55));
    }

    // Vrne indeks elementa x v podani tabeli oziroma -1, če ga ni.
    public static int poisci(int[] t, int x) {
        int i = 0;
        while (i < t.length && t[i] < x) {
            i++;
        }
        return (i < t.length && t[i] == x) ? (i) : (-1);
    }
}
