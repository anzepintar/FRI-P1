
/*
 * Če ima prebrano število prijatelja, ga izpiše, sicer pa izpiše, da nima
 * prijatelja.
 */

import java.util.Scanner;

public class Prijatelj {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stevilo = sc.nextInt();
        if (imaPrijatelja(stevilo)) {
            System.out.println(vsotaDeliteljev(stevilo));
        } else {
            System.out.println("Nima prijatelja");
        }
    }

    // Vrne true natanko v primeru, če ima število <n> prijatelja.
    public static boolean imaPrijatelja(int n) {
        // edini kandidat za prijatelja števila <n> je število S(n)
        int kandidat = vsotaDeliteljev(n);

        // ali je <kandidat> dejansko prijatelj števila <n>?
        /*
        if (kandidat != n && vsotaDeliteljev(kandidat) == n) {
            return true;
        } else {
            return false;
        }
        */
        return kandidat != n && vsotaDeliteljev(kandidat) == n;
    }

    // Vrne vsoto deliteljev podanega števila brez števila samega.
    public static int vsotaDeliteljev(int stevilo) {
        int vsota = 0;
        for (int d = 1;  d < stevilo;  d++) {
            if (stevilo % d == 0) {
                vsota += d;
            }
        }
        return vsota;
    }
}
