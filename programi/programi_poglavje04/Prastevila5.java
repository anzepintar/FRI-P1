
/*
 * Program za izpis praštevil od 2 do <n>, ki si pomaga z metodo za
 * preverjanje, ali je podano liho število praštevilo
 */

import java.util.Scanner;

public class Prastevila5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(2);

        for (int kandidat = 3;  kandidat <= n;  kandidat += 2) {
            if (jePrastevilo(kandidat)) {
                System.out.println(kandidat);
            }
        }
    }

    // Vrne true natanko v primeru, če je podano liho število
    // praštevilo.
    public static boolean jePrastevilo(int n) {
        // boolean prastevilo = true;

        int zgornjaMeja = (int) Math.round(Math.sqrt(n));
        for (int d = 3;  d <= zgornjaMeja;  d += 2) {
            if (n % d == 0) {
                // prastevilo = false;
                // break;
                return false;
            }
        }
        // če prispemo do te točke, vemo, da je število <n>
        // praštevilo

        // return prastevilo;
        return true;
    }
}
